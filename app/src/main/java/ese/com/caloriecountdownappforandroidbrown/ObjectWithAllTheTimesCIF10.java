package ese.com.caloriecountdownappforandroidbrown;

import java.util.Date;

/**
 * Created by lokeke on 18/06/2016.
 */
public class ObjectWithAllTheTimesCIF10
{
    private java.util.Date ResetBreakfastTime;
    private java.util.Date ResetLunchTime;
    private java.util.Date ResetDinnerTime;
    private java.util.Date ResetDayEnd;





    public ObjectWithAllTheTimesCIF10()
    {

    }


    public void setResetBreakfastTime(java.util.Date rb)
    {
       ResetBreakfastTime = rb;
    }


    public void setResetLunchTime(java.util.Date rl)
    {
      ResetLunchTime = rl;
    }

    public void setResetDinnerTime(java.util.Date rd)
    {
       ResetDinnerTime = rd;
    }

    public void setResetDayEnd(java.util.Date rmd)
    {
        ResetDayEnd = rmd;
    }



    public java.util.Date getResetBreakfastTime()
    {
        if(ResetBreakfastTime == null)
        {
            return new Date();
        }
        else
        {
            return ResetBreakfastTime;
        }
    }


    public java.util.Date getResetLunchTime(){
        if(ResetLunchTime == null)
        {
            return new Date();
        }
        else
        {
            return ResetLunchTime;
        }
    }

    public java.util.Date getResetDinnerTime(){
        if(ResetDinnerTime == null)
        {
            return new Date();
        }
        else
        {
            return ResetDinnerTime;
        }
    }

    public java.util.Date getResetDayEnd(){
        if(ResetDayEnd == null)
        {
            return new Date();
        }
        else
        {
            return ResetDayEnd;
        }
    }



}

