package ese.com.caloriecountdownappforandroidbrown;

//Allows app to receive Food/Energy item Data from either internal database or external database(s) or ESE's AWS Server and
// seamless i without ever knowing or differentiating the difference within the app.
//Blow and Blown & continue &

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONStringer;
import org.json.JSONObject;
import org.json.JSONTokener;

public  class JSONWrapperCIFClass extends Transaction_CIF22 implements JSONWrapperCIFClassInterface {

    public JSONWrapperCIFClass(Transactions_CIF22 IN)
    {
        my_Transaction_CIF22 = IN;
    }
    //Gets Data seamlessy from external or internal or AWS items database or all three.
    //inhousecsv.json
/*
    {
        "Category"; "EATOUT",

            "Category": "EATOUT",
            "Food item name": "Apple",
            "Portion or Serving Size": 100,
            "Calories": 100,
            "Fat": 10,
            "Saturates": 3,
            "Trans fat": 0,
            "Protein": 38,
            "Carbohydrares": 50,                Software
            "Sugar": 22,
            "Salt": 6,
            "Superfood": true,
            "Fibre": 8,
            "Price": 1,
            "Barcode": 1001010101,
            "Image File": "appletwo.src",
            "Weight in Grams": 100

            pop()
            passio space()
            link with e://drive etc

            {
            "Transaction_Line_CIF17":
            {
            "mTransaction_ID": 0123456789
            "mTransaction_Date": "08/04/2021"
            "mTransaction_Meal_Type": "Breakfast"
            "mTransaction_Meal_Type_ID": 9876543210
            "mTransaction_Amount" : 669
            "mTransaction_Balance": 58880
            "mTransaction_Meal_Box_ID": 7584343245
            "mTransaction_Meal_Box_Food_Type: "Breakfast"
            "Description": "Healthy Meal for Breakfast list of food eaten and drinks drunk"
            "mfood_item_list" :{ "mFoodBox": [ "Food_Item_CiF4":{
            "id" :1234567890,
            "mMeal_ID" :768675746,
            "food_type" : ING,
            "food_item_name" :
    "grams_per_serving_portion;
    " calories_per_100g;
    fat_per_100g;
    saturated_fat;
     trans_fat;
     protein_per_100g;
   carbs_per_100g;
     sugar_per_100g;
     salt_per_100g;
     wellbeing_index;
     fiber;
     price_sterling;
     polyunsaturated;
     monounsaturated;
    cholesterol_mg;
     sodium_mg;
    potassium_mg;
    vitamin_a_percent;
     vitamin_c_percent;
     calcium_percent;
     iron_percent;
     category;
     weight;
     Calorie_Value;
     index;

     Quantity;

    reserve_food_item_name_list;
            }
            }


    }
    */

    private Transactions_CIF22 my_Transaction_CIF22;

    @Override
    public void Set_My_Transaction_CIF22(Transactions_CIF22 IN)
    {
        my_Transaction_CIF22 = IN;
    }

    @Override
    public Transactions_CIF22 getMy_Transaction_CIF22() {
        return my_Transaction_CIF22;
    }

    private Object JSONObject;

    private JSONObject theJSONObject;

    private String JSONText;  //Parse function takes IN JSON Text transforms into in intermediary JSONOBject then
    //helper function takes JSON Object and Parses into a Transaction_CIF022_fragment_Object according to data structure and reserializes back into text
    //to go in .NET SQL Server Database or SQLite internally or third party, seamless, all can't tell the difference apple www ESE /visa.sys

    @Override
    public void Set_My_JSONText(String IN)
    {
        JSONText = IN;
    }

    @Override
    public String Get_My_JSONText()
    {
        return JSONText;
    }

    public ArrayList<Transaction_CIF52> Lines = null;

    @Override
    public String WrapTransactions_CIF22(Transaction_CIF22 INPUT)
    {
       return new String();
    }

    @Override
    public ArrayList<Transaction_CIF52> getLines()
    {
        if(Lines == null)
        {
            return new ArrayList<Transaction_CIF52>();
        }
        else
            {
            Lines = my_Transaction_CIF22.getLines();
            }

        return Lines;
    }



    @Override
    public Transactions_CIF22 UnWrapTransactions_CIF22()
    {
        if(my_Transaction_CIF22 != null)
        {
            //my_Transaction_CIF22 = new Transactions_CIF22();
        }

        return my_Transaction_CIF22;
    }

    @Override
    public String Code_JSONText() {
        return null;
    }

    @Override
    public Transactions_CIF22 DeCode_JSONText(String json_input)
    {
        return new Transactions_CIF22();
    }

    @Override
    public void Set_JSONText(String json_input) {

    }

    @Override
    public String Get_JSONText() {
        return null;
    }

    @Override
    public String Nutritional_Object_to_JSONText(Nutritional_Content_CiFragmented_Object001 INPUT) {
        return null;
    }




    //Wrapper serializes Transaction_CIF022_Object to text Output JSONText.
    // DeWrap takes a JSONText and deserialize it into an Object Transaction_CIF022_fragment.
    //Parse take a JSONText and Produces a JSONText transmitted over the network.

    /******
     *
     *    public Transaction_CIF22 deWrappingParser(JSONWrapperCIFClass DOCUMENT_IN)
     *   {
     *      return new Transaction_CIF22();
     *   }
     *
     *   public JSONWrapperCIFClass Wrapper(Transaction_CIF22 IN)
     *   {
     *   return new JSONWrapperCIFClass();
     *   }

    @Override
    public String WrapTransactions_CIF22(Transaction_CIF22 INPUT)
    {
        return new String("deWrapper's empty");
    }

    @Override
    public Transaction_CIF22 UnWrapTransactions_CIF22(String INPUT)
    {
        Transaction_CIF22 OUTPUT = new Transaction_CIF22();
        return OUTPUT;
    }

    public Transaction_CIF22 UnWrapTransactions_CIF22(String INPUT, Transaction_CIF22 In)
    {
        return In;
    }

    public Transaction_CIF22 UnWrapTransaction_CIF22(Transaction_CIF22 INPUT)
    {
        return INPUT;
    }
}

     */


}
