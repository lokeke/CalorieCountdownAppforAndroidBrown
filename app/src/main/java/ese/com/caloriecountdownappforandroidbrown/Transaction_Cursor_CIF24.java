package ese.com.caloriecountdownappforandroidbrown;


import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by ESE on 08/03/2017.
 */
public class Transaction_Cursor_CIF24 extends CursorWrapper
{

    //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.


    private static final String TABLE_TRANSACTIONS_TABLE = "transactions";
    private static final String COLUMN_TRANSACTIONS_ID = "Column_Transactions_id";
    private static final String COLMUM_TRANSACTIONS_DATE = "Date";
    private static final String COLUMUM_TRANSACTIONS_MEAL_TYPE = "Meal_Type";
    private static final String COLUMUM_TRANSACTIONS_MEAL_TYPE_ID = "Meal_Type_id";
    private static final String COLUMUM_TRANSACTIONS_AMOUNT = "Amount";
    private static final String COLUMUM_TRANSACTIONS_BALANCE = "Balance";
    private BoxCIF17 Transaction_Items;
    private Meal_Items_Cursor Mealio;
    private Cursor cursor;



    public Transaction_Cursor_CIF24(Cursor cursorx)
    {
        super(cursorx);
        cursor = cursorx;
    }

    public Transactions_CIF22 GetTransactions()
    {
        Transactions_CIF22 T100 = new Transactions_CIF22();

        boolean trash_collector = moveToFirst();


        for(int x = 0; x<getCount(); x++){//while(!(isBeforeFirst() || isAfterLast())) {

            Transaction_CIF52 T101 = new Transaction_CIF52();
            Transaction_Line_CIF17 Line_50 = new Transaction_Line_CIF17();
            Breakfast_Box_CIF17 BBox = new Breakfast_Box_CIF17();
            Food_Item_CIF4 dummy_rice_4 = new Food_Item_CIF4("Porridge");

            Log.d("Cursor", "This is Row Count :" + new RoundingCIF13().IntToString(getCount()));

                Line_50.Set_Transaction_ID((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMN_TRANSACTIONS_ID))));
                android.util.Log.d("Money Shot : Trans ID", new RoundingCIF13().LongToString(Line_50.Get_Transaction_ID()));

                Line_50.Set_Description("Meal Time");

                Line_50.Set_Transaction_Amount((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_AMOUNT))));
                android.util.Log.d("Money Shot : Amount", new RoundingCIF13().IntToString(Line_50.Get_Transaction_Amount()));

                Line_50.Set_Transaction_Meal_Type(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE)));
                android.util.Log.d("Money Shot : Meal_Type", Line_50.Get_Transaction_Meal_Type());

                Line_50.Set_Transaction_Meal_Type_ID((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE_ID))));
                android.util.Log.d("Money Shot : Meal T ID", new RoundingCIF13().LongToString(Line_50.Get_Transaction_Meal_Type_ID()));

                Line_50.Set_Transaction_Balance((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_BALANCE))));
                android.util.Log.d("Money Shot : Balance", new RoundingCIF13().IntToString(Line_50.Get_Transaction_Balance()));

                Line_50.Set_Transaction_DateX((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLMUM_TRANSACTIONS_DATE))));
                android.util.Log.d("Money Shot : Date x", new RoundingCIF13().LongToString(Line_50.Get_Transaction_DateX().getTime()));



            //BBox.Set_Breakfast_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
            //Mealio = new Meal_Items_Cursor(cursor);
            //Transaction_Items = Mealio.Get_Transaction_Food_Items(new RoundingCIF13().StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
            //BBox.Set_Breakfast_Date((new RoundingCIF13()).StringToLong((getString(getColumnIndex(COLMUM_TRANSACTIONS_DATE)))));
            //BBox.Set_Breakfast_Meal_Type(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE)));
            //BBox.Set_Breakfast_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE_ID)))))));
            //BBox.Set_Breakfast_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_AMOUNT)))));
            //BBox.Set_Breakfast_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_BALANCE)))));

            //T100.Set_Internal_Box(BBox);

            dummy_rice_4.Set_category("ING");
            dummy_rice_4.Set_food_item_name("McDonalds : Burgers : Double Cheeseburger flo");
            dummy_rice_4.Set_grams_per_serving_portion((float)100.00);
            dummy_rice_4.Set_calories_per_100g((float)445.00);
            dummy_rice_4.Set_fat_per_100g((float)5.00);
            dummy_rice_4.Set_carbs_per_100g((float)5.00);
            dummy_rice_4.Set_protein_per_100g((float)50);

            Line_50.add_Food_item(dummy_rice_4);
            T101.Set_Single_Transaction_Line(Line_50);
            T100.Add_TransactionLine_2_List(T101);


            trash_collector = moveToNext();


        }


        return T100;

    }



}
