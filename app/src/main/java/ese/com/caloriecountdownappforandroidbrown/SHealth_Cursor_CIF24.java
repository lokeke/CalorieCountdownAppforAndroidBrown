package ese.com.caloriecountdownappforandroidbrown;

import android.util.Log;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;

public class SHealth_Cursor_CIF24 extends CursorWrapper {


    //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.


    private static final String TABLE_HEALTH_PROFILE_TABLE = "health_profile";
    private static final String COLUMN_VITALS_ID = "vitals_id";
    private static final String COLUMN_Client_ACCOUNT_NAME = "client_account_name";
    private static final String COLUMN_Client_DOB = "client_dob";
    private static final String COLUMN_Client_BMI = "client_bmi";
    private static final String COLUMN_Client_BODYFAT = "client_bodyfat";
    private static final String COLUMN_Client_BMR = "client_bmr";
    private static final String COLUMN_Client_VITALS_STRING = "client_vitals_string";
    private static final String COLUMN_Client_OPENING_BALANCE = "client_opening_balance";
    private static final String COLUMN_Client_HEIGHT_CM = "client_height_cm";
    private static final String COLUMN_Client_EMAIL = "client_email";
    private static final String COLUMN_Client_GENDER = "client_gender";
    private static final String COLUMN_Client_START_WEIGHT = "client_start_weight";
    private static final String COLUMN_Client_TARGET_WEIGHT = "client_target_weight";
    private static final String COLUMN_Client_BODY_FRAME = "client_body_frame";
    private static final String COLUMN_Client_START_DATE = "client_start_date";
    private static final String COLUMN_Client_LEAN_BODY_MASS = "client_lean_body_mass";
    private static final String COLUMN_Client_WAIST_CIRCUMFERENCE = "client_waist_circumference";
    private static final String COLUMN_Client_BLOOD_PRESSURE = "client_blood_pressure";
    private static final String COLUMN_Client_BODY_TEMPERATURE = "client_body_temperature";
    private static final String COLUMN_Client_ALCOHOL_CONTENT = "client_alcohol_content";
    private static final String COLUMN_Client_BLOOD_GLUCOSE = "client_blood_glucose";
    private static final String COLUMN_Client_ECG_ = "client_ECG";
    private static final String COLUMN_Client_HEART_RATE_VARIABILITY = "client_heart_rate_variability";
    private static final String COLUMN_Client_HIGH_HEART_RATE_NOTIFICATION = "client_high_heart_rate_notification";
    private static final String COLUMN_Client_IRREGULAR_HEART_RHYTHM_NOTIFICATION = "client_irregular_heart_rhythm_notification";
    private static final String COLUMN_Client_LOW_HEART_RATE_NOTIFICATION = "client_low_heart_rate_notification";
    private static final String COLUMN_Client_WALKING_HEART_RATE = "client_walking_heart_rate";
    private static final String COLUMN_Client_HEART_RATE = "client_heart_rate";
    private static final String COLUMN_Client_RESTING_HEART_RATE = "client_resting_heart_rate";
    private static final String COLUMN_Client_RESPIRATORY_RATE = "client_respiratory_rate";
    private static final String COLUMN_Client_ELECTRODERMAL_ACTIVITY = "client_electrodermal_activity";
    private static final String COLUMN_Client_FORCED_EXPIRATORY_VOLUME = "client_forced_expiratory_volume";
    private static final String COLUMN_Client_FORCED_VITAL_CAPACITY = "client_forced_vital_capacity";
    private static final String COLUMN_Client_INHALER_USAGE = "client_inhaler_usage";
    private static final String COLUMN_Client_INSULIN_DELIVERY = "client_insulin_delivery";
    private static final String COLUMN_Client_OXYGEN_SATURATION = "client_oxygen_saturation";
    private static final String COLUMN_Client_PEAK_EXPIRATORY_FLOW_RATE = "client_peak_expiratory_flow_rate";
    private static final String COLUMN_Client_UV_INDEX = "client_uv_index";
    private static final String COLUMN_Client_PERIPHERAL_PERFUSION_INDEX = "client_peripheral_perfusion_index";
    private static final String COLUMN_Client_DATA_SOURCES = "client_data_sources";
    private static final String COLUMN_Client_MANUAL_SOURCES = "client_manual_sources";

    private HealthProfileCiF3 health_profile_cif;
    private Cursor cursor;


    public SHealth_Cursor_CIF24(Cursor cursorx) {
        super(cursorx);
        cursor = cursorx;
    }

    public HealthProfileCiF3 Get_HealthProfileCIF3() {

        HealthProfileCiF3 T100 = new HealthProfileCiF3();

        boolean trash_collector = moveToFirst();


        for (int x = 0; x < getCount(); x++) {//while(!(isBeforeFirst() || isAfterLast())) {


            Log.d("SHealth_Cursor", "This is Row Count :" + new RoundingCIF13().IntToString(getCount()));

            T100.setVital_id(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_VITALS_ID))));
            android.util.Log.d("Money Shot : Vitals ID", new RoundingCIF13().FloatToString(T100.getVital_id()));

            T100.setFirstname(getString(getColumnIndex(COLUMN_Client_ACCOUNT_NAME)));
            android.util.Log.d("Money Shot : Vitals ID", T100.getFirstname());
            T100.setLastname(getString(getColumnIndex(COLUMN_Client_ACCOUNT_NAME)));
            android.util.Log.d("Money Shot : Vitals ID", (T100.getLastname()));

    /*Line_50.Set_Transaction_Amount((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_AMOUNT))));
    android.util.Log.d("Money Shot : Amount", new RoundingCIF13().IntToString(Line_50.Get_Transaction_Amount()));

    Line_50.Set_Transaction_Meal_Type(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE)));
    android.util.Log.d("Money Shot : Meal_Type", Line_50.Get_Transaction_Meal_Type());

    Line_50.Set_Transaction_Meal_Type_ID((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE_ID))));
    android.util.Log.d("Money Shot : Meal T ID", new RoundingCIF13().LongToString(Line_50.Get_Transaction_Meal_Type_ID()));

    Line_50.Set_Transaction_Balance((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMUM_TRANSACTIONS_BALANCE))));
    android.util.Log.d("Money Shot : Balance", new RoundingCIF13().IntToString(Line_50.Get_Transaction_Balance()));

    Line_50.Set_Transaction_DateX((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLMUM_TRANSACTIONS_DATE))));
    android.util.Log.d("Money Shot : Date x", new RoundingCIF13().LongToString(Line_50.Get_Transaction_DateX().getTime()));*/


            //BBox.Set_Breakfast_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
            //Mealio = new Meal_Items_Cursor(cursor);
            //Transaction_Items = Mealio.Get_Transaction_Food_Items(new RoundingCIF13().StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
            //BBox.Set_Breakfast_Date((new RoundingCIF13()).StringToLong((getString(getColumnIndex(COLMUM_TRANSACTIONS_DATE)))));
            //BBox.Set_Breakfast_Meal_Type(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE)));
            //BBox.Set_Breakfast_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE_ID)))))));
            //BBox.Set_Breakfast_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_AMOUNT)))));
            //BBox.Set_Breakfast_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_BALANCE)))));

            //T100.Set_Internal_Box(BBox);

    /*dummy_rice_4.Set_category("ING");
    dummy_rice_4.Set_food_item_name("McDonalds : Burgers : Double Cheeseburger flo");
    dummy_rice_4.Set_grams_per_serving_portion((float)100.00);
    dummy_rice_4.Set_calories_per_100g((float)445.00);
    dummy_rice_4.Set_fat_per_100g((float)5.00);
    dummy_rice_4.Set_carbs_per_100g((float)5.00);
    dummy_rice_4.Set_protein_per_100g((float)50);

    Line_50.add_Food_item(dummy_rice_4);
    T101.Set_Single_Transaction_Line(Line_50);
    T100.Add_TransactionLine_2_List(T101);*/


            trash_collector = moveToNext();


        }


        return T100;

    }
}
