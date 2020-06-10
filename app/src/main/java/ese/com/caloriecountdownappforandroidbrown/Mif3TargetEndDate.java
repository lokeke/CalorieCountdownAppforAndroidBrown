package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 26/02/2016.
 */

import java.util.Calendar;
import java.util.Date;

public class Mif3TargetEndDate
{
    public Mif3TargetEndDate()
    {

    }

    public HealthProfileCiF3 TargetEndDate(HealthProfileCiF3 OUT)
    {
        //Algorithm Engineering ~> ANDROID : /Black
        int startbalance = OUT.getStartCountdown();
        float top = (float) startbalance;
        top = top / 350;
        int numberOfDaysToZero = (int) top;
        OUT.setNumberOfDaysToLose(numberOfDaysToZero);
        Calendar Kalends = Calendar.getInstance();
        long dateinMills = Kalends.getTimeInMillis() + (numberOfDaysToZero * 24 * 60 *60 *1000);
        Date data = new Date();
        data.setTime(dateinMills);
        OUT.setTargetDate2(data);


        return OUT;
    }
}
