package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by ESE on 10/02/2016.
 */

import android.database.Cursor;
import android.database.CursorWrapper;

public class LunchtimeCursor extends CursorWrapper
{
    //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row

    private static final String TABLE_LUNCH_TIME = "lunch_time";
    private static final String COLUMUM_LUNCH_TIME_ID = "lunch_time_id";
    private static final String COLUMUM_LUNCH_TIME_LUNCHTIME = "lunch_time";





    public LunchtimeCursor(Cursor c)
    {
        super(c);
    }

    public int getLunchtime()
    {


        if(isBeforeFirst() || isAfterLast())return 0;



        return getInt(getColumnIndex(COLUMUM_LUNCH_TIME_LUNCHTIME));


    }
}

