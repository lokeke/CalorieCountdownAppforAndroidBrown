package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by lokeke on 09/12/2016.
 */
public class LunchTransaction_Cursor_CIF26 extends CursorWrapper
{

        //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
        //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.


        private static final String TABLE_LUNCH_TRANSACTIONS_TABLE = "lunch_transaction";
        private static final String COLUMN_LUNCH_ID = "Column_Lunch_id";
        private static final String COLMUM_LUNCH_DATE = "Date";
        private static final String COLUMUM_LUNCH_MEAL_TYPE = "Meal_Type";
        private static final String COLUMUM_LUNCH_MEAL_TYPE_ID = "Meal_Type_id";
        private static final String COLUMUM_LUNCH_AMOUNT = "Amount";
        private static final String COLUMUM_LUNCH_BALANCE = "Balance";

        public LunchTransaction_Cursor_CIF26(Cursor cursor)
        {
            super(cursor);
        }

        public Lunch_Transaction_CIF20 GetTransactions()
        {

            while(!(isBeforeFirst() || isAfterLast())) {

                Lunch_Transaction_CIF20 T100 = new Lunch_Transaction_CIF20();
                Lunch_Box_CIF17 BBox = new Lunch_Box_CIF17();

                BBox.Set_Lunch_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_LUNCH_ID)))));
                BBox.Set_Lunch_Date((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLMUM_LUNCH_DATE)))));
                BBox.Set_Lunch_Meal_Type(getString(getColumnIndex(COLUMUM_LUNCH_MEAL_TYPE)));
                BBox.Set_Lunch_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_LUNCH_MEAL_TYPE_ID)))))));
                BBox.Set_Lunch_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_LUNCH_AMOUNT)))));
                BBox.Set_Lunch_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_LUNCH_BALANCE)))));

                T100.Set_Lunch_Box(BBox);
                return T100;
            }
            return null;

        }
}
