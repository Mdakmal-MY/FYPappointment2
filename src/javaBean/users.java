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
public class users 
{
    private String userid;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String gender;
    private String address;
    private String phonenum;
    private String emailaddr;
    private String userlevel;
    private String logindate;
    
    public users()
    {
        
    }
    
    public users(String userid, String username, String firstname, String lastname, String userlevel , String logindate)
    {
        setUserID(userid);
        setUsername(username);
        setFname(firstname);
        setLname(lastname);
        setUserLevel(userlevel);
        setDate(logindate);
    } 
    public users(String userid, String username, String password, String firstname, String lastname, String gender
                , String address, String phonenum, String emailaddr)
    {
        setUserID(userid);
        setUsername(username);
        setPassword(password);
        setFname(firstname);
        setLname(lastname);
        setGender(gender);
        setAddress(address);
        setPhoneNum(phonenum);
        setEmail(emailaddr);
    }       
       
    public users(String userid, String username, String password, String firstname, String lastname, String gender
                , String address, String phonenum, String emailaddr, String userlevel, String logindate)
    {
        setUserID(userid);
        setUsername(username);
        setPassword(password);
        setFname(firstname);
        setLname(lastname);
        setGender(gender);
        setAddress(address);
        setPhoneNum(phonenum);
        setEmail(emailaddr);
        setUserLevel(userlevel);
        setDate(logindate);
                
    }
    
    public void setUserID(String userid)
    {
        this.userid = userid;
    }
    
    public void setUsername(String username)            
    {
        this.username = username;
    }
    
    public void setPassword(String password)            
    {
        this.password = password;
    } 
    public void setFname(String firstname)
    {
        this.firstname = firstname;
    }
    
    public void setLname(String lastname)
    {
        this.lastname = lastname;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPhoneNum(String phonenum)
    {
        this.phonenum = phonenum;
    }
    
    public void setEmail(String emailaddr)
    {
        this.emailaddr = emailaddr;
    }
    
    public void setUserLevel(String userlevel)
    {
        this.userlevel = userlevel;
    }
    
    public void setDate(String logindate)
    {
        this.logindate = logindate;
    }

    public String getUserID()
    {
        return(this.userid);
    }
    
    public String getUsername()            
    {
        return(this.username);
    }
    
    public String getPassword()
    {
        return(this.password);
    }
    
    public String getFname()
    {
        return(this.firstname);
    }
    
    public String getLname()
    {
        return(this.lastname);
    }
    
    public String getGender()
    {
        return(this.gender);
    }
    
    public String getAddress()
    {
        return(this.address);
    }
    
    public String getPhoneNum()
    {
        return(this.phonenum);
    }
    
    public String getEmail()
    {
        return(this.emailaddr);
    }
    
    public String getUserLevel()
    {
        return(this.userlevel);
    }
    
    public String getDate()
    {
        return(this.logindate);
    }

    public String toString()
    {
        return String.format("User ID: %s\nUsername: %s\nName: %s %s\nEmail: %s\nUser: %s\nLast Login: %s"
                ,getUserID(), getUsername(), getFname(), getLname(), getEmail(), getUserLevel(), getDate());
    }
}
