package ese.com.caloriecountdownappforandroidbrown;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by lokeke on 15/12/2016.
 */
public class Meal_Items_Cursor extends CursorWrapper {


    private static final String TABLE_MEAL_BOX_ITEMS_TABLE = "meal_box_items";
    private static final String COLUMN_MEAL_BOX_ID = "Column_Meal_Box_id";
    private static final String COLUMUM_MEAL_BOX_MEAL_TYPE = "Meal_Type";
    private static final String COLUMUM_MEAL_BOX_MEAL_TYPE_ID = "Meal_Type_id";
    private static final String COLUMN_MEAL_BOX_FOOD_TYPE = "food_type";
    private static final String COLUMN_MEAL_BOX_FOOD_ITEM_NAME = "food_item_name";
    private static final String COLUMN_MEAL_BOX_GRAMS_PER_SERVING_PORTION = "grams_per_serving_portion";
    private static final String COLUMN_MEAL_BOX_CALORIE_PER_100G = "calories_per_100g";
    private static final String COLUMN_MEAL_BOX_FAT_PER_100G = "fat_per_100g";
    private static final String COLUMN_MEAL_BOX_SATURATED_FAT = "saturated_fat";
    private static final String COLUMN_MEAL_BOX_TRANS_FAT = "trans_fat";
    private static final String COLUMN_MEAL_BOX_PROTEIN_PER_100G = "protein_per_100g";
    private static final String COLUMN_MEAL_BOX_CARBS_PER_100G = "carbs_per_100g";
    private static final String COLUMN_MEAL_BOX_SUGAR_PER_100G = "sugar_per_100g";
    private static final String COLUMN_MEAL_BOX_SALT_PER_100G = "salt_per_100g";
    private static final String COLUMN_MEAL_BOX_WELLBEING_INDEX = "wellbeing_index";
    private static final String COLUMN_MEAL_BOX_FIBER = "fiber";
    private static final String COLUMN_MEAL_BOX_PRICE_STERLING = "price_sterling";
    private static final String COLUMN_MEAL_BOX_POLYUNSATURATED = "polyunsaturated";
    private static final String COLUMN_MEAL_BOX_MONOUNSATURATED = "monounsaturated ";
    private static final String COLUMN_MEAL_BOX_CHOLESTEROL_MG = "cholesterol_mg";
    private static final String COLUMN_MEAL_BOX_SODIUM_MG = "sodium_mg";
    private static final String COLUMN_MEAL_BOX_POTASSIUM_MG = "potassium_mg";
    private static final String COLUMN_MEAL_BOX_VITAMIN_A_PERCENT = "vitamin_a_percent";
    private static final String COLUMN_MEAL_BOX_VITAMIN_C_PERCENT = "vitamin_c_percent";
    private static final String COLUMN_MEAL_BOX_CALCIUM_PERCENT = "calcium_percent";
    private static final String COLUMN_MEAL_BOX_IRON_PERCENT = "iron_percent";
    private static final String COLUMN_MEAL_BOX_CATEGORY = "category";


    public long Meal_Box_ID;
    public String Meal_Box_Type;
    public long Meal_Box_Type_ID;
    public String Meal_Box_Food_Type;
    public String Meal_Box_Food_Item_Name;
    public float Meal_Box_GRAMS_PER_SERVINGS;
    public float Meal_Box_CALORIE_PER_100G;
    public float Meal_Box_FAT_PER_100G;
    public float Meal_Box_SATURATED_FAT;
    public float Meal_Box_TRANS_FAT;
    public float Meal_Box_PROTEIN_PER_100G;
    public float Meal_Box_CARBS_PER_100G;
    public float Meal_Box_SUGAR_PER_100G;
    public float Meal_Box_SALT_PER_100G;
    public float Meal_Box_WELLBEING_INDEX;
    public float Meal_Box_FIBER;
    public float Meal_Box_PRICE_STERLING;
    public float Meal_Box_POLYUNSATURATED;
    public float Meal_Box_MONOUNSATURATED;
    public float Meal_Box_CHOLESTEROL_MG;
    public float Meal_Box_SODIUM_MG;
    public float Meal_Box_POTASSIUM_MG;
    public float Meal_Box_VITAMIN_A_PERCENT;
    public float Meal_Box_VITAMIN_C_PERCENT;
    public float Meal_Box_CALCIUM_PERCENT;
    public float Meal_Box_RON_PERCENT;
    public float Meal_Box_CATEGORY;


    public Meal_Items_Cursor(Cursor c) {
        super(c);
    }

    public BoxCIF17 Get_Transaction_Food_Items(int ColumnIndex) {
        return new BoxCIF17();
    }

    public long Get_Meal_Box_ID() {
        return Meal_Box_ID;
    }

    public String Get_Meal_Box_Type() {
        return Meal_Box_Food_Type;
    }

    public long Get_Meal_Box_Type_ID() {
        return Meal_Box_Type_ID;
    }

    public String Get_Meal_Box_Food_Type()
    {
        return Meal_Box_Food_Type;
    }

    public String Get_Meal_Box_Food_Item_Name() {
        return Meal_Box_Food_Item_Name;
    }

    public float Get_Meal_Box_GRAMS_PER_SERVINGS() {
        return Meal_Box_GRAMS_PER_SERVINGS;
    }

    public float Get_Meal_Box_CALORIE_PER_100G() {
        return Meal_Box_CALORIE_PER_100G;
    }

    public float Get_Meal_Box_FAT_PER_100G() {
        return Meal_Box_FAT_PER_100G;
    }

    public float Get_Meal_Box_SATURATED_FAT() {
        return Meal_Box_SATURATED_FAT;
    }

    public float Get_Meal_Box_TRANS_FAT() {
        return Meal_Box_TRANS_FAT;
    }

    public float Get_Meal_Box_PROTEIN_PER_100G() {
        return Meal_Box_PROTEIN_PER_100G;
    }

    public float Get_Meal_Box_CARBS_PER_100G() {
        return Meal_Box_CARBS_PER_100G;

    }

    public float Get_Meal_Box_SUGAR_PER_100G() {
        return Meal_Box_SUGAR_PER_100G;

    }

    public float Get_Meal_Box_SALT_PER_100G() {
        return Meal_Box_SALT_PER_100G;
    }

    public float Get_Meal_Box_WELLBEING_INDEX() {
        return Meal_Box_WELLBEING_INDEX;
    }

    public float Get_Meal_Box_FIBER() {
        return Meal_Box_FIBER;
    }

    public float Get_Meal_Box_PRICE_STERLING() {
        return Meal_Box_PRICE_STERLING;

    }

    public float Get_Meal_Box_POLYUNSATURATED() {
        return Meal_Box_POLYUNSATURATED;
    }

    public float Get_Meal_Box_MONOUNSATURATED() {
        return Meal_Box_MONOUNSATURATED;
    }

    public float Get_Meal_Box_CHOLESTEROL_MG() {
        return Meal_Box_CHOLESTEROL_MG;
    }

    public float Get_Meal_Box_SODIUM_MG() {
        return Meal_Box_SODIUM_MG;
    }

    public float Get_Meal_Box_POTASSIUM_MG() {
        return Meal_Box_POTASSIUM_MG;
    }

    public float Get_Meal_Box_VITAMIN_A_PERCENT() {
        return Meal_Box_VITAMIN_A_PERCENT;
    }

    public float Get_Meal_Box_VITAMIN_C_PERCENT() {
        return Meal_Box_VITAMIN_C_PERCENT;
    }

    public float Get_Meal_Box_CALCIUM_PERCENT() {
        return Meal_Box_CALCIUM_PERCENT;
    }

    public float Get_Meal_Box_RON_PERCENT() {
        return Meal_Box_RON_PERCENT;
    }

    public float Get_Meal_Box_CATEGORY() {
        return Meal_Box_CATEGORY;
    }


    public void Set_Meal_Box_ID(long IN) {
        Meal_Box_ID = IN;
    }

    public void Set_Meal_Box_Type(String IN) {
        Meal_Box_Type = IN;
    }

    public void Set_Meal_Box_Type_ID(long IN) {
        Meal_Box_Type_ID = IN;
    }

    public void Set_Meal_Box_Food_Type(String IN) {
        Meal_Box_Food_Type = IN;
    }

    public void Set_Meal_Box_Food_Item_Name(String IN) {
        Meal_Box_Food_Item_Name = IN;
    }

    public void Set_Meal_Box_GRAMS_PER_SERVINGS(float IN) {
        Meal_Box_GRAMS_PER_SERVINGS = IN;
    }

    public void Set_Meal_Box_CALORIE_PER_100G(float IN) {
        Meal_Box_CALORIE_PER_100G = IN;
    }

    public void Set_Meal_Box_FAT_PER_100G(float IN) {
        Meal_Box_FAT_PER_100G = IN;
    }

    public void Set_Meal_Box_SATURATED_FAT(float IN) {
        Meal_Box_SATURATED_FAT = IN;
    }

    public void Set_Meal_Box_TRANS_FAT(float IN) {
        Meal_Box_TRANS_FAT = IN;
    }

    public void Set_Meal_Box_PROTEIN_PER_100G(float IN) {
        Meal_Box_PROTEIN_PER_100G = IN;
    }

    public void Set_Meal_Box_CARBS_PER_100G(float IN) {
        Meal_Box_CARBS_PER_100G = IN;
    }

    public void Set_Meal_Box_SUGAR_PER_100G(float IN) {
        Meal_Box_SUGAR_PER_100G = IN;
    }

    public void Set_Meal_Box_SALT_PER_100G(float IN) {
        Meal_Box_SALT_PER_100G = IN;
    }

    public void Set_Meal_Box_WELLBEING_INDEX(float IN) {
        Meal_Box_WELLBEING_INDEX = IN;
    }

    public void Set_Meal_Box_FIBER(float IN) {
        Meal_Box_FIBER = IN;
    }

    public void Set_Meal_Box_PRICE_STERLING(float IN) {
        Meal_Box_PRICE_STERLING = IN;
    }

    public void Set_Meal_Box_POLYUNSATURATED(float IN) {
        Meal_Box_POLYUNSATURATED = IN;
    }

    public void Set_Meal_Box_MONOUNSATURATED(float IN) {
        Meal_Box_MONOUNSATURATED = IN;
    }

    public void Set_Meal_Box_CHOLESTEROL_MG(float IN) {
        Meal_Box_CHOLESTEROL_MG = IN;
    }

    public void Set_Meal_Box_SODIUM_MG(float IN) {
        Meal_Box_SODIUM_MG = IN;
    }

    public void Set_Meal_Box_POTASSIUM_MG(float IN) {
        Meal_Box_POTASSIUM_MG = IN;
    }

    public void Set_Meal_Box_VITAMIN_A_PERCENT(float IN) {
        Meal_Box_VITAMIN_A_PERCENT = IN;
    }

    public void Set_Meal_Box_VITAMIN_C_PERCENT(float IN) {
        Meal_Box_VITAMIN_C_PERCENT = IN;
    }

    public void Set_Meal_Box_CALCIUM_PERCENT(float IN) {
        Meal_Box_CALCIUM_PERCENT = IN;
    }

    public void Set_Meal_Box_RON_PERCENT(float IN) {
        Meal_Box_RON_PERCENT = IN;
    }

    public void Set_Meal_Box_CATEGORY(float IN) {
        Meal_Box_CATEGORY = IN;
    }


    public ArrayList<Meal_Items_Cursor> Get_Transactions_Food_Items(String Transaction_ID, Context context) {
        MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(context);

        ArrayList<Meal_Items_Cursor> deliverables = data_model_adapter.Get_Meal_Box_Transactions(Transaction_ID);

        return deliverables;
    }


    public ArrayList<Meal_Items_Cursor> GetMealBoxItems() {
        ArrayList<Meal_Items_Cursor> delivery = new ArrayList<Meal_Items_Cursor>();

        while (!(isBeforeFirst() || isAfterLast())) {

            this.Set_Meal_Box_ID((new RoundingCIF13()).StringToLong((getString(getColumnIndex(COLUMN_MEAL_BOX_ID)))));
            delivery.add(this);
            return delivery;
        }
        return null;

    }

    public ArrayList<Breakfast_Box_CIF17> Get_Meal_Box_Action()
    {

        Breakfast_Box_CIF17 T100 = new Breakfast_Box_CIF17();
        Food_Item_CIF4 T200 = new Food_Item_CIF4();
        boolean trash_collector = moveToFirst();

        ArrayList<Breakfast_Box_CIF17> OUTPUT = new ArrayList<Breakfast_Box_CIF17>();

        Log.d("Meal Cursor", "getCount is :" + new RoundingCIF13().IntToString(getCount()));

        for(int x = 0; x<getCount();x++)
        {
            //while(!(isBeforeFirst() || isAfterLast())) {

            Log.d("Meal Cursor", "This is Row Count :" + new RoundingCIF13().IntToString(getCount()));

            T100.Set_Meal_Box_ID((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLUMN_MEAL_BOX_ID))));
            Log.d("Cursor MealBxID", new RoundingCIF13().LongToString(T100.Get_Meal_Box_ID()));

            T100.Set_Breakfast_ID((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLUMN_MEAL_BOX_ID))));
            Log.d("Cursor MealBxID", new RoundingCIF13().LongToString(T100.Get_Breakfast_ID()));

            T100.Set_Breakfast_Meal_Type(COLUMUM_MEAL_BOX_MEAL_TYPE);
            Log.d("Cursor MealBxType", T100.Get_Breakfast_Meal_Type());

            T100.Set_Breakfast_Meal_Type_ID((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLUMUM_MEAL_BOX_MEAL_TYPE_ID))));
            Log.d("Cursor MealTID", new RoundingCIF13().LongToString(T100.Get_Breakfast_Meal_Type_ID()));

            T100.Set_Meal_Box_Food_Type(COLUMN_MEAL_BOX_FOOD_TYPE);
            Log.d("Cursor Food type", T100.Get_Meal_Box_Food_Type());


            ////// ESE S.C.I. LTD : Black Office : Algrithm Engineering : Food item :

            T200.Set_category(COLUMN_MEAL_BOX_CATEGORY);
            Log.d("FiCIF : Category ", T200.Get_category());

            T200.Set_food_item_name(COLUMN_MEAL_BOX_FOOD_ITEM_NAME);
            Log.d("FiCIF : item name ", T200.Get_food_item_name());

            T200.Set_grams_per_serving_portion(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_GRAMS_PER_SERVING_PORTION));
            Log.d("FiCIF : grams per por  ", new RoundingCIF13().FloatToString(T200.Get_grams_per_serving_portion()));

            T200.Set_calories_per_100g(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_CALORIE_PER_100G));
            Log.d("FiCIF : calories per ", new RoundingCIF13().FloatToString(T200.Get_calories_per_100g()));

            T200.Set_fat_per_100g(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_FAT_PER_100G));
            Log.d("FiCIF : fat per ", new RoundingCIF13().FloatToString(T200.Get_fat_per_100g()));

            T200.Set_saturated_fat(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_SATURATED_FAT));
            Log.d("FiCIF : sat per ", new RoundingCIF13().FloatToString(T200.Get_saturated_fat()));

            T200.Set_protein_per_100g(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_PROTEIN_PER_100G));
            Log.d("FiCIF : protein ", new RoundingCIF13().FloatToString(T200.Get_protein_per_100g()));

            T200.Set_carbs_per_100g(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_CARBS_PER_100G));
            Log.d("FiCIF : carbs ", new RoundingCIF13().FloatToString(T200.Get_carbs_per_100g()));

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            T200.Set_trans_fat(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_TRANS_FAT));
            Log.d("FiCIF : trans fat ", new RoundingCIF13().FloatToString(T200.Get_trans_fat()));

            T200.Set_sugar_per_100g( new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_SUGAR_PER_100G));
            Log.d("FiCIF : sugar ", new RoundingCIF13().FloatToString(T200.Get_sugar_per_100g()));

            T200.Set_salt_per_100g(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_SALT_PER_100G));
            Log.d("FiCIF : salt ", new RoundingCIF13().FloatToString(T200.Get_salt_per_100g()));

            T200.Set_wellbeing_index(new RoundingCIF13().StringToBool(COLUMN_MEAL_BOX_WELLBEING_INDEX));
            Log.d("FiCIF : well index ", new RoundingCIF13().BoolToString(T200.Get_wellbeing_index()));

            T200.Set_fiber(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_FIBER));
            Log.d("FiCIF : fiber ", new RoundingCIF13().FloatToString(T200.Get_fiber()));

            T200.Set_price_sterling(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_PRICE_STERLING));
            Log.d("FiCIF : GBP ", new RoundingCIF13().FloatToString(T200.Get_price_sterling()));

            T200.Set_polyunsaturated(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_POLYUNSATURATED));
            Log.d("FiCIF poly:  ", new RoundingCIF13().FloatToString(T200.Get_polyunsaturated()));

            T200.Set_monounsaturated(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_MONOUNSATURATED));
            Log.d("FiCIF mono:  ", new RoundingCIF13().FloatToString(T200.Get_monounsaturated()));

            T200.Set_cholesterol_mg(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_CHOLESTEROL_MG));
            Log.d("FiCIF chol:  ", new RoundingCIF13().FloatToString(T200.Get_cholesterol_mg()));

            T200.Set_sodium_mg(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_SODIUM_MG));
            Log.d("FiCIF sodium:  ", new RoundingCIF13().FloatToString(T200.Get_sodium_mg()));

            T200.Set_potassium_mg(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_POTASSIUM_MG));
            Log.d("FiCIF potass: ", new RoundingCIF13().FloatToString(T200.Get_potassium_mg()));

            T200.Set_vitamin_a_percent(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_VITAMIN_A_PERCENT));
            Log.d("FiCIF vit a: ", new RoundingCIF13().FloatToString(T200.Get_vitamin_a_percent()));

            T200.Set_vitamin_c_percent(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_VITAMIN_C_PERCENT));
            Log.d("FiCIF vit c: ", new RoundingCIF13().FloatToString(T200.Get_vitamin_c_percent()));

            T200.Set_calcium_percent(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_CALCIUM_PERCENT));
            Log.d("FiCIF calcuim: ", new RoundingCIF13().FloatToString(T200.Get_calcium_percent()));

            T200.Set_iron_percent(new RoundingCIF13().StringToFloat(COLUMN_MEAL_BOX_IRON_PERCENT));
            Log.d("FiCIF iron : ", new RoundingCIF13().FloatToString(T200.Get_iron_percent()));




            T100.addFoodItem(T200);
            OUTPUT.add(T100);

            Show_Breakfast_item(T100);
            Show_Acompanying_Food_item(T200);

            trash_collector = moveToNext();

    }

        return OUTPUT;
}

private void Show_Breakfast_item(Breakfast_Box_CIF17 m)
{


    Log.d("Database: B Meal_type", m.Get_Breakfast_Meal_Type());
    Log.d("Database: B Meal_BFtype", m.Get_Meal_Box_Food_Type());
    Log.d("Database: B Amount", new RoundingCIF13().IntToString(m.Get_Breakfast_Amount()));
    Log.d("Database: B Balance", new RoundingCIF13().IntToString(m.Get_Breakfast_Balance()));
    Log.d("Database: Long Date", new RoundingCIF13().LongToString(m.Get_Breakfast_Date()));
    Log.d("Database: The ID", new RoundingCIF13().LongToString((m.Get_Breakfast_ID())));
    Log.d("Database: B Meal_ID", new RoundingCIF13().LongToString(m.Get_Breakfast_Meal_Type_ID()));
    Log.d("Database: Meal Box ID", new RoundingCIF13().LongToString(m.Get_Meal_Box_ID()));
    Log.d("Database: Calorie IN", new RoundingCIF13().IntToString(m.Get_Calories_IN()));
    Log.d("Database: Calorie OUT", new RoundingCIF13().IntToString(m.Get_Calories_OUT()));



}

private void Show_Acompanying_Food_item(Food_Item_CIF4 x)
{
    Log.d("Food Items Time : ", x.Get_food_item_name());
}


}


