package ese.com.caloriecountdownappforandroidbrown;

import android.support.annotation.NonNull;

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



    public Breakfast_Box_CIF17 Get_Index(int index)
    {
        return mBreakfastBox.get(index);
    }



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

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @NonNull
    @Override
    public String toString()
    {
        return "Breakfast_Transaction_CiF22";
    }
}
