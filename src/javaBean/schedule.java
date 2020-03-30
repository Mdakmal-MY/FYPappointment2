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
public class schedule 
{

    private String lecturerid;
    private String dates;
    private String timeto;
    private String timefrom;
    private String datesStatus;
    private String venue;

    public schedule()
    {
        
    }
   
    public schedule(String lecturerid, String dates, String timeto, String timefrom, String datesStatus, String venue)
    {
        setLecturerid(lecturerid);
        setDates(dates);
        setTimeto(timeto);
        setTimefrom(timefrom);
        setDatesStatus(datesStatus);
        setVenue(venue);
    }
    
    public String getVenue()
    {
        return venue;
    }

    public void setVenue(String venue)
    {
        this.venue = venue;
    }
   
    public String getDatesStatus() 
    {
        return datesStatus;
    }

    public void setDatesStatus(String datesStatus) 
    {
        this.datesStatus = datesStatus;
    }   
    
    public String getTimefrom() 
    {
        return timefrom;
    }

    public void setTimefrom(String timefrom)
    {
        this.timefrom = timefrom;
    }
    
    public String getLecturerid() 
    {
        return lecturerid;
    }

    public void setLecturerid(String lecturerid) 
    {
        this.lecturerid = lecturerid;
    }

    public String getDates() 
    {
        return dates;
    }

    public void setDates(String dates) 
    {
        this.dates = dates;
    }

    public String getTimeto() 
    {
        return timeto;
    }

    public void setTimeto(String timeto) 
    {
        this.timeto = timeto;
    }
    
    public String toString()
    {
        return String.format("Lecturer Name: %s\n Date: %s\nFrom: %s\nTo: %s\nStatus: %s\nVenue: %s"
                , getLecturerid(), getDates(), getTimefrom(), getTimeto(), getDatesStatus(), getVenue());
    }
}
