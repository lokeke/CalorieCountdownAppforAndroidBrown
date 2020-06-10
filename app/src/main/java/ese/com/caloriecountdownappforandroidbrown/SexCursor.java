package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 10/02/2016.
 */
import android.database.Cursor;
import android.database.CursorWrapper;

public class SexCursor extends CursorWrapper{

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_SEX = "sex";

    private static final String COLUMN_SEX_ID = "sex_id";
    private static final String COLUMN_SEX_SEX = "sex_sex";


    public SexCursor(Cursor c)
    {
        super(c);
    }

    public String getSex()
    {


        if(isBeforeFirst() || isAfterLast())return null;



        return getString(getColumnIndex(COLUMN_SEX_SEX));


    }
}

