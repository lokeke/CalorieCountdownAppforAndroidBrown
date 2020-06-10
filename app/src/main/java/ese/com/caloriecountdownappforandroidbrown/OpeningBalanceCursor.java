package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 04/05/2016.
 */
public class OpeningBalanceCursor extends CursorWrapper {

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_OPENING_BALANCE = "Opening Balance";
    private static final String COLUMUM__OPENING_BALANCE_ID = "opening_balance_id";
    private static final String COLUMUM__OPENING_BALANCE_STARTCOUNTDOWN = "openingbalance_startcountdown";


    public OpeningBalanceCursor(Cursor c)
    {
        super(c);
    }

    public String getOpeningBalance()
    {


        if(isBeforeFirst() || isAfterLast())return "0";



        return new RoundingCIF13().IntToString(getInt(getColumnIndex(COLUMUM__OPENING_BALANCE_STARTCOUNTDOWN)));


    }
}




