package ese.com.caloriecountdownappforandroidbrown;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by lokeke on 16/06/2016.
 */
public class CalenderHelperClass
{
    private java.util.Date Datum;
    private java.util.Calendar Gregg;
    private String DateText;
    private Date TextDate;
    private int mMinute = 55;
    private int mHour = 16;
    private int mDayOfMonth = 4;
    private int mMonth = 7;
    private int mYear = 2016;

    public CalenderHelperClass(java.util.Date date)
    {
        Datum =  date;
        Gregg = Calendar.getInstance();

        Gregg.setTime(Datum);

    }

    public CalenderHelperClass(String in)
    {
        //Action
        //Format we are expecting is HH:MM:DoM:M:Yr
        //if not recieved display message or
        //throw exception
        //have theses checks in place before puting dates in in Start Weight Loss and  Data Model

        android.util.Log.d("Debugging", "This is the String you are interested in2 :" + in);

        DateText = in;
        //StripAndDelimitAndCut(in, ":");
        Datum =  new Date();
        Gregg = Calendar.getInstance();
        Gregg.setTime(Datum);
        Gregg.set(Calendar.MINUTE, mMinute);
        Gregg.set(Calendar.HOUR_OF_DAY, mHour);
        Gregg.set(Calendar.DAY_OF_MONTH, mDayOfMonth);
        Gregg.set(Calendar.MONTH, mMonth);
        Gregg.set(Calendar.YEAR, mYear);

        TextDate = Gregg.getTime();

    }


    public int getHour()
    {
        return Gregg.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute()
    {
        return Gregg.get(Calendar.MINUTE);
    }

    public int getDayOfMonth()
    {
        return Gregg.get(Calendar.DAY_OF_MONTH);
    }

    public int getMonth()
    {
        return Gregg.get(Calendar.MONTH);
    }


    public int getYear()
    {
        return Gregg.get(Calendar.YEAR);
    }

    public int RipMinute()
    {
        //Format we are expecting is HH:MM:DoM:M:Yr
        //if not recieved display message or
        //throw exception
        //have theses checks in place before puting dates in in Start Weight Loss and  Data Model

        //Check if DateText intialized if not...

        return mMinute;
    }

    public int RipHour()
    {
        return mHour;
    }

    public int RipDayOfMonth()
    {
        return mDayOfMonth;
    }

    public int RipMonth()
    {
        return mMonth;
    }

    public int RipYear()
    {
        return mYear;
    }

    private void StripAndDelimitAndCut(String in, String delimit)
    {

        if(checkInput(in))
        {
            StringTokenizer token = new StringTokenizer(in, delimit);
            mMinute = new RoundingCIF13().StringToInt(token.nextToken());
            mHour = new RoundingCIF13().StringToInt(token.nextToken());
            mDayOfMonth = new RoundingCIF13().StringToInt(token.nextToken());
            mMonth = new RoundingCIF13().StringToInt(token.nextToken());
            mYear = new RoundingCIF13().StringToInt(token.nextToken());
        }

        mHour = new RoundingCIF13().StringToInt(in.substring(0,1));
        mMinute = new RoundingCIF13().StringToInt(in.substring(2,3));
        if(Gregg != null)
        {
            mDayOfMonth = getDayOfMonth();
            mMonth = getMonth();
            mYear = getYear();
        }

    }

    private boolean checkInput(String toCheck)
    {
        return false;
    }

    public java.util.Date DateText2Date()
    {
       return TextDate;
    }
}
