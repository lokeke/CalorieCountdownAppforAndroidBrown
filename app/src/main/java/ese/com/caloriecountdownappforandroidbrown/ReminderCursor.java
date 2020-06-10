package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 04/05/2016.
 */
public class ReminderCursor extends CursorWrapper {

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_REMINDER_STATUS = "reminder_statuss";
    private static final String COLUMUM_REMINDER_STATUS_ID = "reminder_statuss_id";
    private static final String COLUMUM_REMINDER_STATUS_BOOLEANE = "reminderstatuss_booleane";

    public ReminderCursor(Cursor c)
    {
        super(c);
    }

    public String getReminder()
    {


        if(isBeforeFirst() || isAfterLast())return "0";



        return getString(getColumnIndex(COLUMUM_REMINDER_STATUS_BOOLEANE));


    }
}
