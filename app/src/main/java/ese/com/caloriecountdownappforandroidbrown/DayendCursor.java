package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by ESE on 10/02/2016.
 */
import android.database.Cursor;
import android.database.CursorWrapper;

public class DayendCursor extends CursorWrapper{

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_DAYEND_BALANCE = "dayend_balance";

    private static final String COLUMN_DAYEND_ID = "dayend_id";
    private static final String COLUMN_DAYEND_BALANCE_DATE ="balance_date";
    private static final String COLUMN_DAYEND_BALANCE_BALANCE = "balance_dayend";


    public DayendCursor(Cursor c)
    {
        super(c);
    }

    public int getDayend()
    {


        if(isBeforeFirst() || isAfterLast())return 0;



        return getInt(getColumnIndex(COLUMN_DAYEND_BALANCE_BALANCE));


    }
}

