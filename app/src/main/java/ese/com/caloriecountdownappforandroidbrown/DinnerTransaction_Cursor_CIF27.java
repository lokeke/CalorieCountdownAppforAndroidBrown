package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 09/12/2016.
 */

public class DinnerTransaction_Cursor_CIF27 extends CursorWrapper {

//A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_DINNER_TRANSACTIONS_TABLE = "dinner_transaction";
    private static final String COLUMN_DINNER_ID = "Column_Dinner_id";
    private static final String COLMUM_DINNER_DATE = "Date";
    private static final String COLUMUM_DINNER_MEAL_TYPE = "Meal_Type";
    private static final String COLUMUM_DINNER_MEAL_TYPE_ID = "Meal_Type_id";
    private static final String COLUMUM_DINNER_AMOUNT = "Amount";
    private static final String COLUMUM_DINNER_BALANCE = "Balance";


    public DinnerTransaction_Cursor_CIF27(Cursor cursor)
    {
        super(cursor);
    }

    public Dinner_Transaction_CIF21 GetTransactions()
    {

        while(!(isBeforeFirst() || isAfterLast())) {

            Dinner_Transaction_CIF21 T100 = new Dinner_Transaction_CIF21();
            Dinner_Box_CIF17 BBox = new Dinner_Box_CIF17();

            BBox.Set_Dinner_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_DINNER_ID)))));
            BBox.Set_Dinner_Date((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLMUM_DINNER_DATE)))));
            BBox.Set_Dinner_Meal_Type(getString(getColumnIndex(COLUMUM_DINNER_MEAL_TYPE)));
            BBox.Set_Dinner_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_DINNER_MEAL_TYPE_ID)))))));
            BBox.Set_Dinner_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_DINNER_AMOUNT)))));
            BBox.Set_Dinner_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_DINNER_BALANCE)))));

            T100.Set_DinnerBox(BBox);
            return T100;
        }
        return null;

    }
}
