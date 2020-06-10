package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by ESE on 10/02/2016.
 */

import android.database.Cursor;
import android.database.CursorWrapper;

public class DinnertimeCursor extends CursorWrapper

{
    //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row


    private static final String TABLE_FINAL_MEAL_TIME = "final_meal";
    private static final String COLUMUM_FINAL_MEAL_TIME_ID = "final_meal_item_id";
    private static final String COLUMUM_FINAL_MEAL_TIME_FINALMEATIME = "final_meal_time";


    public DinnertimeCursor(Cursor c)
    {
        super(c);
    }

    public int getDinnertime()
    {


        if(isBeforeFirst() || isAfterLast())return 0;



        return getInt(getColumnIndex(COLUMUM_FINAL_MEAL_TIME_FINALMEATIME));


    }
}


