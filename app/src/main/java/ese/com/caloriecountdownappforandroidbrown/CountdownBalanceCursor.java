package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

public class CountdownBalanceCursor extends CursorWrapper{

//A Convenience class to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_COUNTDOWN_BALANCE = "countdown_balances";

    private static final String COLUMN_COUNTDOWN_BALANCE_ID = "balance_id";
    private static final String COLUMN_COUNTDOWN_BALANCE_DATE = "balance_date";
    private static final String COLUMN_COUNTDOWN_BALANCE_BALANCE ="balance_balance";


    public CountdownBalanceCursor(Cursor c)
    {
        super(c);
    }

    public String getBalance()
    {


        if(isBeforeFirst() || isAfterLast())return null;



        return getString(getColumnIndex(COLUMN_COUNTDOWN_BALANCE_BALANCE));


    }
}

