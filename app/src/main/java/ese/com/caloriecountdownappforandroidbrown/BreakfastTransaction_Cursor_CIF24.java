package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 08/12/2016.
 */
public class BreakfastTransaction_Cursor_CIF24 extends CursorWrapper
{

        //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
        //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.


        private static final String TABLE_BREAKFAST_TRANSACTIONS_TABLE = "breakfast_transaction";
        private static final String COLUMN_BREAKFAST_ID = "Column_Breakfast_id";
        private static final String COLMUM_BREAKFAST_DATE = "Date";
        private static final String COLUMUM_BREAKFAST_MEAL_TYPE = "Meal_Type";
        private static final String COLUMUM_BREAKFAST_MEAL_TYPE_ID = "Meal_Type_id";
        private static final String COLUMUM_BREAKFAST_AMOUNT = "Amount";
        private static final String COLUMUM_BREAKFAST_BALANCE = "Balance";
        private BoxCIF17 Transaction_Items;
        private Meal_Items_Cursor Mealio;

    public BreakfastTransaction_Cursor_CIF24(Cursor cursor)
    {
        super(cursor);
    }


    public Breakfast_Transaction_CIF22 GetTransactions()
    {

        while(!(isBeforeFirst() || isAfterLast())) {

            Breakfast_Transaction_CIF22 T100 = new Breakfast_Transaction_CIF22();
            Breakfast_Box_CIF17 BBox = new Breakfast_Box_CIF17();

            BBox.Set_Breakfast_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_BREAKFAST_ID)))));
            Mealio = new Meal_Items_Cursor(this);
            Transaction_Items = Mealio.Get_Transaction_Food_Items(new RoundingCIF13().StringToInt((getString(getColumnIndex(COLUMN_BREAKFAST_ID)))));
            BBox.Set_Breakfast_Date((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLMUM_BREAKFAST_DATE)))));
            BBox.Set_Breakfast_Meal_Type(getString(getColumnIndex(COLUMUM_BREAKFAST_MEAL_TYPE)));
            BBox.Set_Breakfast_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_BREAKFAST_MEAL_TYPE_ID)))))));
            BBox.Set_Breakfast_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_BREAKFAST_AMOUNT)))));
            BBox.Set_Breakfast_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_BREAKFAST_BALANCE)))));

            T100.Set_BreakfastBox(BBox);
            return T100;
        }
        return null;

    }
}
