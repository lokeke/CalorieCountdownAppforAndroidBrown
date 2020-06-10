package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 04/05/2016.
 */
public class LunchCursor extends CursorWrapper {

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_LUNCH_TIME = "lunch_time";
    private static final String COLUMUM_LUNCH_TIME_ID = "lunch_time_id";
    private static final String COLUMUM_LUNCH_TIME_LUNCHTIME = "lunch_time";


    public LunchCursor(Cursor c)
    {
        super(c);
    }

    public String getLunch()
    {


        if(isBeforeFirst() || isAfterLast())return "0";



        return new RoundingCIF13().IntToString(getInt(getColumnIndex(COLUMUM_LUNCH_TIME_LUNCHTIME)));


    }
}
