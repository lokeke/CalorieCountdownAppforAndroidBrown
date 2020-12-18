package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 26/02/2016.
 */
/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 *
 * CD = CCDGUI-CD (Calorie Countdown MIDlet)
 * Menu = Options
 * Menuitem = Activate Countdown
 *
 *
 * CiF name = Mif12MyAlertChoice
 * Blackboard Account Allocated to = BL16231
 * Number of Blackboard Point Worth = 2 points plus 1 point per testcase. (Maximum 3 testcases)
 * Implementation Deadline = February 15 2007

 */
public class Mif3StartNumber {
    public Mif3StartNumber() {
    }

    public HealthProfileCiF3 StartNumber(HealthProfileCiF3 startdata)
    {
        int current = (int) Float.parseFloat(startdata.getCurrentWeightImperial());
        int target = (int) Float.parseFloat(startdata.getTargetWeightImperial());
        int startnumber = 1;

        int weightloss = ( current - target); //pounds

        android.util.Log.d("Final", startdata.getWeightUnits());

        if(startdata.getWeightUnits() == "pounds")
        {
            startnumber = weightloss * 3500;
        }

        if(startdata.getWeightUnits() == "kilograms")
        {
                startnumber = (int)(weightloss *2.2 ) * 3500;
        }

        startdata.setStartCountdown(startnumber);
        return startdata;

    }
}

/**************************DOCUMENTATION********************************
 * INPUT
 * Number of Input= 0
 *
 *
 *
 *
 * OUTPUT
 * Number of Output = 0
 *
 *
 *
 * DEFINITIONS
 * No terms to define
 *
 *
 *
 * ALGORITHM ENGINEERING
 * 1. Takes in a HealthProfileCiF3 and uses the data stored in it to apply a formula that gives
 *   the Intial Calorie Countdown start number that goes on the CCDGUICiF2 screen as seen in ACCUCHEK
 * 2. See the specialed functions and methods used to deal with everything about writing and displaying on the canvas, font size, type, thickness, possition, color, etc.
 * 3. Store final answer in HealthProfileCiF3
 * 4. for example if sheila wants to lose 10kg 70 to 60, convert need to burn 35000 calories to lose 10kg, you need the right forumla.
 * 5. 3500 calories per pound, healthstatus.com ,www.cloud9fitness.com , sparkpeople, not all come from what? how does it affect count
 *
 *
 *
 *
 *
 *
 * EXAMPLES
 * none
 *
 *
 * SUPPORTING CIF(s)/Mif(s) TBL
 * 1
 * Contact ese Office(Black) at ese_blackboard@ese-edet.com for queries.
 *
 * TESTING AND PERFORMANCE LOGS
 *
 * Generate as many test case as you can, one extra point for every correct
 * test case.
 *
 * In each test case use different examples of inputs to show that the Method's Output
 * is right everytime.
 *
 * Use a wide range and varying inputs to cover as many different scenarios as possible.
 * Aim to write efficient code so that your implementation runs as fast and correctly as possible.
 *
 * Submit your implementation work back to ese_blackboard@ese-edet.com and wait for you
 * CIF Implementation to be acknowledged, approved and your Points added to you account.
 *
 *
 * *********************************************************************************/
