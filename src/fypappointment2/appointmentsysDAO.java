/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fypappointment2;

/**
 *
 * @author KaizoDono
 */

import javaBean.lecturer;
import javaBean.users;
import javaBean.student;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javaBean.appointment;
import javaBean.schedule;
import javax.swing.JOptionPane;

public class appointmentsysDAO 
{
    private static List<users> database = new ArrayList<users>();
    private static List<schedule> scheduleTable = new ArrayList<schedule>();
    private static List<appointment> appointmentTable = new ArrayList<appointment>();
    
    public appointmentsysDAO()
    {
       
    }
    //main methods
    public static void main(String args[])
    {
        Login ms = new Login();
        ms.setVisible(true);
        starting();
        
    }
    // Metho that initializa the default data value
    public static void starting()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	LocalDate localDate = LocalDate.now(); 
        
        users staff = new users("S49133", "akmal", "1234", "Muhammad Akmal", "Che Rosli", "Male"
                , "Lot 3188,Jalan Kota Bharu", "014-8240643", "bleachakmal@gmail.com", "admin", dtf.format(localDate));
        student students = new student("S46721", "yusoff", "1234", "Tengku", "yusoff", "Male"
                , "Kelantan", "014-8240643", "nike@gmail.com", "student", dtf.format(localDate), "PPIMG", "Software Engineering", "Dr Fouad");
        lecturer lecturers = new lecturer("12345", "Dr Fouad", "1234", "Fouad", "Abdulameer", "Male"
                , "Iraq", "014-8240643", "fouadaug@gmail.com", "lecturer", dtf.format(localDate), "PPIMG", "yusoff");   
        
        users type[] = new users[3];
        type[0] = staff;
        type[1] = students;
        type[2] = lecturers;
        
        database.add(type[0]);
        database.add(type[1]);
        database.add(type[2]);
    }

    //testing methods if data is inserted or not
    public static void veiwUser()
    {
        for(users s:database)
        {
           System.out.println(s.getUserID()+" , "+s.getUsername()+" , "+s.getFname()+" , "+s.getLname()+" , "+s.getGender()
                   +" , "+s.getUserLevel());
        }
      
    }
    
    //method that user to verify user login return thes username and status
    public String[] verifyUser(String id, String pass) throws InputMismatchException
    {
        String status[] = new String[2];
        int i = 0;
        try
        {
            for(users s:database)
            {
                if(s.getUserID().equals(id) && s.getPassword().equals(pass))
                {  
                    if(s.getUserLevel().equals("admin"))
                    {
                        status[0] = s.getUsername();
                        status[1] = s.getUserLevel();
                        return status;
                    }
                    else if(s.getUserLevel().equals("student"))
                    {
                        status[0] = s.getUsername();
                        status[1] = s.getUserLevel();
                        return status;
                    }
                    else if(s.getUserLevel().equals("lecturer"))
                    {
                        status[0] = s.getUsername();
                        status[1] = s.getUserLevel();
                        return status;
                    }
                }
                else 
                {
                    i=1;   
                }
            }
            if(i==1)
            {
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null,"Wrong Password or Username!!", "", JOptionPane.ERROR_MESSAGE);
        }
        return status;
    }
    
    //method to register student return number 
    public static int registerStudent(student u, String level)
    {
        int i = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	LocalDate localDate = LocalDate.now();
        String usrlevel = level;
        
        try
        {
            if((!u.equals(null)) && usrlevel.equals("student"))
            {
                i++;//polymorphic
                users students = new student(u.getUserID(), u.getUsername(), u.getPassword(), u.getFname(), u.getLname()
                    , u.getGender(), u.getAddress(), u.getPhoneNum(), u.getEmail(), u.getUserLevel(), dtf.format(localDate)
                    , u.getFaculty(), u.getProgram(), u.getSupervisor());    
               
                database.add(students);      
            }
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"Please Fill all the Fields!!", "", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }
    
    //method to register lecturer 
    public static int registerLecturer(lecturer u, String level)
    {
        int i = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	LocalDate localDate = LocalDate.now();
        String usrlevel = level;
        
        try
        {
            if((!u.equals(null)) && usrlevel.equals("lecturer"))
            {
                i++;//polymorphic
                users lecturers = new lecturer(u.getUserID(), u.getUsername(), u.getPassword(), u.getFname(), u.getLname()
                    , u.getGender(), u.getAddress(), u.getPhoneNum(), u.getEmail(), u.getUserLevel(), dtf.format(localDate)
                    , u.getFaculty(), u.getSupervise());    
               
                database.add(lecturers);      
            }
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"Please Fill all the Fields!!", "", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    } 
    
    //return list of lecturer use to set value in the combo Box
    public static ArrayList<lecturer> getLecturerList()
    {
        ArrayList<lecturer> User = new ArrayList<>();
        lecturer l = null;
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserLevel().equals("lecturer"))
            {
                l = new lecturer();
                l.setUserID(database.get(i).getUserID());
                l.setUsername(database.get(i).getUsername());
                User.add(l);                    
            }             
        }
        return User;
    }  
    
    // return list of student to the combobox value
    public static ArrayList<student> getStudentList()
    {
        ArrayList<student> User = new ArrayList<>();
        student s = null;
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserLevel().equals("student"))
            {
                s = new student();
                s.setUserID(database.get(i).getUserID());
                s.setUsername(database.get(i).getUsername());
                User.add(s);                    
            }             
        }
        return User;
    }
    
    //view all register lecturer student and admin
    public static ArrayList<users> getveiwUser()
    {
        ArrayList<users> User = new ArrayList<>();
        users test = new users();
        
        for(int i=0; i<database.size(); i++)
        {
            if(!database.get(i).getUserLevel().equals("admin"))
            {
                test = new users(database.get(i).getUserID(), database.get(i).getUsername(), database.get(i).getFname(),
                      database.get(i).getLname(), database.get(i).getUserLevel(), database.get(i).getDate());
                User.add(test);                    
            }             
        }
        return User;
    }

    // delete selected user method
    public static List<users> deleteUser(String id)
    {
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserID().equals(id))
            {
                database.remove(i);
            }
        }
        return database;
    }
    
    
    //view user accoungt on home section
    public static String accountInfo(String id)
    {
        String info = "";
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUsername().equals(id))
            {
                info = database.get(i).toString();
            }
        }
        
        return info;
    }
    
    //get number of registered users
    public static int numberRegistered()
    {
        int count = 0;
        
        try
        {
            for(int i=0; i<database.size(); i++)
            {
                if(!database.get(i).getUserLevel().equals("admin"))
                {
                    count++;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
        }
        
        return count;
    }
    
    //set the value of admin data to userbean to process update
    public static users updateAccStaff(String name)
    {
        users staff = null;
       
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUsername().equals(name))
            {
                staff = new users();
                staff.setUserID(database.get(i).getUserID());
                staff.setUsername(database.get(i).getUsername());
                staff.setFname(database.get(i).getFname());
                staff.setLname(database.get(i).getLname());
                staff.setPassword(database.get(i).getPassword());
                staff.setPhoneNum(database.get(i).getPhoneNum());
                staff.setEmail(database.get(i).getEmail());
            }             
        }
        return staff;
    }

    //update the data from the userbean
    public static String updateAccStaff(users u)
    {
        String status = "";
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserID().equals(u.getUserID()))  
            {
                database.get(i).setUsername(u.getUsername());
                database.get(i).setFname(u.getFname());
                database.get(i).setLname(u.getLname());
                database.get(i).setPassword(u.getPassword());
                database.get(i).setPhoneNum(u.getPhoneNum());
                database.get(i).setEmail(u.getEmail());                
                status = u.getUsername();
            }             
        }
        return status;
    }    
    
    //addd schedule to the arrraylist
    public static String addSchedule(schedule s)
    {
        String status = "";
        
        if(!s.getDates().equals(null))
        {
            scheduleTable.add(s);
            status = "success";
        
        }
        else
        {
            status="failed";
        }
        return status;
    }

    //view schedule based in who is supervisor
    public static ArrayList<schedule> getSchedule(String name)
    {
        ArrayList<schedule> U = new ArrayList<>();
        schedule s = null;
        
        for(int i=0; i<scheduleTable.size(); i++)
        {
            if(scheduleTable.get(i).getLecturerid().equals(name))
            {
                s = new schedule(scheduleTable.get(i).getLecturerid(), scheduleTable.get(i).getDates()
                        , scheduleTable.get(i).getTimeto(), scheduleTable.get(i).getTimefrom()
                        , scheduleTable.get(i).getDatesStatus(), scheduleTable.get(i).getVenue());
                U.add(s);                    
            }             
        }
        return U;
    }

    //delete schdelue
    public static List<schedule> deleteSchedule(String dates)
    {
        for(int i=0; i<scheduleTable.size(); i++)
        {
            if(scheduleTable.get(i).getDates().equals(dates))
            {
                scheduleTable.remove(i);
            }
        }
        return scheduleTable;
    }

    public static lecturer updateAccLecturer(String name)
    {
        lecturer staff = null;
       
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUsername().equals(name))
            {
                staff = new lecturer();
                staff.setUserID(database.get(i).getUserID());
                staff.setUsername(database.get(i).getUsername());
                staff.setFname(database.get(i).getFname());
                staff.setLname(database.get(i).getLname());
                staff.setPassword(database.get(i).getPassword());
                staff.setPhoneNum(database.get(i).getPhoneNum());
                staff.setEmail(database.get(i).getEmail());
            }             
        }
        return staff;
    }

    public static String updateAccLecturer(lecturer u)
    {
        String status = "";
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserID().equals(u.getUserID()))  
            {
                database.get(i).setUsername(u.getUsername());
                database.get(i).setFname(u.getFname());
                database.get(i).setLname(u.getLname());
                database.get(i).setPassword(u.getPassword());
                database.get(i).setPhoneNum(u.getPhoneNum());
                database.get(i).setEmail(u.getEmail());                
                status = u.getUsername();
            }             
        }
        return status;
    }
    
    //use to set value to appointmnetbean to view in appointmnet table of lectuerer
    public static ArrayList<appointment> getApptByAppID(String id)
    {

        ArrayList<appointment> a = new ArrayList<appointment>();
        appointment a1 = null;
        for(int i=0; i<appointmentTable.size(); i++)
        {
            a1 = new appointment();
            if(appointmentTable.get(i).getAppID().equals(id))
            {
                a1.setStudentid(appointmentTable.get(i).getStudentid());
                a1.setAppDetail(appointmentTable.get(i).getAppDetail());
                a1.setAppSubject(appointmentTable.get(i).getAppSubject());
                a1.setSchedule(appointmentTable.get(i).getSchedule());
                a1.setAppStatus(appointmentTable.get(i).getAppStatus());
                a.add(a1);
                
            }
        }
        return a;
    }  
    
    //action reject
    public static void RejectAppt(String id)
    {
        for(int i=0; i<appointmentTable.size(); i++)
        {
            if(appointmentTable.get(i).getAppID().equals(id))
            {
                appointmentTable.get(i).setAppStatus("Reject");
            }
        }
    }
    
    public static void ApproveAppt(String id)
    {
        for(int i=0; i<appointmentTable.size(); i++)
        {
            if(appointmentTable.get(i).getAppID().equals(id))
            {
                appointmentTable.get(i).setAppStatus("Approve");
            }
        }
    }
    
    //  studenbt reguster the appt
    public static int makeAppt(appointment a)
    {
        int status = 0;
        
        if(!a.getAppID().equals(null))
        {
            appointmentTable.add(a);
            status = 1;
        }
        else
        {
            status = 0;
        }
        return status;
    }
    //lecturer view their appt
    public static ArrayList<appointment> getAppt(String name)
    {
        ArrayList<appointment> a = new ArrayList<appointment>();
        appointment a1 = null;
        for(int i=0; i<appointmentTable.size(); i++)
        {
            a1 = new appointment();
            if(appointmentTable.get(i).getSchedule().getLecturerid().equals(name))
            {
                a1.setAppID(appointmentTable.get(i).getAppID());
                a1.setStudentid(appointmentTable.get(i).getStudentid());
                a1.setAppSubject(appointmentTable.get(i).getAppSubject());
                a1.setAppStatus(appointmentTable.get(i).getAppStatus());
                a.add(a1);
            }
        }
        return a;
    }
    //student view their appt
    public static ArrayList<appointment> getApptByID(String name)
    {

        ArrayList<appointment> a = new ArrayList<appointment>();
        appointment a1 = null;
        for(int i=0; i<appointmentTable.size(); i++)
        {
            a1 = new appointment();
            if(appointmentTable.get(i).getStudentid().equals(name))
            {
                a1.setAppID(appointmentTable.get(i).getAppID());
                a1.setAppSubject(appointmentTable.get(i).getAppSubject());
                a1.setSchedule(appointmentTable.get(i).getSchedule());
                a1.setAppStatus(appointmentTable.get(i).getAppStatus());
                a.add(a1);
                
            }
        }
        return a;
    }    
    
    public static student updateAccStudent(String name)
    {
        student s = null;
       
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUsername().equals(name))
            {
                s = new student();
                s.setUserID(database.get(i).getUserID());
                s.setUsername(database.get(i).getUsername());
                s.setFname(database.get(i).getFname());
                s.setLname(database.get(i).getLname());
                s.setPassword(database.get(i).getPassword());
                s.setPhoneNum(database.get(i).getPhoneNum());
                s.setEmail(database.get(i).getEmail());
            }             
        }
        return s;
    }

    public static String updateAccStudent(student u)
    {
        String status = "";
        for(int i=0; i<database.size(); i++)
        {
            if(database.get(i).getUserID().equals(u.getUserID()))  
            {
                database.get(i).setUsername(u.getUsername());
                database.get(i).setFname(u.getFname());
                database.get(i).setLname(u.getLname());
                database.get(i).setPassword(u.getPassword());
                database.get(i).setPhoneNum(u.getPhoneNum());
                database.get(i).setEmail(u.getEmail());                
                status = u.getUsername();
            }             
        }
        return status;
    }
    //just for testing also
    public static void testing()
    {
        for(appointment a:appointmentTable)
        {
            System.out.println(a.getAppID());
        }
    }
}
