package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 07/12/2016.
 */
public class Dinner_Transaction_CIF21 extends Transaction_CIF52
{
    private Dinner_Box_CIF17 mDinnerBox;


    public Dinner_Transaction_CIF21()
    {

    }

    public Dinner_Transaction_CIF21(Dinner_Box_CIF17 dt)
    {
        mDinnerBox = dt;
    }

    public Dinner_Box_CIF17 Get_DinnerBox()
    {
        return mDinnerBox;
    }

    public void Set_DinnerBox(Dinner_Box_CIF17 IN)
    {
        mDinnerBox = IN;
    }
}
