package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

/**
 * Created by lokeke on 08/03/2017.
 */
public class Transactions_CIF22 extends ArrayList
{

    // Always comment functions() new level/code fragment, Fragement Rubix cube levels and twisting and intereacting, no code, //
    // supreme IDO design see the high value outcome and what happens -> ese-edet.eu .further Algorithm engineered by Black, Built by Builder
    // and submitted, for Builder to RELOAD.

    // (no code fragment IDO)etc, * writings

    private ArrayList<Transaction_CIF52> mTransactionLines;
    private BoxCIF17 Internal_Box;
    private String StatementText;


    public Transactions_CIF22()
    {
        //Transaction_Line_CIF17 line = new Transaction_Line_CIF17();
        //Transaction_CIF52 Line_52 = new Transaction_CIF52();
        //Line_52.Set_Single_Transaction_Line(line);

        mTransactionLines = new ArrayList<Transaction_CIF52>();
        //mTransactionLines.add(Line_52);
        Internal_Box = new BoxCIF17("Dinner");
        StatementText = "www.ese-edet.eu";
    }


    public void Set_Statement_Text(String IN)
    {
        StatementText = IN;
    }

    public String Get_Statement_Text()
    {
        return StatementText;
    }


    public void Add_TransactionLine_2_List(Transaction_CIF52 IN)
    {
        mTransactionLines.add(IN);
    }

    public void Remove_TransactionLine_from_List(Transaction_CIF52 OUT)
    {
        mTransactionLines.remove(OUT);
    }

    public void Set_TransactionLines(ArrayList<Transaction_CIF52> IN)
    {
        mTransactionLines = IN;
    }

    public ArrayList<Transaction_CIF52> Get_TransactionLines()
    {
        return mTransactionLines;
    }












    //public long Get_Column_id()
    //{
    //    return mTransactionLine.Get_Transaction_id();
   // }

    public BoxCIF17 Strip_Column_ID(long column_id, BoxCIF17 mealitems) //Strips...
    {
        //long c_id_to_search_and_find = column_id;
        //BoxCIF17 stripped = new BoxCIF17();
        //Transaction_CIF52 IN;


        //mTransactions.Add_Box(mBox/Mealitmes

               // BoxCIF17 mBox_Food_Itmes = Strip_Column_Helper_LevelOne_Big(mTransactionLine.Get_Transaction_id(), IN, mealitems);
        //mTransactions.Add_Box(mBox_Food_Items)
                //IN.setmBox/mealitmes
        //return mBox_Food_Itmes; //Transaction.Get_Internal_Box;

        return new BoxCIF17();


    }


    public void Set_Internal_Box(BoxCIF17 IN)
    {
        Internal_Box = IN;
    }

    public BoxCIF17 Get_Internal_Box()
    {
        return Internal_Box;
    } //mTransactionLine.Get_Internal_Box();

    public ArrayList<Food_Item_CIF4> Strip_Food_Items_from_Cursor()
    {
        return new ArrayList<Food_Item_CIF4>();
    }

    private BoxCIF17 Strip_Column_Helper_LevelOne_Big(long column_id,Transaction_CIF52 IN, BoxCIF17 stripped)

    {
        Internal_Box = stripped;
        return stripped;
    }

    public String Print()
    {
        android.util.Log.d("IN CIF22 PRINT", "CIF52 Count : " + new RoundingCIF13().IntToString(mTransactionLines.size()));
        StatementText = "Transactions Lines empty";

        try
        {
            //Form Statemnt Text
            //Return Statement Text
            StatementText = "";//Date\t\tMeal Type\t\tDescription\t\tCalories IN\t\tCalories OUT\t\tCountdown Balance\n\n";
            for (Transaction_CIF52 m : mTransactionLines) {
                StatementText = StatementText + "Date: " + m.Get_Single_Transaction_Line().Get_Transaction_DateX().toString() + "\n\n" +
                        "Meal Type: " + m.Get_Single_Transaction_Line().Get_Transaction_Meal_Type() + "\n\n" +
                        "Description: " + m.Get_Single_Transaction_Line().Get_Description() + "\n\n" +
                            m.Print_Transaction_Line() + "\n" +
                        "Calories IN: " + new RoundingCIF13().IntToString(m.Get_Single_Transaction_Line().Get_Calorie_IN()) + "\n\n" +
                        "Calories OUT: " + new RoundingCIF13().IntToString(m.Get_Single_Transaction_Line().Get_Calorie_Outwards()) + "\n\n" +
                        "Countdown Balance: " + m.Get_Single_Transaction_Line().Get_New_Balance() + "\n\n" +
                        "__________________________________________"  + "\n\n\n";




            }
        }
        catch(Exception e)
        {
            android.util.Log.d("TranssactionCiF22 Print", e.getMessage());
        }
        return StatementText;

    }


    public void add_BOX_to_Line(long ID, BoxCIF17 Input)
    {
        ;
    }

    public void Wipe()
    {
        if(mTransactionLines != null)
        {
            mTransactionLines.clear();
        }

    }


}




