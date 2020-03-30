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
public class appointment 
{

    private String appID;
    private String studentid;
    private schedule schedule;
    private String appSubject;
    private String appDetail;
    private String appStatus;

    public appointment()
    {
        
    }
    
    public String getAppID() 
    {
        return appID;
    }

    public void setAppID(String appID) 
    {
        this.appID = appID;
    }

    public String getStudentid() 
    {
        return studentid;
    }

    public void setStudentid(String studentid)
    {
        this.studentid = studentid;
    }

    public schedule getSchedule() 
    {
        return schedule;
    }

    public void setSchedule(schedule schedule) 
    {
        this.schedule = schedule;
    }

    public String getAppSubject() 
    {   
        return appSubject;
    }

    public void setAppSubject(String appSubject) 
    {
        this.appSubject = appSubject;
    }

    public String getAppDetail()
    {
        return appDetail;
    }

    public void setAppDetail(String appDetail)
    {
        this.appDetail = appDetail;
    }

    public String getAppStatus() 
    {
        return appStatus;
    }

    public void setAppStatus(String appStatus) 
    {
        this.appStatus = appStatus;
    }
    
    public String toString()
    {
        return String.format("Appointment Title: %s\nWith: %s\nDate: %s\n Status: %s"
                , getAppSubject(), schedule.getLecturerid(), schedule.getDates(), getAppStatus());
    }   
}
