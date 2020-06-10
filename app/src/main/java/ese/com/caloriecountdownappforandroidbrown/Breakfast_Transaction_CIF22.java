package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

/**
 * Created by ESE on 07/12/2016.
 */
public class Breakfast_Transaction_CIF22 extends Transaction_CIF52 //Really a Collection of Breakfast Transactions.
{
    private Breakfast_Transaction_Line_CIF17 mTransactionLine;
    private ArrayList<Breakfast_Box_CIF17> mBreakfastBox;


    public Breakfast_Transaction_CIF22()
    {

    }

    public Breakfast_Transaction_CIF22(Breakfast_Box_CIF17 bt, Breakfast_Transaction_Line_CIF17 BLT)
    {
        mBreakfastBox = new ArrayList<Breakfast_Box_CIF17>();
        mBreakfastBox.add(bt);
        mTransactionLine = BLT;
    }

    public Breakfast_Transaction_CIF22(ArrayList<Breakfast_Box_CIF17> e) { mBreakfastBox = e;}


    public ArrayList<Breakfast_Box_CIF17> Get_BreakfastBox()
    {
        return mBreakfastBox;
    }

    public Breakfast_Box_CIF17 Get_Index(int index){ return mBreakfastBox.get(index);}

    public void Set_BreakfastBox(Breakfast_Box_CIF17 IN)
    {
        mBreakfastBox.add(IN);
    }

    public void Clear_Breakfast_Box(){mBreakfastBox.clear();}

    public void Set_TransactionLine(Breakfast_Transaction_Line_CIF17 IN)
    {
        mTransactionLine = IN;
    }

    public Breakfast_Transaction_Line_CIF17 Get_TransactionLine()
    {
        return mTransactionLine;
    }

}
