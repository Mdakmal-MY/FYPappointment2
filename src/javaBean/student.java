/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBean;

/**
 *
 * @author KaizoDono
 */
public class student extends users
{

    private String program;
    private String faculty;
    private String supervisor;
    
    public student()
    {
        
    }
    
    public student(String userid, String username, String firstname, String lastname,
            String userlevel, String logindate)
    {
        super(userid, username, firstname, lastname, userlevel, logindate);
    }

    public student(String userid, String username, String password, String firstname, String lastname, String gender, String address,
                   String phonenum, String emailaddr, String userlevel, String logindate, String faculty, String program, String supervisor) 
    {
        super(userid, username, password, firstname, lastname, gender, address, phonenum, emailaddr, userlevel, logindate);
        setFaculty(faculty);
        setProgram(program);
        setSupervisor(supervisor);
    }

    public String getSupervisor()
    {
        return supervisor;
    }

    public void setSupervisor(String supervisor) 
    {
        this.supervisor = supervisor;
    }
    
    public void setProgram(String program)
    {
        this.program = program;
    }
    
    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }
    
    public String getProgram()
    {
        return program;
    }
    
    public String getFaculty()
    {
        return faculty;
    }
    public String toString()
    {
        return String.format("%s\nProgram: %s\nFaculty: %s\nSupervisor: %s"
                ,super.toString(), getProgram(), getFaculty(), getSupervisor());
    }    
}
