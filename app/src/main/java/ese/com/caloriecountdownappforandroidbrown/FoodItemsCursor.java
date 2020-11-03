package ese.com.caloriecountdownappforandroidbrown;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by ESE on 30/10/2015.
 */
public class FoodItemsCursor extends CursorWrapper
{
    //A Convenience class to wrap a cursor that returns rows for the "food items" table.
    //The {@ link getFoods()} method will give you a Food_Item instance representing the current row.

    private static final String TABLE_FOODITEMS = "food_items";

    private static final String COLUMN_FOODITEMS_ID = "food_item_id";
    private static final String COLUMN_FOODITEMS_FOOD_TYPE = "food_type";
    private static final String COLUMN_FOODITEMS_FOOD_ITEM_NAME = "food_item_name";
    private static final String COLUMN_FOODITEMS_GRAMS_PER_SERVING_PORTION ="grams_per_serving_portion";
    private static final String COLUMN_FOODITEMS_CALORIE_PER_100G = "calories_per_100g";
    private static final String COLUMN_FOODITEMS_FAT_PER_100G = "fat_per_100g";
    private static final String COLUMN_FOODITEMS_SATURATED_FAT = "saturated_fat";
    private static final String COLUMN_FOODITEMS_TRANS_FAT = "trans_fat";
    private static final String COLUMN_FOODITEMS_PROTEIN_PER_100G = "protein_per_100g";
    private static final String COLUMN_FOODITEMS_CARBS_PER_100G = "carbs_per_100g";
    private static final String COLUMN_FOODITEMS_SUGAR_PER_100G = "sugar_per_100g";
    private static final String COLUMN_FOODITEMS_SALT_PER_100G = "salt_per_100g";
    private static final String COLUMN_FOODITEMS_WELLBEING_INDEX = "wellbeing_index";
    private static final String COLUMN_FOODITEMS_FIBER = "fiber";
    private static final String COLUMN_FOODITEMS_PRICE_STERLING = "price_sterling";
    private static final String COLUMN_FOODITEMS_POLYUNSATURATED = "polyunsaturated";
    private static final String COLUMN_FOODITEMS_MONOUNSATURATED = "monounsaturated ";
    private static final String COLUMN_FOODITEMS_CHOLESTEROL_MG = "cholesterol_mg";
    private static final String COLUMN_FOODITEMS_SODIUM_MG = "sodium_mg";
    private static final String COLUMN_FOODITEMS_POTASSIUM_MG = "potassium_mg";
    private static final String COLUMN_FOODITEMS_VITAMIN_A_PERCENT = "vitamin_a_percent";
    private static final String COLUMN_FOODITEMS_VITAMIN_C_PERCENT = "vitamin_c_percent";
    private static final String COLUMN_FOODITEMS_CALCIUM_PERCENT = "calcium_percent";
    private static final String COLUMN_FOODITEMS_IRON_PERCENT = "iron_percent";
    private static final String COLUMN_FOODITEMS_CATEGORY = "category";

    public FoodItemsCursor(Cursor c)
    {
        super(c);
    }

    public Food_Item_CIF4 getFood_Item()
    {
        //returns a Food_Item_CIF4 Object configured from/for the current row, or null if the current row
        //is invalid.

        if(isBeforeFirst() || isAfterLast())return null;

        Food_Item_CIF4 food_item_cif4 = new Food_Item_CIF4();
        long food_item_id = getLong(getColumnIndex(COLUMN_FOODITEMS_ID));
       food_item_cif4.Set_id(food_item_id);

        String food_item_name = getString(getColumnIndex(COLUMN_FOODITEMS_FOOD_ITEM_NAME));
        food_item_cif4.Set_food_item_name(food_item_name);

        float food_item_grams_per_serving_portion = getFloat(getColumnIndex(COLUMN_FOODITEMS_GRAMS_PER_SERVING_PORTION));
        food_item_cif4.Set_grams_per_serving_portion(food_item_grams_per_serving_portion);

        float food_item_calories = getFloat(getColumnIndex(COLUMN_FOODITEMS_CALORIE_PER_100G));
        food_item_cif4.Set_calories_per_100g(food_item_calories);

        float food_fat_per_100g = getFloat(getColumnIndex(COLUMN_FOODITEMS_FAT_PER_100G));
        food_item_cif4.Set_fat_per_100g(food_fat_per_100g);

        float food_saturated_fat = getFloat(getColumnIndex(COLUMN_FOODITEMS_SATURATED_FAT));
        food_item_cif4.Set_saturated_fat(food_saturated_fat);

        float food_trans_fat = getFloat(getColumnIndex(COLUMN_FOODITEMS_TRANS_FAT));
        food_item_cif4.Set_trans_fat(food_trans_fat);

        float food_item_carbs = getFloat(getColumnIndex(COLUMN_FOODITEMS_CARBS_PER_100G));
        food_item_cif4.Set_carbs_per_100g(food_item_carbs);

        float food_item_salt = getFloat(getColumnIndex(COLUMN_FOODITEMS_SUGAR_PER_100G));
        food_item_cif4.Set_sugar_per_100g(food_item_salt);

        float food_item_protien = getFloat(getColumnIndex(COLUMN_FOODITEMS_PROTEIN_PER_100G));
        food_item_cif4.Set_protein_per_100g(food_item_protien);

        float food_item_wellbeing_index = getFloat(getColumnIndex(COLUMN_FOODITEMS_WELLBEING_INDEX));
        food_item_cif4.Set_wellbeing_index(new RoundingCIF13().StringToBool(new RoundingCIF13().FloatToString(food_item_wellbeing_index)));

        float food_item_fiber = getFloat(getColumnIndex(COLUMN_FOODITEMS_FIBER));
        food_item_cif4.Set_fiber(food_item_fiber);

        float food_item_price_sterling = getFloat(getColumnIndex(COLUMN_FOODITEMS_PRICE_STERLING));
        food_item_cif4.Set_price_sterling(food_item_price_sterling);

        String category = getString(getColumnIndex(COLUMN_FOODITEMS_CATEGORY));
        food_item_cif4.Set_category(category);

        float food_item_poly = getFloat(getColumnIndex(COLUMN_FOODITEMS_POLYUNSATURATED));
        food_item_cif4.Set_polyunsaturated(food_item_poly);

        float food_item_mono = getFloat(getColumnIndex(COLUMN_FOODITEMS_MONOUNSATURATED));
        food_item_cif4.Set_monounsaturated(food_item_mono);

        float food_item_cholesterol = getFloat(getColumnIndex(COLUMN_FOODITEMS_CHOLESTEROL_MG));
        food_item_cif4.Set_cholesterol_mg(food_item_cholesterol);

        float food_item_sodium = getFloat(getColumnIndex(COLUMN_FOODITEMS_SODIUM_MG));
        food_item_cif4.Set_sodium_mg(food_item_sodium);

        float food_item_potassium = getFloat(getColumnIndex(COLUMN_FOODITEMS_POTASSIUM_MG));
        food_item_cif4.Set_potassium_mg(food_item_potassium);

        float food_item_vitamin_a = getFloat(getColumnIndex(COLUMN_FOODITEMS_VITAMIN_A_PERCENT));
        food_item_cif4.Set_vitamin_a_percent(food_item_vitamin_a);

        float food_item_vitamin_c = getFloat(getColumnIndex(COLUMN_FOODITEMS_VITAMIN_C_PERCENT));
        food_item_cif4.Set_vitamin_c_percent(food_item_vitamin_c);

        float food_item_calcium = getFloat(getColumnIndex(COLUMN_FOODITEMS_CALCIUM_PERCENT));
        food_item_cif4.Set_calcium_percent(food_item_calcium);

        float food_item_iron = getFloat(getColumnIndex(COLUMN_FOODITEMS_IRON_PERCENT));
        food_item_cif4.Set_iron_percent(food_item_iron);





        return food_item_cif4;

    }
}

