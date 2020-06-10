package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 07/12/2016.
 */
public class Lunch_Transaction_CIF20 extends Transaction_CIF52
{
    private Lunch_Box_CIF17 mLunchBox;
    private Lunch_Transaction_Line_CIF17 mLTransactionLine;


    public Lunch_Transaction_CIF20()
    {

    }

    public Lunch_Transaction_CIF20(Lunch_Box_CIF17 lt)
    {
        mLunchBox = lt;
    }

    public Lunch_Box_CIF17 Get_LunchBox()
    {
        return mLunchBox;
    }

    public void Set_Lunch_Box(Lunch_Box_CIF17 IN)
    {
        mLunchBox = IN;
    }
}


