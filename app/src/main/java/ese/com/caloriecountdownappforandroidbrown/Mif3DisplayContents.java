package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 26/02/2016.
 */


    /**
     * <p>Title: Calorie Countdown</p>
     *
     * <p>Description: Mobile Phone Software CD for Nokia, Motorola, Sony
     * Ericsson</p>
     *
     * <p>Copyright: Copyright (c) 2006 www.ese-edet.com</p>
     *
     * <p>Company: ESE, S.C.I. Limited</p>
     *
     * @author ESE, S.C.I. Limited
     * @version 1.0
     *
     * CD = CCDGUI-CD (Calorie Countdown MIDlet)
     * Menu = Options
     * Menuitem = Activate Countdown
     *
     *
     * CiF name = Mif3BMIfunction
     * Blackboard Account Allocated to = BL16231
     * Number of Blackboard Point Worth = 2 points plus 1 point per testcase. (Maximum 3 testcases)
     * Implementation Deadline = February 15 2007
     *
     */
    public class Mif3DisplayContents {



        public Mif3DisplayContents()
        {

        }


        //IDO ~> Alogrithm Engineering ~> ANDROID :
        //This MiF takes in CiF3 and displays it's contents on.
        //Step 1. MiF extends Displayable Form. In Construtor intialize Form and give till Confirm Details
        //Step 2. MiF take in display.
        //Step 3. Create Yes command attribute in CiFMidlet.
        //Setp 4. Create No command attribue in CiFMidlet.
        //Step 5. Create public functions that allow adding external command yes no from CiF midlent which should add command to screen. plus command listener
        //Step 6. Implement StringFormat Function (private method).
        //Step 6b. Function StringFormat(private method) takes in bmidata, formats CiF3 data neatly into string and returns string see Notes for text.
        //Step 7. MiF DisplayContent Verb calls StringFormat on bmidata
        //Step 7a. Alert alert1 = new Alert("Countdown Activation Summary",StringFormet(bmidata),null,AlertType.INFO);
        //Step 7b. Set alert forever and display alert and this form in display (commands should be created and set in CIFMidlent okcommand sequence)

        //Ok command sequence (Midlet has access to all Forms and knows which one to call so Yes No can move about)
        //Step 8. Add Yes and No Commands, in okcommand scopelet them show on form
        //Step 8a. Set CiF MIDlet as listener.
        //Step 8b. Implement No command in Command listener so that command destroys final form which (what is happening) is CIF3BMIfor and recontruts starts again, (see code) and display
        //Step 8c. Implement Yes command so that command goes on to preactive as usual in the by pass line of execution??
        //Step 9. Call DisplayContents verb of MiF in okcommand strema
        //
        //




        public HealthProfileCiF3 DisplayContents(HealthProfileCiF3 bmidata)
        {
            String actting = StringFormat(bmidata);
            bmidata.setVitalStatsString2(actting);


            return bmidata;
        }



        private String StringFormat(HealthProfileCiF3 bdiddy)
        {
            //Alogrithm Engineering Code Comment
            //See notes for text and use get functions to get all data to display for confirmant from bdiddy also have them in order of final form

            String formation = new String("Please check that the following information is correct before continuing.\nIf correct press Yes button if not press No\n");

            formation.concat("\nYour First Name: " + bdiddy.getFirstname());
            formation.concat("\nYour Last Name: " + bdiddy.getLastname());
            formation.concat("\nNumber of meals in a day: " + Integer.toString(bdiddy.getNumberOftimeEatPerDay()));
            //formation.concat("\nNumber of Snacks: " + bdiddy.);
            formation.concat("\n Your Hieght: " + bdiddy.getClientHeight() + " "+ bdiddy.getHieghtUnits());
            formation.concat("\nYour Gender is: " + bdiddy.getClientGender());
            formation.concat("\nYour Body Frame is: " + bdiddy.getClientBodyFrame());
            formation.concat("\nYour Age: " + Integer.toString(bdiddy.getDOB()));
            formation.concat("\nYour Current Weight is: " + bdiddy.getCurrentWeight());
            formation.concat("\nYour Target Weight is: " + bdiddy.getTargetWeight());
            formation.concat("\nYour Target date is: " + bdiddy.getTargetDate2().toString());

            return formation;


        }

    }
