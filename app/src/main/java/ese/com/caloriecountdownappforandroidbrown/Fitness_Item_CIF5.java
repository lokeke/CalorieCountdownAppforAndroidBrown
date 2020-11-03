package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by ESE on 22/01/2016.
 */
public class Fitness_Item_CIF5
{
    private String mNameOfActivity;
    private float mCaloriesBurntPerMinute;
    private float mUserWeightlbs;
    private int mMinutesPerformed;
    private int mCalorie_Debit_Value;


    public Fitness_Item_CIF5()
    {
        mNameOfActivity = "empty";
        mCaloriesBurntPerMinute = 0;
        mUserWeightlbs = 0;
        mMinutesPerformed = 0;
        mCalorie_Debit_Value = 0;
    }


    public int getmCalorie_Debit_Value(){ return mCalorie_Debit_Value;}

    public int getmMinutesPerformed()
    {
        return mMinutesPerformed;
    }

    public float getmUserWeightlbs() {
        return mUserWeightlbs;
    }

    public float getmCaloriesBurntPerMinute() {
        return mCaloriesBurntPerMinute;
    }

    public String getmNameOfActivity() {
        return mNameOfActivity;
    }

    public void setmNameOfActivity(String in)
    {
        mNameOfActivity = in;
    }

    public void setmCaloriesBurntPerMinute(float mCaloriesBurntPerMinute) {
        this.mCaloriesBurntPerMinute = mCaloriesBurntPerMinute;
    }

    public void setmMinutesPerformed(int mMinutesPerformed) {
        this.mMinutesPerformed = mMinutesPerformed;
    }

    public void setmUserWeightlbs(float mUserWeightlbs) {
        this.mUserWeightlbs = mUserWeightlbs;
    }

    public void setmCalorie_Debit_Value(int in)
    {
        mCalorie_Debit_Value = in;
    }

    public void ConvertSpinnerItem(String choose)
    {
        //Alogrithm Engineering -> Android: ConvertToEnergyItem()
        //Step 1. Check Format, If wrong inform use format is wrong can't go on try again.


        if(!checkEnergyFormat(choose))
        {
            android.util.Log.d("Fitness Item","Data is in the wrong format, we can't go on, try again");

        }
        else
        {
            //Step 3. Split the string into name of fitness item and datavalue use existing technolgy

            String chooseName = CutFirstEnergy(choose);
            float chooseDataValue = new RoundingCIF13().StringToFloat(TrunkTrunk(choose,chooseName));

            //Step 4. Create new EnergyItemCiF12,

            //Step 5. Fill with these values
            this.setmNameOfActivity(chooseName);
            this.setmCaloriesBurntPerMinute(chooseDataValue);


        }

    }

    private String CutFirstEnergy(String stream)
    {


        for(int p = 0; p  < stream.length(); p++)
        {

            if(stream.charAt(p) == ';')
            {

                String cut = stream.substring(0,(p+1));

                return cut;

            }


        }
        return new String("");
    }

    private String TrunkTrunk(String ramoramo, String gone)
    {
        int len = gone.length();
        int ramolen = ramoramo.length();

        ramoramo = ramoramo.substring(len, ramolen);
        return ramoramo;

    }

    private boolean checkEnergyFormat(String ch)
    {
        for(int x = 0; x < ch.length(); x++)
        {
            if(ch.charAt(x) == ';')
            {
                return true;
            }
        }
        return false;
    }


    public int CalculateCountdown()
    {
        if(getmNameOfActivity().startsWith("Just add Raw") || getmNameOfActivity().startsWith("Steps"))
        {
            mCalorie_Debit_Value =  getmMinutesPerformed();
        }
        else
        {
            mCalorie_Debit_Value = (int) (getmUserWeightlbs() * getmMinutesPerformed() * getmCaloriesBurntPerMinute());
        }
            return mCalorie_Debit_Value;

    }











}




