package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.support.v4.widget.ViewGroupUtils;
import android.util.Log;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;
import java.util.Date;

public class SHealth_Cursor_241 extends CursorWrapper
{








        //A Convenience clas to wrap a cursor that returns rows for the "food items" table.
        //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.


        private static final String TABLE_HEALTH_PROFILE_TABLE = "health_profile";
        private static final String COLUMN_VITALS_ID = "vitals_id";
        private static final String COLUMN_Client_ACCOUNT_NAME = "client_account_name";
        private static final String COLUMN_Client_DOB = "client_dob";
        private static final String COLUMN_Client_BMI = "client_bmi";
        private static final String COLUMN_Client_BODYFAT = "client_bodyfat";
        private static final String COLUMN_Client_BMR = "client_bmr";
        private static final String COLUMN_Client_VITALS_STRING ="client_vitals_string";
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




        public SHealth_Cursor_241(Cursor cursorx)
        {
            super(cursorx);
            cursor = cursorx;
        }

        public HealthProfileCiF3 Get_HealthProfileCIF3()
        {

            HealthProfileCiF3 T100 = new HealthProfileCiF3();

            boolean trash_collector = moveToFirst();


            for(int x = 0; x < getCount(); x++){//while(!(isBeforeFirst() || isAfterLast())) {



                Log.d("SHealth_Cursor", "This is Row Count :" + new RoundingCIF13().IntToString(getCount()));

                T100.setVital_id(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_VITALS_ID))));
                android.util.Log.d("Money Shot : Vitals ID", new RoundingCIF13().FloatToString(T100.getVital_id()));

                T100.setFirstname(getString(getColumnIndex(COLUMN_Client_ACCOUNT_NAME)));
                android.util.Log.d("Money Shot : Firstname", (T100.getFirstname()));
                T100.setLastname(getString(getColumnIndex(COLUMN_Client_ACCOUNT_NAME)));
                android.util.Log.d("Money Shot : Laste nate", T100.getLastname());

                T100.setDOB2((new RoundingCIF13()).StringToLong(getString(getColumnIndex(COLUMN_Client_DOB))));
                android.util.Log.d("Money Shot : DOB2", new RoundingCIF13().LongToString(T100.getDOB2()));

                T100.Set_Body_Mass_Index(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_BMI))));
                android.util.Log.d("Money Shot : BMI", new RoundingCIF13().FloatToString(T100.Get_Body_Mass_Index()));

                T100.Set_Body_Fat_Percentage((new RoundingCIF13()).StringToInt(getString(getColumnIndex(COLUMN_Client_BODYFAT))));
                android.util.Log.d("Money Shot : Body fat percentage", new RoundingCIF13().FloatToString(T100.Get_Body_Fat_Percentage()));

                T100.setBMR((new RoundingCIF13()).StringToDouble(getString(getColumnIndex(COLUMN_Client_BMR))));
                android.util.Log.d("Money Shot : BMR", new RoundingCIF13().DoubleToString(T100.getBMR()));

                T100.setVitalStatsString2(getString(getColumnIndex(COLUMN_Client_VITALS_STRING)));
                android.util.Log.d("Money Shot : Vitals String  ", T100.getVitalStatsString2());

                T100.setStartCountdown(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_OPENING_BALANCE))));
                android.util.Log.d("Money Shot : Opening Balance  ", new RoundingCIF13().IntToString(T100.getStartCountdown()));

                T100.setHeightm(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_HEIGHT_CM))));
                android.util.Log.d("Money Shot : Client Height CM ", new RoundingCIF13().FloatToString(T100.getHeightm()));

                T100.setClientGender(getString(getColumnIndex(COLUMN_Client_GENDER)));
                android.util.Log.d("Money Shot : Client Gender ", T100.getClientGender());

                T100.setEmailaddress(getString(getColumnIndex(COLUMN_Client_EMAIL)));
                android.util.Log.d("Money Shot : Cleint email  ", T100.getEmailaddress());

                T100.setStartWeight(getString(getColumnIndex(COLUMN_Client_START_WEIGHT)));
                android.util.Log.d("Money Shot : Start Weight ", T100.getStartWeight());

                T100.setTargetWeight(getString(getColumnIndex(COLUMN_Client_TARGET_WEIGHT)));
                android.util.Log.d("Money Shot : Target Weight  ", T100.getTargetWeight());

                T100.setClientBodyFrame(getString(getColumnIndex(COLUMN_Client_BODY_FRAME)));
                android.util.Log.d("Money Shot : Body frame ", T100.getClientBodyFrame());

                T100.setStartDate(new Date(new RoundingCIF13().StringToLong(getString(getColumnIndex(COLUMN_Client_START_DATE)))));
                android.util.Log.d("Money Shot : Start date ", new RoundingCIF13().DateToStringStandard(T100.getStartDate()));

                T100.Set_Lean_Body_Mass(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_LEAN_BODY_MASS))));
                android.util.Log.d("Money Shot : Lean body mass ", new RoundingCIF13().FloatToString(T100.Get_Lean_Body_Mass()));

                T100.Set_Waist_Circumference(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_WAIST_CIRCUMFERENCE))));
                android.util.Log.d("Money Shot : Waist Circumference ", new RoundingCIF13().FloatToString(T100.Get_Waist_Circumference()));

                T100.Set_Blood_Pressure(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_BLOOD_PRESSURE))));
                android.util.Log.d("Money Shot : Blood Pressue ", new RoundingCIF13().FloatToString(T100.Get_Waist_Circumference()));

                T100.Set_Body_Temperture(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_BODY_TEMPERATURE))));
                android.util.Log.d("Money Shot : Body Temperature ", new RoundingCIF13().FloatToString(T100.Get_Body_Temperture()));

                T100.Set_Alcohol_Content(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_ALCOHOL_CONTENT))));
                android.util.Log.d("Money Shot : Alchohol content  ", new RoundingCIF13().FloatToString(T100.Get_Alcohol_Content()));

                T100.Set_Blood_Glucose(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_BLOOD_GLUCOSE))));
                android.util.Log.d("Money Shot :Blood Glucose  ", new RoundingCIF13().FloatToString(T100.Get_Blood_Glucose()));

                T100.Set_Electrocardiogram_ECG(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_ECG_))));
                android.util.Log.d("Money Shot : ECG ", new RoundingCIF13().FloatToString(T100.Get_Electrocardiogram_ECG()));

                T100.Set_Heart_Rate_Variability(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_HEART_RATE_VARIABILITY))));
                android.util.Log.d("Money Shot : Heart Rate V ", new RoundingCIF13().FloatToString(T100.Get_Heart_Rate_Variability()));

                T100.Set_High_Heart_Rate_Notifications(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_HIGH_HEART_RATE_NOTIFICATION))));
                android.util.Log.d("Money Shot : High Heart rate ", new RoundingCIF13().IntToString(T100.Get_High_Heart_Rate_Notifications()));

                T100.Set_Irregular_Rhythm_Notifications(new RoundingCIF13().StringToInt((getString(getColumnIndex(COLUMN_Client_IRREGULAR_HEART_RHYTHM_NOTIFICATION)))));
                android.util.Log.d("Money Shot : Irr ", new RoundingCIF13().IntToString(T100.Get_Irregular_Rhythm_Notifications()));

                T100.Set_Low_Heart_Rate_Notifications(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_LOW_HEART_RATE_NOTIFICATION))));
                android.util.Log.d("Money Shot : Heart rate low ", new RoundingCIF13().IntToString(T100.Get_Low_Heart_Rate_Notifications()));

                T100.Set_Walking_Heart_Rate(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_WALKING_HEART_RATE))));
                android.util.Log.d("Money Shot : Walking Heart Rate ", new RoundingCIF13().FloatToString(T100.Get_Walking_Heart_Rate()));

                T100.Set_Resting_Heart_Rate(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_RESTING_HEART_RATE))));
                android.util.Log.d("Money Shot : Resting Heart Rate ", new RoundingCIF13().FloatToString(T100.Get_Resting_Heart_Rate()));

                T100.Set_Heart_Rates(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_HEART_RATE))));
                android.util.Log.d("Money Shot : Heart Rate ", new RoundingCIF13().FloatToString(T100.Get_Heart_Rates()));

                T100.Set_Respiratory_Rates(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_RESPIRATORY_RATE))));
                android.util.Log.d("Money Shot : Respiratory Rate ", new RoundingCIF13().FloatToString(T100.Get_Respiratory_Rates()));

                T100.Set_Electrocardiogram_ECG(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_ELECTRODERMAL_ACTIVITY))));
                android.util.Log.d("Money Shot : ECG ", new RoundingCIF13().FloatToString(T100.Get_Electrocardiogram_ECG()));

                T100.Set_Forced_Expiratory_Volume_1_sec(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_FORCED_EXPIRATORY_VOLUME))));
                android.util.Log.d("Money Shot : Volume 2 ", new RoundingCIF13().FloatToString(T100.Get_Forced_Expiratory_Volume_1_sec()));

                T100.Set_Forced_Vital_Capacity(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_FORCED_VITAL_CAPACITY))));
                android.util.Log.d("Money Shot : Forced Expiratory Vital Cap", new RoundingCIF13().FloatToString(T100.Get_Forced_Vital_Capacity()));

                T100.Set_Inhaler_Usage(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_INHALER_USAGE))));
                android.util.Log.d("Money Shot : Inhaler ", new RoundingCIF13().IntToString(T100.Get_Inhaler_Usage()));

                T100.Set_Insulin_Delivery(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_INSULIN_DELIVERY))));
                android.util.Log.d("Money Shot : Insulin ", new RoundingCIF13().IntToString(T100.Get_Inhaler_Usage()));

                T100.Set_Oxygen_Saturation(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_OXYGEN_SATURATION))));
                android.util.Log.d("Money Shot : Oxygen Saturation ", new RoundingCIF13().FloatToString(T100.Get_Oxygen_Saturation()));

                T100.Set_Peak_Expiratory_Flow_Rate(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_PEAK_EXPIRATORY_FLOW_RATE))));
                android.util.Log.d("Money Shot : Peak Exp ", new RoundingCIF13().FloatToString(T100.Get_Peak_Expiratory_Flow_Rate()));

                T100.Set_UV_Index(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_UV_INDEX))));
                android.util.Log.d("Money Shot : UV Index ", new RoundingCIF13().FloatToString(T100.Get_UV_Index()));

                T100.Set_Peripheral_Perfusion_Index(new RoundingCIF13().StringToFloat(getString(getColumnIndex(COLUMN_Client_PERIPHERAL_PERFUSION_INDEX))));
                android.util.Log.d("Money Shot : Perfusion ", new RoundingCIF13().FloatToString(T100.Get_Peripheral_Perfusion_Index()));

                T100.Set_Data_Sources(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_DATA_SOURCES))));
                android.util.Log.d("Money Shot : Data Sources ", new RoundingCIF13().IntToString(T100.Get_Data_Sources()));

                T100.Set_Manual_Data_Sourcing(new RoundingCIF13().StringToInt(getString(getColumnIndex(COLUMN_Client_MANUAL_SOURCES))));
                android.util.Log.d("Money Shot : Manual Sources ", new RoundingCIF13().IntToString(T100.Get_Manual_Data_Sourcing()));


                //BBox.Set_Breakfast_ID((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
                //Mealio = new Meal_Items_Cursor(cursor);
                //Transaction_Items = Mealio.Get_Transaction_Food_Items(new RoundingCIF13().StringToInt((getString(getColumnIndex(COLUMN_TRANSACTIONS_ID)))));
                //BBox.Set_Breakfast_Date((new RoundingCIF13()).StringToLong((getString(getColumnIndex(COLMUM_TRANSACTIONS_DATE)))));
                //BBox.Set_Breakfast_Meal_Type(getString(getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE)));
                //BBox.Set_Breakfast_Meal_Type_ID((new RoundingCIF13().StringToInt((getString((getColumnIndex(COLUMUM_TRANSACTIONS_MEAL_TYPE_ID)))))));
                //BBox.Set_Breakfast_Amount((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_AMOUNT)))));
                //BBox.Set_Breakfast_Balance((new RoundingCIF13()).StringToInt((getString(getColumnIndex(COLUMUM_TRANSACTIONS_BALANCE)))));

                //T100.Set_Internal_Box(BBox);

                //dummy_rice_4.Set_category("ING");
                //dummy_rice_4.Set_food_item_name("McDonalds : Burgers : Double Cheeseburger flo");
                //dummy_rice_4.Set_grams_per_serving_portion((float)100.00);
                //dummy_rice_4.Set_calories_per_100g((float)445.00);
                //dummy_rice_4.Set_fat_per_100g((float)5.00);
                //dummy_rice_4.Set_carbs_per_100g((float)5.00);
                //dummy_rice_4.Set_protein_per_100g((float)50);

                //Line_50.add_Food_item(dummy_rice_4);
                //T101.Set_Single_Transaction_Line(Line_50);
                //T100.Add_TransactionLine_2_List(T101);


                trash_collector = moveToNext();


            }


            return T100;

        }
}


