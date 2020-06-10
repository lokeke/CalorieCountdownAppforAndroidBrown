package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 26/02/2016.
 */

import java.util.Calendar;
import java.util.Date;

public class Mif3StartDate
{
    public Mif3StartDate()
    {

    }

    public HealthProfileCiF3 StartDate(HealthProfileCiF3 OUT)
    {
        Date data = new Date();
        data.setTime(System.currentTimeMillis());
        OUT.setStartDate(data);
        return OUT;
    }
}
