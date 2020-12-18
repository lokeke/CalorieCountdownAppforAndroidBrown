package ese.com.caloriecountdownappforandroidbrown;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by Vendor : ESE on 02/06/2017.
 */


public class MIF22FillHerUp
{
    private Context Internal_Context;
    private Date SP;
    private Date EP;
    private Transactions_CIF22 LocalTransactionsList;
    private static final String TAG = "Calorie Countdown App";


    public MIF22FillHerUp(Context context)
    {
        Internal_Context = context;
        SP = new Date();
        EP = new Date();
        LocalTransactionsList = new Transactions_CIF22();
    }

    public MIF22FillHerUp(Context context, Date StartP, Date EndP)
    {
        Internal_Context = context;
        SP = StartP;
        EP = EP;
        LocalTransactionsList = new Transactions_CIF22();

    }


    //Main event

    public Transactions_CIF22 FillHerUpVerb(Transactions_CIF22 IN)
    {
        //return FillWithFakeData(IN);
        return IN;
    }

    public Transactions_CIF22 TransactionsFoundVerb(Transactions_CIF22 INPUT)
    {
        return ReturnTransactionsFound(INPUT);
    }

    public void Fill_Data_Model_with_Fake_Data(MIF4_Data_Model_Adapter IN)
    {

    }

    public Transactions_CIF22 Fill_Data_Model_with_Real_Data(Transactions_CIF22 INPUT, Date Start_Date, Date End_Date, MIF4_Data_Model_Adapter IN)
    {
        return Get_Transactions_From_Data_Model(Start_Date,End_Date);
    }



    private Transactions_CIF22 ReturnTransactionsFound(Transactions_CIF22 OUT)
    {


        //Algorithm Engineering -> ANDROID :

        //Step 1. Get  an instance of MIF4_Data_Model_Adapter Object Box.
        MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(Internal_Context);

        //Step 2. Create two start and end date box objects that represent the period your Monthly Statement/Food journal covers.
        java.util.Date StartPeriod = SP;
        java.util.Date EndPeriod = EP;

        //Algorithm Engineering : Step 2a
        //Initialise StartPeriod and EndPeriod with Proper Values.

        //Step 3. Receive box's output required Transactions_CIF22 Box Object. People per hour methodology so simples.
        return OUT = data_model_adapter.get_Transactions(StartPeriod, EndPeriod);
        //Step 5. SUBMIT to ESE ANDROID BLACKBOARD for TESTING -> Approved for Sale. / Raise Invoice SI-13


    }


    public Transactions_CIF22 FillWithFakeData(Transactions_CIF22 INPUT)
    {

        //Step 1. Create Fake data Individual variables.
        int fake_Transaction_ID = 99;
        long fake_Date = (new Date()).getTime();
        String fake_Meal_Type_Breakfast = "Breakfast";
        String fake_Meal_Type_Lunch = "Lunch";
        String fake_Meal_Type_Dinner = "Dinner";
        int fake_Meal_Type_ID = 1000;
        int fake_Amount = 150;
        int fake_Countdown_Balance = 77000;
        int fake_Meal_Box_ID = 500;
        String fake_Meal_Box_Food_Type_B = "Breakfast";
        String fake_Meal_Box_Food_Type_L = "Lunch";
        String fake_Meal_Box_Food_Type_D = "Dinner";
        String fake_Description = "Nutritious";
        BoxCIF17 fake_Food_Item_List = new BoxCIF17();
        int fake_Calorie_IN = 600;
        int fake_Calorie_OUT = 1000;

        //Step 2. From the  INPUT CIF22 Object  extract out CIF52 Object of arrays,
        ArrayList<Transaction_CIF52> TransactionLines = INPUT.Get_TransactionLines();
        Transaction_CIF52 TransactionLineFakeData;


        //Step 3. Aim to add 100 items of fake data.
        for(int c = 0; c<10; c++)
        {
            //IN = CIF22 Object
            //Out = CIF22 Object (modified manipulated and data added too.)

            //Fake data to come from DataAdapterMIF till ready for real ones at that stage by just ignore that and
            // and fragment work with everything
            //from data model upwards
            //Code : <"">.
            // (no code fragment IDO)etc, * writings

            //Algorithm Engineering > ANDROID

            //Create Helper function if less than one create fake CIF52 add and return
            //TransactionLines = ifLessThanOne(TransactionLines);

            //In a new style for loop per CIF52, this represent transactions lines
            //for(int m = 0; m < TransactionLines.size(); m++) {

                //Per each CIF52 in a cool style loop per each array CIF17



                //Step 3a. Add a new BOX_CIF52 of fake data to array.
                TransactionLineFakeData = new Transaction_CIF52();

                //Step 3b. Create new Single Transaction Line contents of fake BOX_CIF52 containing Fake data.
                Transaction_Line_CIF17 transaction_line_cif17 = new Transaction_Line_CIF17();

                //Step 3c. Add Fake data.
                if( transaction_line_cif17 != null)
                {
                    //From CIF52 Object extract out CIF17 Object. This represent transaction line
                    //Create Helper function if less than one create fake CIF17 add and return

                    //In CIF17 Object/ Create

                    //Create a New CIF17 Object and fill following variables with fake data :
                    //private int mTransaction_ID;
                    //private long mTransaction_Date;
                    //private String mTransaction_Meal_Type;
                    //private int mTransaction_Meal_Type_ID;
                    // private int mTransaction_Amount;
                    //private int mTransaction_Balance;
                    //private int mTransaction_Meal_Box_ID;
                    // private String mTransaction_Meal_Box_Food_Type;
                    // private BoxCIF17 mfood_item_list;
                    // private String Description;
                    ////private Breakfast_Transaction_CIF22 food_item_list;
                    // private int mCalorie_IN;
                    //private int Calorie_OUT;
                    //private int Countdown_BALANCE; //Balance Brought FORWARD

                    //Use Random Generator Object that takes IN the New CIF [Fragmented] Object and spits OUT[put]
                    // Transmission/Recieve an CIF17 Object with Properties randomly filled on by object
                    // using the get set property methodt (communiation) of the Class thpe Object.

                    //Add this new Object to the ...ArrayList of CIFObject in CIFF22

                    transaction_line_cif17.Set_Transaction_ID(fake_Transaction_ID++);
                    transaction_line_cif17.Set_Transaction_DateX(fake_Date+(60*60*1000));
                    if(c%2 == 0)
                    {
                        transaction_line_cif17.Set_Transaction_Meal_Type(fake_Meal_Box_Food_Type_B);
                        Log.d(TAG, "In Meal Box Food Type B" + fake_Meal_Box_Food_Type_B.toString());

                    }
                    else
                    {
                        transaction_line_cif17.Set_Transaction_Meal_Type(fake_Meal_Box_Food_Type_D);
                        Log.d(TAG, "In Meal Box Food Type D");
                    }

                    transaction_line_cif17.Set_Transaction_Meal_Type_ID(fake_Meal_Type_ID++);
                    transaction_line_cif17.Set_Transaction_Amount(fake_Amount++);

                    transaction_line_cif17.Set_Transaction_Balance(fake_Countdown_Balance++);
                    transaction_line_cif17.Set_Transaction_Meal_Box_ID(fake_Meal_Box_ID++);

                    fake_Food_Item_List.add_Meal_Box_ID(fake_Meal_Box_ID);
                    fake_Food_Item_List.addFoodItem(new Food_Item_CIF4("Banana"));

                    fake_Food_Item_List.addFoodItem(new Food_Item_CIF4("Coke"));
                    fake_Food_Item_List.addFoodItem(new Food_Item_CIF4("Orange Juice"));

                    transaction_line_cif17.Set_Transaction_Food_Items(fake_Food_Item_List);
                    Log.d(TAG, "In Set Food items");

                    if(c%2 == 0)
                    {
                        transaction_line_cif17.Set_Transaction_Meal_Box_Food_Type(fake_Meal_Box_Food_Type_D);

                        Log.d(TAG, "In Meal Box Food Type BD");
                    }
                    else
                    {
                        transaction_line_cif17.Set_Transaction_Meal_Box_Food_Type(fake_Meal_Box_Food_Type_L);
                        Log.d(TAG, "In Meal Box Food Type BL");
                    }

                    transaction_line_cif17.Set_Description(fake_Description);
                    transaction_line_cif17.Set_Calorie_IN(fake_Calorie_IN++);

                    transaction_line_cif17.Set_Calorie_Out(fake_Calorie_OUT++);
                    transaction_line_cif17.Set_Transaction_Food_Items(fake_Food_Item_List);

                    TransactionLineFakeData.Set_Single_Transaction_Line(transaction_line_cif17);
                    TransactionLines.add(TransactionLineFakeData);

                    Log.d(TAG, "In Meal Box Food Type BEND" + TransactionLineFakeData.Get_Transaction_Meal_Type());


                    //Spit out return CIF22 Object
                    //This is Implementation Code, Test and Test again and go back to Testing and then return to ESE ANDROID BLACKBOARD in the hope to raise the Invoice.
                    //Hashtag Brown Design Together 2.0 Brownprint People per hour.
                    //CODE > BUILDER > ANDROID > CODE / IMPLEMENTATION in ANDROID >BUILD > BUILDER & Builder.tech House
                    // [In the Center of the Black bit of ESE SOFTWARE PIPELINE Straw] to reload & Green Office
                    //  Fill BOX_OUTPUT with Fake Data, if it becomes more complex that 3 lines of Code exe Fragementation Split
                    //and breakdown.
                }
            }
                    /*OUT = FillWithFakeData(OUT);
                    //return BOX_OUTPUT;
                    //return INPUT;*/

        //Step 4. Put newly filled BOX_CIF52 back into BOC_CIF22 INPUT.
        INPUT.Set_TransactionLines(TransactionLines);

        //Step 5. Return BOX OUTPUT.
        return INPUT;

    }

    //Fetches needed Transactions for a Monthly Statement from Data Model and packages
    // nicely into a Transactions CIF22 box.
    public Transactions_CIF22 Get_Transactions_From_Data_Model(Date StartDate, Date EndDate)
    {
        //Algorithm Engineering : //Step 1. Fetch all transactions in date range from Data Model.
        SQLDatabase_Food_Items_CIF6 jackie = new SQLDatabase_Food_Items_CIF6(Internal_Context);
        Transactions_CIF22 AllTransactions = new Transactions_CIF22();
        AllTransactions = jackie.Get_All_Transactions(SP,EP);

        //Algorithm Engineering : //Step 2. A "Dinner Transaction" Object box is Returned.
        return AllTransactions;


    }



    private ArrayList<Transaction_CIF52> ifLessThanOne(ArrayList<Transaction_CIF52> RECEIVE)
    {
        //Algorithm Engineering > ANDROID
        //Check the size of RECEIVE
        //If less than zero add three blank items for MIF to fill with fake data.

        Transaction_CIF52 filler = new Transaction_CIF52();
        if(RECEIVE.size() < 1)
        {
            filler.Set_Single_Transaction_Line(new Transaction_Line_CIF17("Breakfast"));
            RECEIVE.add(filler);
            filler = new Transaction_CIF52();
            filler.Set_Single_Transaction_Line(new Transaction_Line_CIF17("Lunch"));
            RECEIVE.add(filler);
            filler = new Transaction_CIF52();
            filler.Set_Single_Transaction_Line(new Transaction_Line_CIF17("Dinner"));
            RECEIVE.add(filler);
        }
    return RECEIVE;
    }
}

//BUILD > Test > (re)load > www.ese-edet.eu < Green Office > Approved for Sale >
// Submit Job by attaching completed file and returning file  back to ESE ANDROID FOR GREEN OFFICE APPROVAL via People per hour and wait for Invoice Settlement and next Job to be Posted.






























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
 *  //JUST READ AND YOU ARE DONE PEOPLE PER HOUR
 *
 * ALGORITHM ENGINEERING -> ANDROID -> IMPLEMENTATION -> BUILD -> Click -> Test -> QV*M -> (re)load -> www.ese-edet.eu* =           www.ese-edet.eu
 * ALGORITHM ENGINEERING -> ANDROID / ENGLISH / i / BREAKDOWN / BLACK (on www) -> GREEN (HIGH QUALITY CFF QVM in www) -> BLUE = £ on www.ese-edet.eu -> £446.87 +
 *
 *
 * //1)This MiF fragmented Object takes in a TransactionsCiF22 Object and packs it up with "fake data" and spits it out.
 * //1.1)Breakdown define fake then blast it
 * //1.2)Make Data Random
 *
 * //2) Implement Object PerformMIFAction, takes in Object Transactions_CIF22, uses it's public methods and functions to place in fake data, Output same object,
 * //done object implmented test in your android independtely using test structures and all kind of inputs
 * //send attach and email file to eseblueofffice@ese-edet.eu
 *
 *
 * 1. Activate CalendarCif

 //CountdownCalendar tracks the progress of the Client (Client -> www.ese-edet.eu) it is intialised after Activate Countdown
 //menuitem is completed, (Step 1. Call Calendar constructor, taking in start countdown figure, start date and target date, it is here that key parts of the CiF are
 // constructed)
 //it is activated with the calculated start countdown figure.
 //it records and tracks progress of the countdown for each day
 //
 //(Step2. Subtract start date from target date to give the size or number of fixed boxes of the data struture)aand at the right time each day it produces the day's
 // start
 //countdown - 2500/2000.

 //(Step 3. Timer task to tell it when to act see other CiFs) Please send Ms Ruth Penman to www.ese-edet.eu for trail testing.
 //When given CCDGUICiF in plots a graph of countdown progress so far (Step 4 Method 1) called rate of countdown, plus distance to target
 //(Step 5 Method 2) date/showing progress needed (Step 6 Method 3)
 //to target date which has to be another menuitem for the Client. (Must be Blackboard Posted for implementation)
 //take in a start date and a target date and create boxes to match each day to store results.

 //use hashtables and dictionaries for storing daily values, well constructed functions and interfaces and adding
 //(Step 7 Method 4 & 5) and manipulating this and timers and timertask (Step 8) for
 // daily storing to dictionaries

 //Store and retrieve (Step 8 Method 6 and 7) the calorie count number at the end of every session when MIDlet is exited store to
 //(Step 8 create right Record Store) RMS so can always be retrieved at start of session
 // (Step 9 Methods 8,9,10) target into sets (if count = 0 and if countdivedintosets = true, then reduce attribute set countby one,
 set currentcount = start count attribue, store tallyoftarget, boolean countdividedintoattribute, startcount and current attributes to cif18 record store,
 (complicated save to later) if tally=0 congrats finish (special menuitem)
 , day left (simple currentdate - targete) and projected achievement(find average so far and divide average into currentcount,
 add to current date to find out when finish, use how should I be doing to check)
 //from work done so far
 //Special section with special recordstore (Method 6 and 7 store start and target date and start number as well) for retrieving last session calorie count number
 //See previous examples for help

 Calendar set a new thread like Reminder menutiem.
 Deals with end of day events 6pm (Step 10 Listener, listen for this day end signal) where 2500/2000 is added up.
 (Step 11 Method callSignal to allow call right method(already implemented)) At same time day end coutdonw number stored in record stare per day for
 //progress & analysis & estimate time to weight loss
 //(include in previous Methods) Methods: track progress, predict. Store in record store or hastable, meaure, input

 (finish for now, implement skeleton functions, back to CiF Revision to load -> www.ese-edet.eu)
 //CountdownCalendar tracks the progress of the Client to Zero(Client -> www.ese-edet.eu) it is intialised after Activate Countdown
 //(Health Profile also stored here)
 //menuitem is completed, it is activated with the calculated start countdown figure.
 //it records and tracks progress of the countdown for each day and at the right time each day it produces the day's start per day, (i.e. per calendar entry)
 //countdown - 2500/2000.
 //When given CCDGUICiF in plots a graph of countdown progress so far called rate of countdown, plus distance to target date/showing progress needed
 //to target date which has to be another menuitem for the Client. (Must be Blackboard Posted)
 dates and work done in thoses dates stoted in database.

 *
 * Design needed functions, At the Start /End of MIDlet application (in startApp and endApp) all function to store calorie number in CiF18
 * CiF18 is delimeted by activate countdown start date and target data (plus some extra for overflow) and the end of each day (Midnight)
 * days current number is stored in CiF18 to be stored in RMS. Decide the format of RMS data and code to actually do this and store.
 * As usaul pack and organise all this in function format
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
 * ********************************************************************************

 package com.ESE;

 import javax.microedition.lcdui.*;



 /**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ESE S.C.I LTD </p>
 *
 * @author not attributable
 * @version 1.0
 *
 * CD = CCDGUI-CD.exe (Calorie Countdown MIDlet)
 * Menu = Options
 * Menuitem = Activate Countdown
 *
 *
 * CiF name = Mif3BMIfunction
 * ESE ANDROID BLACKBOARD Account Allocated to = BL16231
 * Number of Blackboard Point Worth = 2 points plus 1 point per testcase. (Maximum 3 testcases)
 * Implementation* Deadline = February 15 2007
 * Component Object Box Square Fragment IDO Object type = MIF
 */




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
 * ALGORITHM ENGINEERING -> ANDROID -> IMPLEMENTATION -> BUILD -> Click -> Test -> QV*M -> (re)load -> www.ese-edet.eu* =           www.ese-edet.eu
 * ALGORITHM ENGINEERING -> ANDROID / ENGLISH / i / BREAKDOWN / BLACK (on www) -> GREEN (HIGH QUALITY CFF QVM in www) -> BLUE = £ on www.ese-edet.eu -> £446.87 +
 *
 * 1. Activate CalendarCif

 //CountdownCalendar tracks the progress of the Client (Client -> www.ese-edet.eu) it is intialised after Activate Countdown
 //menuitem is completed, (Step 1. Call Calendar constructor, taking in start countdown figure, start date and target date, it is here that key parts of the CiF are
 // constructed)
 //it is activated with the calculated start countdown figure.
 //it records and tracks progress of the countdown for each day
 //
 //(Step2. Subtract start date from target date to give the size or number of fixed boxes of the data struture)aand at the right time each day it produces the day's
 // start
 //countdown - 2500/2000.

 //(Step 3. Timer task to tell it when to act see other CiFs) Please send Ms Ruth Penman to www.ese-edet.eu for trail testing.
 //When given CCDGUICiF in plots a graph of countdown progress so far (Step 4 Method 1) called rate of countdown, plus distance to target
 //(Step 5 Method 2) date/showing progress needed (Step 6 Method 3)
 //to target date which has to be another menuitem for the Client. (Must be Blackboard Posted for implementation)
 //take in a start date and a target date and create boxes to match each day to store results.

 //use hashtables and dictionaries for storing daily values, well constructed functions and interfaces and adding
 //(Step 7 Method 4 & 5) and manipulating this and timers and timertask (Step 8) for
 // daily storing to dictionaries

 //Store and retrieve (Step 8 Method 6 and 7) the calorie count number at the end of every session when MIDlet is exited store to
 //(Step 8 create right Record Store) RMS so can always be retrieved at start of session
 // (Step 9 Methods 8,9,10) target into sets (if count = 0 and if countdivedintosets = true, then reduce attribute set countby one,
 set currentcount = start count attribue, store tallyoftarget, boolean countdividedintoattribute, startcount and current attributes to cif18 record store,
 (complicated save to later) if tally=0 congrats finish (special menuitem)
 , day left (simple currentdate - targete) and projected achievement(find average so far and divide average into currentcount,
 add to current date to find out when finish, use how should I be doing to check)
 //from work done so far
 //Special section with special recordstore (Method 6 and 7 store start and target date and start number as well) for retrieving last session calorie count number
 //See previous examples for help

 Calendar set a new thread like Reminder menutiem.
 Deals with end of day events 6pm (Step 10 Listener, listen for this day end signal) where 2500/2000 is added up.
 (Step 11 Method callSignal to allow call right method(already implemented)) At same time day end coutdonw number stored in record stare per day for
 //progress & analysis & estimate time to weight loss
 //(include in previous Methods) Methods: track progress, predict. Store in record store or hastable, meaure, input

 (finish for now, implement skeleton functions, back to CiF Revision to load -> www.ese-edet.eu)
 //CountdownCalendar tracks the progress of the Client to Zero(Client -> www.ese-edet.eu) it is intialised after Activate Countdown
 //(Health Profile also stored here)
 //menuitem is completed, it is activated with the calculated start countdown figure.
 //it records and tracks progress of the countdown for each day and at the right time each day it produces the day's start per day, (i.e. per calendar entry)
 //countdown - 2500/2000.
 //When given CCDGUICiF in plots a graph of countdown progress so far called rate of countdown, plus distance to target date/showing progress needed
 //to target date which has to be another menuitem for the Client. (Must be Blackboard Posted)
 dates and work done in thoses dates stoted in database.

 *
 * Design needed functions, At the Start /End of MIDlet application (in startApp and endApp) all function to store calorie number in CiF18
 * CiF18 is delimeted by activate countdown start date and target data (plus some extra for overflow) and the end of each day (Midnight)
 * days current number is stored in CiF18 to be stored in RMS. Decide the format of RMS data and code to actually do this and store.
 * As usaul pack and organise all this in function format
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
 * ********************************************************************************

 package com.ESE;

 import javax.microedition.lcdui.*;



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
 * CD = CCDGUI-CD.exe (Calorie Countdown MIDlet)
 * Menu = Options
 * Menuitem = Activate Countdown
 *
 *
 * CiF name = Mif3BMIfunction
 * ESE ANDROID BLACKBOARD Account Allocated to = BL16231
 * Number of Blackboard Point Worth = 2 points plus 1 point per testcase. (Maximum 3 testcases)
 * Implementation* Deadline = February 15 2007
 * Component Object Box Square Fragment IDO Object type = MIF
 */
