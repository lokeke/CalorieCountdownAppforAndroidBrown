package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by ESE on 10/02/2016.
 */

import android.database.Cursor;
import android.database.CursorWrapper;

public class BreakfasttimeCursor extends CursorWrapper
{
    //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row

    private static final String TABLE_BREAKFAST_TIME = "breakfast_time";
    private static final String COLUMUM_BREAKFAST_TIME_ID = "breakfast_time_id";
    private static final String COLUMUM_BREAKFAST_TIME_BREAKFASTTIME = "breakfast_time";


    public BreakfasttimeCursor(Cursor c)
    {
        super(c);
    }

    public int getBreakfasttime()
    {


        if(isBeforeFirst() || isAfterLast())return 0;



        return getInt(getColumnIndex(COLUMUM_BREAKFAST_TIME_BREAKFASTTIME));


    }
}


