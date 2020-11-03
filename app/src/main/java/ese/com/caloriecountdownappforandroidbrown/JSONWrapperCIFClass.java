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

public class JSONWrapperCIFClass extends Transaction_CIF22 implements JSONWrapperCIFInterface
{

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


    }
    */

    private Transactions_CIF22 my_Transaction_CIF22;

    public void Set_My_Transaction_CIF22(Transactions_CIF22 IN)
    {
        my_Transaction_CIF22 = IN;
    }

    public Transactions_CIF22 getMy_Transaction_CIF22() {
        return my_Transaction_CIF22;
    }

    private Object JSONObject;

    private JSONObject theJSONObject;

    private String JSONText;  //Parse function takes IN JSON Text transforms into in intermediary JSONOBject then
    //helper function takes JSON Object and Parses into a Transaction_CIF022_fragment_Object according to data structure and reserializes back into text
    //to go in .NET SQL Server Database or SQLite internally or third party, seamless, all can't tell the difference apple www ESE /visa.sys

    public void Set_My_JSONText(String IN)
    {
        JSONText = IN;
    }

    public String Get_My_JSONText()
    {
        return JSONText;
    }

    public ArrayList<Transaction_CIF52> Lines = null;

    public String WrapTransactions_CIF22(Transaction_CIF22 INPUT)
    {
       return new String();
    }

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



    public Transactions_CIF22 UnWrapTransactions_CIF22()
    {
        if(my_Transaction_CIF22 != null)
        {
            my_Transaction_CIF22 = new Transactions_CIF22();
        }

        return my_Transaction_CIF22;
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
