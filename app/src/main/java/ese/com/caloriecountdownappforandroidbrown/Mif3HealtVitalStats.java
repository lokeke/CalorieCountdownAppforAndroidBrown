package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 26/02/2016.
 */
/**
 * <p>Title: Calorie Countdown Mobile</p>
 *
 * <p>Description: Mobile Phone Computer Software Application and MIDlet </p>
 *
 * <p>Copyright: Copyright ESE, S.C.I. Limited (c) 2006</p>
 *
 * <p>Company: ESE, S.C.I. Limited An Emissions Trading Software Company </p>
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
public class Mif3HealtVitalStats {
    public Mif3HealtVitalStats() {
    }

    public HealthProfileCiF3 HealtVitalStats(HealthProfileCiF3 healthdata)
    {
        Mif3DisplayContents contents = new Mif3DisplayContents();
        healthdata = contents.DisplayContents(healthdata);

        String vitalstats = "Summary of Client Vital Health Statistics\n\n Name: " + healthdata.getFirstname() + " " + healthdata.getLastname() + "\nAge: " + healthdata.ReckonClientAge() + "\nHeight (" + healthdata.getHieghtUnits() + "):"+" " + healthdata.getClientHeight() + "\nFrame: " + healthdata.getClientBodyFrame() + "\nBMI: " + healthdata.getClientBMI() + "\nIdeal BMI: " + healthdata.getIdealBMI() + "\nBody Metabolic Rate: " + healthdata.getBMR() + "\nStart Weight: " + healthdata.getCurrentWeight() + "\nEnd Weight: " + healthdata.getTargetWeight() + "\nStart Countdown: " + healthdata.getStartCountdown();
        healthdata.setVitalStatsString(vitalstats);


        return healthdata;

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
 * 1. Takes in a healthprofileCiF3 and returns a HealthProfileCiF3 that contains the a VitalHealth String with all the
 *   vital health information of the Client e.g. Name, Age, Current Wieght, Height, Frame, blood pressue etc.
 * 2. this string can then be used by some other CiF to display vital health info on CCDGUICiF2 screen when called.
 * 3a. Name
 *     Age
 *     Sex
 *     Height
 *     Body Frame
 *     BMR
 *     BMI
 *
 *     Start Weight
 *     Target Weight
 *     Start Countdown Number
 *     Any Serious Medical conditions?
 *
 *
 *     Income? smoking? units? Ethicity, nationality
 *
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
