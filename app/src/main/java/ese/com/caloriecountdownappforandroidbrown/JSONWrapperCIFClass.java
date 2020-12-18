package ese.com.caloriecountdownappforandroidbrown;

//Allows app to receive Food/Energy item Data from either internal database or external database(s) seamless i without ever
//knowing or differentiating the difference
//Blow and Blown & continue &

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONStringer;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONWrapperCIFClass extends Transaction_CIF22 implements JSONWrapperCIFInterface
{
    //Gets Data seamlessy from external or internal items databse or both.

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


    }
    */

    private Transaction_CIF22 my_Transaction_CIF22;

    public void Set_My_Transaction_CIF22(Transaction_CIF22 IN)
    {
        my_Transaction_CIF22 = IN;
    }

    public Transaction_CIF22 getMy_Transaction_CIF22() {
        return my_Transaction_CIF22;
    }

    private Object JSONObject;

    private JSONObject theJSONObject;

    private String JSONText;  //Parse function takes IN JSON Text transforms into in intermediary JSONOBject then
    //helper funcition takes JSON Object and Parses into CIF22 according to data structure and reserializes back into text
    //to go in .NET SQL Server Database or SQLite internally or third party, seamless, all can't tell the difference apple www ESE /visa.sys

    public void Set_My_JSONText(String IN)
    {
        JSONText = IN;
    }

    public String Get_My_JSONText()
    {
        return JSONText;
    }

    public String WrapTransactions_CIF22(Transaction_CIF22 INPUT)
    {
       return new String();
    }

    public Transaction_CIF22 UnWrapTransactions_CIF22(String INPUT)
    {
        return new Transaction_CIF22();
    }


    //Wrapper serializes TransactionCIF 22Object to text output JSONText
    // DeWrap takes a JSONText and deserialize it into Object TransactionCIF22
    //Parse take a JSONText and Produces a JSONText transasmitted over the Network.

}
