package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

/**
 * Created by ESE S.C.I. LTD on 08/03/2017.
 */
public class Transaction_CIF52
{
    //This fragmented object represents a transaction line in the Monthly Statement
    // print out.
    private Transaction_Line_CIF17 mTransactionLineCIF17;

    //This is a list of food item boxes say for Lunch Breakfast or whatever,
    // Box is the state of the art way of handling food item contents,
    private ArrayList<BoxCIF17> mGeneralBox;

    //list of Fooditems to used internally by Object eg store in escrow will copying over.
    private BoxCIF17 Internal_Box;

    public Transaction_CIF52()
    {
        mGeneralBox = new ArrayList<BoxCIF17>();
        //mTransactionLineCIF17 = new Transaction_Line_CIF17();

    }// Will this not cause a crash?

    public Transaction_CIF52(String mealname)
    {


        mGeneralBox = new ArrayList<BoxCIF17>();
        mTransactionLineCIF17 = new Transaction_Line_CIF17();

    }// Will this not cause a crash?

    public Transaction_CIF52(Transaction_Line_CIF17 bt)
    {
        mTransactionLineCIF17 = bt;
    }

    public Transaction_CIF52(BoxCIF17 bt) //Change breakfast type to something more general?
    {
        mGeneralBox = new ArrayList<BoxCIF17>();
        mGeneralBox.add(bt);
    }

    public Transaction_CIF52(ArrayList<BoxCIF17> e) { mGeneralBox = e;}


    public ArrayList<BoxCIF17> Get_GeneralBox()
    {
        return mGeneralBox;
    }

    public BoxCIF17 Get_Index(int index){ return mGeneralBox.get(index);}

    public void Set_GeneralBox(BoxCIF17 IN)
    {
        if(mGeneralBox == null)
        {
            mGeneralBox = new ArrayList<BoxCIF17>();
        }

            mGeneralBox.add(IN);
    }

    public void Clear_General_Box(){mGeneralBox.clear();}

    public java.util.Date Get_Date()
    {
        return mTransactionLineCIF17.Get_Date(mTransactionLineCIF17.Get_Transaction_Date());
    }

    public long Get_Transaction_id()
    {
        return mTransactionLineCIF17.Get_Transaction_ID();


    }

    public long Get_Transaction_Date()
    {
        return mTransactionLineCIF17.Get_Transaction_DateX().getTime();
    }

    public String Get_Transaction_Meal_Type()
    {
       return mTransactionLineCIF17.Get_Transaction_Meal_Type();
    }

    public int Get_Transaction_Balance()
    {
        return mTransactionLineCIF17.Get_Transaction_Balance();
    }
    public long Get_Transaction_Meal_Type_ID()
    {
        return mTransactionLineCIF17.Get_Transaction_Meal_Box_ID();
    }

    public int Get_Transaction_Amount()
    {
        return mTransactionLineCIF17.Get_Transaction_Amount();
    }

    private BoxCIF17 Strip_Column_Helper_LevelOne_Big(long column_id, int IN, BoxCIF17 stripped) //IN issue, what is it/

    {
        return Internal_Box;
    }

    public Transaction_Line_CIF17 Get_Single_Transaction_Line()
    {
        if(mTransactionLineCIF17 == null)
        {
            mTransactionLineCIF17 = new Transaction_Line_CIF17();
        }

        return mTransactionLineCIF17;
    }

    public void Set_Single_Transaction_Line(Transaction_Line_CIF17 IN)
    {
        mTransactionLineCIF17 = IN;
        mGeneralBox.add(IN.Get_Transaction_Food_Items());

    }

    public String Print_Transaction_Line()
    {
        String Statement = "Food Items: " +"\n\n";
        //Statement = Statement +" " + mTransactionLineCIF17.Get_Transaction_DateX().toString() +"   " +
              //  mTransactionLineCIF17.Get_Transaction_Meal_Type() + "  " + "\n";

        for( BoxCIF17 m : mGeneralBox)
        {
            Statement = Statement + "Number of Food items: " + new RoundingCIF13().IntToString(m.Get_Food_Items().size()) +"\n\n";

            for( Food_Item_CIF4 x : m.Get_Food_Items())
            {
                Statement = Statement + x.Get_food_item_name() + "\n\n";
            }
        }

        //Statement = Statement + "                              " + mTransactionLineCIF17.Get_Calorie_IN() + "   " + mTransactionLineCIF17.Get_Calorie_OUT() + "   " + mTransactionLineCIF17.Get_New_Balance() + "." + '\n' +'\n' + 'n';
         return Statement;




    }
}
