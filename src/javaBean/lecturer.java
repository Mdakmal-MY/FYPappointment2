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

public class lecturer extends users
{

    private String faculty;
    private String supervise;
    
    public lecturer()
    {
    }
   
    public lecturer(String userid, String username, String firstname, String lastname,
            String userlevel, String logindate)
    {
        super(userid, username, firstname, lastname, userlevel, logindate);
    }

    public lecturer(String userid, String username, String password, String firstname, String lastname, String gender, String address,
                    String phonenum, String emailaddr, String userlevel, String logindate, String faculty, String supervise) 
    {
        super(userid, username, password, firstname, lastname, gender, address, phonenum, emailaddr, userlevel, logindate);
        setFaculty(faculty);
        setSupervise(supervise);
    }
    
    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }
    
    public String getFaculty()
    {
        return faculty;
    }

    public String getSupervise() 
    {
        return supervise;
    }

    public void setSupervise(String supervise)
    {
        this.supervise = supervise;
    }
    
    public String toString()
    {
        return String.format("%s\nFaculty: %s\nSupervise: %s", super.toString(), getFaculty(), getSupervise());
    }
}
