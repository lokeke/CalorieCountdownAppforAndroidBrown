package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 04/05/2016.
 */
public class FinalMealCursor extends CursorWrapper {

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_FINAL_MEAL_TIME = "final_meal_time";
    private static final String COLUMUM_FINAL_MEAL_TIME_ID = "final_meal_item_id";
    private static final String COLUMUM_FINAL_MEAL_TIME_FINALMEATIME = "final_meal_time";


    public FinalMealCursor(Cursor c)
    {
        super(c);
    }

    public String getFinalMeal()
    {


        if(isBeforeFirst() || isAfterLast())return "0";



        return new RoundingCIF13().IntToString(getInt(getColumnIndex(COLUMUM_FINAL_MEAL_TIME_FINALMEATIME)));


    }
}
