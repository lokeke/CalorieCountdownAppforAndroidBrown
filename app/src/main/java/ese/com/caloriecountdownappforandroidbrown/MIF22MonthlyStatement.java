package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;

import java.util.*;
import java.util.ArrayList;



/**
 * <p>Title: Calorie Countdown app </p>
 *
 * <p>Description: Weight Loss app </p>
 *
 * <p>Copyright: Copyright (c) 2017</p>
 *
 * <p> Vendor: ESE</p>
 *
 * @author ESE
 * @version 2.0
 *
 * CD = CCDGUI-CD.exe
 * Menu = Food Diary Credit
 * Menuitem = Food Journal / Monthly Statement
 *
 *
 * fragmented object Box type = MiF
 * MiF name = "MIF22MonthlyStatement"
 * Blackboard Account Allocated to = Blackboard Member BM00001 (The director)
 * Number of Blackboard Point Worth = 2 points plus 1 point per testcase.
 * (Maximum 3 testcases) ($15 people per hour invoice)
 * Implementation Deadline = June 2, 2017
 */




public class MIF22MonthlyStatement
        //To become part of and an Inner Class of Summary_Box. (another Level of fragment again.)
{

    private Monthly_Data_Transation_Line_CIF51 monthly_data_transation_line_cif51;
    //This fragmented Object is the Monthly Statement containing all transactions with thier corresponding food items.

    private int mStartDayOfMonth = 0;
    private int mStartMonth = 0;
    private int mStartYear = 0;
    private int mEndDayOfMonth = 0;
    private int mEndMonth = 0;
    private int mEndYear = 0;

    Context mifContext;
    private MIF22FillHerUp fillHerUp;
    private Transactions_CIF22 Local_TransactionList;


    MIF22MonthlyStatement()
    {

    }

    MIF22MonthlyStatement(int StartDayOfMonth, int StartMonth, int StartYear,int EndDayOfMonth, int EndMonth, int EndYear, Context context)
    {

        mStartDayOfMonth = StartDayOfMonth;
        mStartMonth = StartMonth;
        mStartYear = StartYear;
        mEndDayOfMonth = EndDayOfMonth;
        mEndMonth = EndMonth;
        mEndYear = EndYear;

        mifContext = context;
        fillHerUp = new MIF22FillHerUp(mifContext);
        Local_TransactionList = new Transactions_CIF22();


    }
    public String MonthlyStatementMassage(Transactions_CIF22 IN) //Contains CiF51 that tries to represent the trhansaction like and food items. CiF22 contains all the transactions you are going to get.
    {
///Read

        //FRAGEMENTATION/DESIGN// Work only fragmenation on Filling up CIF22 Object reload 2 www.ese-edet.eu
        // exe *Read
        //Brown Design Documentation //DE-COUPLE FOR exe


        //Data Model Retrieve Data from Data put it item CIF and send to

        // Black Office DOCUMENTATION

        //Blackboard Member 0001 : DR LOTENNA OKEKE Donald exe White Christian (be ready and prepared for Christian, blue expectant ambitions, hungry and desperate and urgent, deadline,date, planned,scheduled Blue, ambitious) name Christian, Christiano, become new Creature new Creation bye bye Lotenna)
        // Dr Donald White Dustin Christianson Abba(exe blow up Gym fast donald Track Supernatural Speed Amen iIJN and repeat same as Speed of Light

        //Read *writings/exe :                      READ
        //fragment IDO Design Brownprint, &fragment*: ENGLISH -> IDO Design & Brownprint (UML) -> Objects to Code/interface -> Alogrithm Engineering ->
        // ANDROID BLACKBOARD /(Builder) ->
        //              (re)Load -> www.ese-edet.eu.
        //
        //                                      www.ese-edet.eu         Codebase red part of must in listening in and absorbing thier red *exe

        //                                  www.ese-edet.eu/exe         FAST TRACK CR
        // ACCA/Software -> ACCA2/Software & CR Software & ACCA/Tech & ACCA2/Tech & ACCA2/www.ese-edet.eu & ACCA3/www.ese-edet.eu
        // Tech Office / CCE Office #2 Tech Office / Tech Office #2 CCE Office /exe

        //                                      ese-edet.eu / 7 /red /Santander ISA /&exe&empire,*7 *= (re)peat &exe& exe connect behind to other quality
        // exe & continues
        // it and grow, adds and improves on exe,bigger exe, that is &exe, with exe& it allows future exe to connect to it connect to future exe,
        // and continue the process and improve &exe&636&benchmark, making it bigger harder and faster to have more blue numbers to make it intense, hotter
        // and Solid exe,
        // Connect and making exe as one, big, powerful exe
        // and bigger, more intense, lean, mean more for less more speed and <word>voutput for lesser fast, efficiency.
        // Christian welcomes and asbsorbs constantly and repeatly blown minds, plan, expect prepare bigger capacity barns
        // take it. Ready, keep honest All or nothing. Whole world of Reading, all we do.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // the range could either be a monthly range created automatially or user can select a range for the statement to be printed :
        // massage MonthlyDataTransactionLine CIF containing Compartmentalized Monthly Data into a TransactionLine of One Monthly Statement String
        // to be added together to
        // form whole Monthly Statment/ Food Diary/Journal
        // using this MIF:

// When retrieving monthly statement data an array of the CIF datastructure containing thadis returned representing each row line of the statement to poe tog
        // stuff the data from SQL into the CIF and send

        // The Final monthly statement String to be displayed by Countdown Report Object Fragment fairly independent with few entry points like methods.
       //
        // get contents of Breakfast Transacton in the CIF Data carrying get and set Data Object, MIF massage into line of Statement Report, print
        // the Title in Calorie Countdown Monthly Statement/ Food Diary or Food Journa next line Month and start and finsih day dates, summary of
        // the month or selected datepicker timetable then lay out monthly stataement in line by line in format and done.
        // (like Accounting Statement nor? Calorie Accounting, accounting for your Calories App get it on Google Play)

        // Make sure functions and data model retreive extremely correct stuff from App database Data layer.

        // MVC / Patterns example of =  fragment IDO Design UML Brownprint cube objects* can be used.

        // Builder implements Brown fast not adding anything just exe fast Brown and test thoroughly through all kinds of motions to improve performance memory efficiency leam more for less resoures BEFAM etc*
        // then shakes for preformanace lean more efficenty BEFAM etc Builder/Value then (Re)Load -> ese-edet.eu STOP.
        //
        //                                                    exe < *ESE S.C.I LTD >
        //
        //                                                      Donald since 2000 (Tech) 4.1.18 * Every single year. 24.12.17
        //                                                        fast
        //
        //                                                          exe [green] not black.

        //& red

        //Breakfast transaction has got a line date of breakfast and the number of food items per that breakfast session each food item having
        // a line to themselives

        //next line has the breakfast transaction for another breakfast session in another date (all from the database saved while food aid sheet
        // is being used to record Data to CR Balance (new Countdown daily = 420, means can walk for an hour each day and good, must use a Diet e.g. Papaw
        // Diet to limit the number of Food items you have to type in, make sure they are found know exact Caloire Count diet needed to Countdown sucessfully to zero might not br easy but it is easier and you can do it and achieve  /and can limit food side to 2150 Calories. Problem is hunger in the night answer is fruit veg cereal and high fibre food items stock them in your cupboard, it is which food item you use to eat that matter.

        // )in the middle of Countdown Report. Data is driven down to App SQL Data Database Level with Data Adapter as Moderator intermediary,

        // All same data MIF produces Transaction per Transaction each reiteration. all same data gain returned massaged into Monthly Statement ( mif format function) String Transaction line Returned for 1st Month Day to 28/29/30/31st Day Breakfast Dinner Lunch captured data with the list of breakfast food items,-> food items database also assocaited and involved.
        // Realising Monthy Statment Report is triggered with end of the month is reached and Start date > 1st of the Month.
        //MyfitnessPall

        // And App Database (seperate fast trac yeat (done it)contains vast nutrition information and other data on each Food item to tell users and give analysis of how they eating, what eating and nutritional analyses..
        // and make sure they eating right and taking care of themselves for example good example of nutritional input see MyFitnessPal -> Reload www, SHeart Samsung SHeart red exe etc (Re)Load -> www.ese-edet.eu.



        // this is repeated till all the Breakfast Lunch and Dinner items per day for month per chronography entered as found in App Database the
        // and stored in the database when Food Diary Sheet doing it's thing in the middle there there's a function call RecordMonthlyStatementData()
        // which is the Source of ALL this work one function to be the Bridge this i ENGLISH to exe and delete from Cloud and (Re)Load
        // The Data is retrieve via the Data Adapter (very usefull fragment IDO rubix couberepea past execellence on Andriod phone till published to Google Play) retrieved with Retrieve() funactions and Data Model Classes CIF to Carry data)

        // CR Lunch food items update for Countdown balance and Food Diary Aid Sheet (real on Software good exe idea writing Constant improvement 2 www.ese-edet.eu keep it going (re)Load)
        //
        // Add another Layer on top of Food Aid Diary Sheet (Continous improvement higher QVM) that is just a Column that accepts Food Item names
        // you've eaten, this is to simply data entry (datbase absoltely packed lick MyfitnessPal on Cloud Bhrat time fast all Pizzas and restuarants for eat out your experence food what's out there cooked food it hase.t.a to be fast and that is in Tesco and done)so App trickles down to next level of food aid sheet where raw calories Quanity weight etc can be filled if
        // neccessary and immdiate Database fetch (ENGLISH : Populate*())(it is important you are consistent with Donald tile bridge must work properly ad as expected chiefly behind it's intertacable method prove and deliver your result om www.ese-edet.eu for others e.g. in interviews by or before Friday sation e etae.t.a. ) 3/1/18 to Publish App to Google Play Friday Oct 18, 2017 in Citibase* Area on Friday Station Long sucessfull rack The Donld Track Fast exe [green]Track & reconnect.) All or Nothing. EY./ Halifax Donald insurance policy for non complacent timed fallen back or snoozing, red take it seriously)(then trickle down, CodeBase*, everything based on Diet even Diet = ( and fragment IDO bridge CIF1 App done. Reload
        // No Diet/free eating) are found. Diet Menuitem (Creates fills and gives a name to your create Diet and all it's foodr to th items for each of the 3 main meal tha's it go Reload exe) is must not random food but
        // you must be on a diet for App to work you could be on Diet called No Diet but it is the only way things are going tth
        // MiF thing then massages stuff and components into a MonthyStatement String output/Transaction Line created by a fragrament IDO etc then and Complete Monthly Statement for January (triggers itself or date range can be used)displayed using/reusing Countdown Report e.g of fragment IDO desogn and Brownprint paper Object to Baord red & put together again with red
        //option to print (using andriod API to print String) and store string in special archive Table and your done. (Re)Load

        //the MIF receives one transaction at time which form lines of the Monthly Statement Mif uses data stored in CIF22 to create a
        //massaged string Report (see fragment Countdown Report (re)) One String churned out representing the Transaction line of the Data_CIF class.
        // Test robustly intensley and thorougly like up and down machine with large data <set> (Data Model after given a range returns an array
        // with all the necessary lines and transact Data Model CIFs from SQL Datable Layer and level, this array is directly turned into a Monthly Statement,
        // classes should have all the functions needed to complete Monthly Statement Column, including Calorie In Calorie Out and Countdown Balance
        // Transaction Lines for the Monthly Statement but the have to be in order e.g
        //User specifes a Date range or select month for data.

        // say it is Jan 2 2017 - Jan 18 2017, start from Jan 2 we assume user inputted what she had for breakfast, so data of that would be first data
        // from the data model (IDO) t(re) Look back & fragrament IDO Desesgn Brown prnt Brown generates Object Temple forom carefully planned and describbed UML requirement posted straight to ESE S.c.I LTD Andriod Blackboard via Blackboard Member posting, returned to blackboard email address pointing to lotenna@ese-edet.eu & lotenna@yahoo.com) hat we fetch follow by Lunch input then finally dinner input data, breakfast goes at breakfast transction
        // printed in monthly statment format, Countdown balance should show at the end of transaction there's a gap between these two to list
        // Box CIF17 food items had list
        // up you get till final day Jan 18, 17 end with dinner final transaction and final Countdown Balance carried forward
        // Opening (countdown) Balance for February with BALANCE BROUGHT FORWARD. nice.
        // Check, Print (API Black Builder) & etc run code and Run. (Re)Load


        //retreival of monthly statement food diary data from data model requires a special specified CIF Data containage CIF suited
        // to data in data model and tables
        //it is to be like food_item_CIF to place and go on MonthlyStatment/ string / that is or no. Should have right Transactions for Right Date range
        // speciefied
        //or Monthy Date Range 1 - 31/30/28/29 (Check Month function, check range) Monthy Statement automatically Generated.and sent to user to be viewd.

////////////GOOGLE PLAY/////// ALL ABout Track time and eta fast track etc.... At Citibase*

        //blue office
        //Breakdown Sales exchange money with customers Sage in Blue Campaign SageOne - Month End Report etc Year End Charts ACCA in [Blue] what?
        // on Apple all t like CMT? exactly like PER: CMT on Mondays and the wealth of that Job, be missed,
        // that's IT! www.ese-edet.eu, pay down MASTERCARD buying you Track time Fast Track time & Time)
        // 1st Job 18,877 all this while, had true Job after all all this while you have there you have you have fair. 2020/2024 P.B. units down or out
        // 6 months at a time
        // Sabbatical New York financial Bank Job & fast and all you've got, with ACCA Qaulaitcation and Membership.
        //finish Calorie Countdown App launch publish and reload on Friday Station e Week, October 18, 2017, Publish, Publish Post.

        // Start Sage Blue One Sales Campaign (via Blue/facebook (Page)
        // Blue Sage link, none stop Citibase*
        //Test Test Test etc (Re)Load...www.ese-edet.eu

        //Description will have to go after Countdown Balance right at the end to accomodate individual lines for each food item in meal, ?
        // Not too sure of that anymore
        // hence large spaces left till next Countdown balance print out.

        //Description on Google Play simple "Countdown to zero to achieve... Simpl...that's the App, Download now, c
        // count it Likes first place to go done exe on Straight Line Track. is it something I said?

        //Proud of <ESE S.C.I LTD>, Carry that word around with me in my pocket in card in apple. throw in White HOT DANISH FURNANCE

        // exe in [green].

        //The Gym, Home exe electricity powering all of Pitsie/even ACCA2 / ESE S.C.I LTD/ I hear fast Track



        ArrayList<Transaction_CIF52> TLines = IN.Get_TransactionLines();

        TLines = SortTransationsInNewestFirst(TLines);

        for(Transaction_CIF52 m : TLines)
        {

            m = SortMealBoxBreakfastFirstLunchThenDinner(m);
        }


        return ProduceMonthlyStatement(TLines);
    }

    //The Value of the massaged String is put in Lunch_Transaction_CIF20 Set_MonthlyStringTransactionLine(String massaged);
    //and spit it out pass to next fragment folk that will use it.
    public String MonthlyStatementMassage(Lunch_Transaction_CIF20 in)
    {
        return new String("Print");
    }

    //The Value of the massaged String is put in Dinner_Transaction_CIF21 and Breakfast
    // Set_MonthlyStringTransactionLine(String massaged);
    //and spit it out pass to next fragment folk that will use it.

    //CIF21 is what gets filled with data rows from Monthly_Statement Table, and gets passed on and massaged to String, all data is stored and found in one table in chronological order of user Credit Meal data to balance Breakfast, Lunch and Dinner must live in this one table not 3 different confusing Meal Tables scattered all over the place in Data Land.

    public Transactions_CIF22 MonthlyStatementMassageObject1(Transactions_CIF22 IN)
    {
        //Set Massaged String in CIF22 too.
        return IN;
    }

    public Monthly_Data_Transation_Line_CIF51 getMonthly_data_transation_line_cif51() {
        return monthly_data_transation_line_cif51;
    }

    public void setMonthly_data_transation_line_cif51(Monthly_Data_Transation_Line_CIF51 IN) // WRITINGS DOCUMENTATION
    {
        monthly_data_transation_line_cif51 = IN;
    }

    public Transactions_CIF22 getMonthlyStatementData(int Startday, int Startmonth, int Startyear, int Endday, int Endmonth, int Endyear)
    {
        SQLDatabase_Food_Items_CIF6 jackie = new SQLDatabase_Food_Items_CIF6(mifContext);
        return jackie.retrieveMonthlyStatementTransactions(Startday,Startmonth,Startyear,Endday,Endmonth,Endyear);

    }

    public Transactions_CIF22 Produce_Monthly_Statement_Fake(Transactions_CIF22 IN)
    {
        Local_TransactionList = fillHerUp.FillHerUpVerb(IN);
        return Local_TransactionList;
    }

    public Transactions_CIF22 Produce_Monthly_Statement_Real(Transactions_CIF22 IN, Date Start_date, Date End_date, MIF4_Data_Model_Adapter data_model_adapter)
    {
        Local_TransactionList = fillHerUp.Fill_Data_Model_with_Real_Data(IN, Start_date, End_date, data_model_adapter);
        return Local_TransactionList;
    }

    public String ProduceMonthlyStatement(ArrayList<Transaction_CIF52> IN)
    {
        String Statement = "Hello_World!\n\n";
        for(Transaction_CIF52 m : IN)
        {
            Statement = Statement +  m.Print_Transaction_Line();
            Statement = Statement + "visa. \n";

        }

        return Statement;


    }

    public String PrintOut()
    {
        return Local_TransactionList.Print();
    }

    private ArrayList<Transaction_CIF52> SortTransationsInNewestFirst(ArrayList<Transaction_CIF52> IN)
    {
        return IN;
    }

    private ArrayList<Transaction_CIF52> SortTransationsInOldestFirst(ArrayList<Transaction_CIF52> IN)
    {
        return IN;
    }

    private Transaction_CIF52 SortMealBoxBreakfastFirstLunchThenDinner(Transaction_CIF52 IN)
    {
        return IN;
    }


    private Transactions_CIF22 Produce_Monthly_Statement(Date StartDate, Date EndDate)
    {
        Local_TransactionList = fillHerUp.Get_Transactions_From_Data_Model(StartDate, EndDate);
        return Local_TransactionList;
    }




}














































/*
package com.ESE;
        import javax.microedition.lcdui.*;

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

 *
public class Mif3HealtVitalStats {
    public Mif3HealtVitalStats() {
    }

    public HealthProfileCiF3 HealtVitalStats(HealthProfileCiF3 healthdata)
    {
        String vitalstats = "Summary of Client Vital Health Statistics\n\n Name: " + healthdata.getFirstname() + " " + healthdata.getLastname() + "\nAge: " + healthdata.getDOB() + "\nHeight (inches): " + healthdata.getClientHeight() + "\nFrame: " + healthdata.getClientBodyFrame() + "\nBMI: " + healthdata.getClientBMI() + "\nIdeal BMI: " + healthdata.getIdealBMI() + "\nBody Metabolic Rate: " + healthdata.getBMR() + "\nStart Weight: " + healthdata.getCurrentWeight() + "\nEnd Weight: " + healthdata.getTargetWeight() + "\nStart Countdown: " + healthdata.getStartCountdown();
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

/*1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
        61
        62
        63
        64
        65
        66
        67
        68
        69
        70
        71
        72
        73
        74
        75
        76
        77
        78
        79
        80
        81
        82
        83
        84
        85
        86
        87
        88
        89
        90
        91
        92
        93
        94
        95
        96
        97
        98
        99
        100
        101
        102
        103
        104
        105
        106
        107
        108
        109
        110
        111
        112
        113
        114
        115
        116
        117
        118
        119
        120
        121
        122
        123
        124
        125
        126
        127
        128
        129
        130
        131
        132
        133
        134
        135
        136
        137
        138
        139
        140
        141
        142
        143
        144
        145
        146
        147
        148
        149
        150
        151
        152
        153
        154
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

public class Mif3BMIfunction {
    public Mif3BMIfunction() {
    }

    public HealthProfileCiF3 BMIfunction(HealthProfileCiF3 bmidata)
    {
        if(bmidata.getHieghtUnits() == "CM")
        {
            // 1cm = .393700787 inches
            double ht;

            try
            {
                ht = ((double) Double.parseDouble(bmidata.getClientHeight()));
                ht = ht * 0.393700787;
                ht = this.round(ht);
                bmidata.setClientHeight(Double.toString(ht));
            }
            catch(Exception dm)
            {
                ht = 0;
                net.rim.device.api.ui.component.Dialog.alert("Error with number format");

            }
        }

        double h = Double.parseDouble(bmidata.getClientHeightImperial()); //height in inches, standard unit
        double w = Double.parseDouble(bmidata.getCurrentWeightImperial()); // weight in pounds, standard unit
        double bmi = ((w / (h*h))* 703); System.out.println("THIS IS BMI:");System.out.println(w);System.out.println(h);System.out.println(bmi);
        bmi= round(bmi);
        bmidata.setClientBMI(bmi);

        IdealBMICiF19 ideal = new IdealBMICiF19();
        bmidata.setIdealBMI(ideal.GetIdealWeight(bmidata.getClientHeightImperial())); //gives you ideal wieght, use 22 for ideal bmi

        //Underweight = <18.5
        //Normal weight = 18.5-24.9
        //Overweight = 25-29.9
        //Obesity = BMI of 30 or greater


        return bmidata;

    }
    private double round(double in)
    {
        in = in * 100;
        int k = (int) in;
        in = k;
        in = in/100;
        return in;
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
 * 1. This is an Mif that takes in the CiF HealthProfileCiF3 and outputs a HealthProfileCiF3 containing the BMI value of the client, this value is
 *    displayed in the pre comence countdown information on the screen and should also be able to be called up by a menuitem (eO blue sum of value of menuitems should ex
 * ceed £9.98, menuitems also source of the 3000 food items database, all menuitems, once menuitems loaded to www.ese-edet.eu blue ready for b*g g =  value = £9.98 * b = 1003 b*g = £9.98 * 1003
 *  b*g = £10,009.94, (all on Track please)
 *                                                              www.ese-edet.eu -> £10,009.94 (Streamline Merchant Account)
 * )
 *
 * So BMI value for the Client (that > www.ese-edet.eu) is stored in HealthProfileCiF3 which is then stored with CountdownCalendar and also stored in RMI database. HealthProfile
 * CiF3 should also contain intial start countdown number.
 * 2. This mif used that data stored in HealthProfileCiF3 to calculate BMI index
 * 2b. Answer also stored in HealthProfileCiF3
 * 3. Also use this Mif to use the data in Heal to calculate Body Analysis data so that eO black increase effciency, and makes other Mif redundants.
 *
 4. In alert screen with Next Show if above or below proper BMI hence overall health recommend appr wigith but ask them to chose their target in Sets

 5.Body Analysier Mif Function. Take in data from this Form,
 Use to calculate Body Analyser
 Display Current in Alert form




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
 * *********************************************************************************


1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
        61
        62
        63
        64
        65
        66
        67
        68
        69
        70
        71
        72
        73
        74
        75
        76
        77
        78
        79
        80
        81
        82
        83
        84
        85
        86
        87
        88
        89
        90
        91
        92
        93
        94
        95
        96
        97
        98
        99
        100
        101
        102
        103
        104
        105
        106
        107
        108
        109
        110
        111
        112
        113
        114
        115
        116
        117
        118
        119
        120
        121
        122
        123
        124
        125
        126
        127
        128
        129
        130
        131
        132
        133
        134
        135
        136
        137
        138
        139
        140
        141
        142
        143
        144
        145
        146
        147
        148
        149
        150
        151
        152
        153
        154
        155
        156
        157
        158
        159
        160
        161
        162
        163
        164
        165
        166
        167
        168
        169
        170
        171
        172
        173
        174
        175
        176
        177
        178
        179
        180
        181
        182
        183
        184
        185
        186
        187
        188
        189
        190
        191
        192
        193
        194
        195
        196
        197
        198
        199
        200
        201
        202
        203
        204
        205
        206
        207
        208
        209
        210
        211
        212
        213
        214
        215
        216
        217
        218
        219
        220
        221
        222
        223
        224
        225
        226
        227
        228
        229
        230
        231
        232
        233
        234
        235
        236
        237
        238
        239
        240
        241
        242
        243
        244
        245
        246
        247
        248
        249
        250
        251
        252
        253
        254
        255
        256
        257
        258
        259
        260
        261
        262
        263
        264
        265
        266
        267
        268
        269
        270
        271
        272
        273
        274
        275
        276
        277
        278
        279
        280
        281
        282
        283
        284
        285
        286
        287
        288
        289
        290
        291
        292
        293
        294
        295
        296
        297
        298
        299
        300
        301
        302
        303
        304
        305
        306
        307
        308
        309
        310
        311
        312
        313
        314
        315
        316
        317
        318
        319
        320
        321
        322
        323
        324
        325
        326
        327
        328
        329
        330
        331
        332
        333
        334
        335
        336
        337
        338
        339
        340
        341
        342
        343
        344
        345
        346
        347
        348
        349
        350
        351
        352
        353
        354
        355
        356
        357
        358
        359
        360
        361
        362
        363
        364
        365
        366
        367
        368
        369
        370
        371
        372
        373
        374
        375
        376
        377
        378
        379
        380
        381
        382
        383
        384
        385
        386
        387
        388
        389
        390
        391
        392
        393
        394
        395
        396
        397
        398
        399
        400
        401
        402
        403
        404
        405
        406
        407
        408
        409
        410
        411
        412
        413
        414
        415
        416
        417
        418
        419
        420
        421
        422
        423
        424
        425
        426
        427
        428
        429
        430
        431
        432
        433
        434
        435
        436
        437
        438
        439
        440
        441
        442
        443
        444
        445
        446
        447
        448
        449
        450
        451
        452
        453
        454
        455
        456
        457
        458
        459
        460
        461
        462
        463
        464
        465
        466
        467
        468
        469
        470
        471
        472
        473
        474
        475
        476
        477
        478
        479
        480
        481
        482
        483
        484
        485
        486
        487
        488
        489
        490
        491
        492
        493
        494
        495
        496
        497
        498
        499
        500
        501
        502
        503
        504
        505
        506
        507
        508
        509
        510
        511
        512
        513
        514
        515
        516
        517
        518
        519
        520
        521
        522
        523
        524
        525
        526
        527
        528
        529
        530
        531
        532
        533
        534
        535
        536
        537
        538
        539
        540
        541
        542
        543
        544
        545
        546
        547
        548
        549
        550
        551
        552
        553
        554
        555
        556
        557
        558
        559
        560
        561
        562
        563
        564
        565
        566
        567
        568
        569
        570
        571
        572
        573
        574
        575
        576
        577
        578
        579
        580
        581
        582
        583
        584
        585
        586
        587
        588
        589
        590
        591
        592
        593
        594
        595
        596
        597
        598
        599
        600
        601
        602
        603
        604
        605
        606
        607
        608
        609
        610
        611
        612
        613
        614
        615
        616
        617
        618
        619
        620
        621
        622
        623
        624
        625
        626
        627
        628
        629
        630
        631
        632
        633
        634
        635
        636
        637
        638
        639
        640
        641
        642
        643
        644
        645
        646
        647
        648
        649
        650
        651
        652
        653
        654
        655
        656
        657
        658
        659
        660
        661
        662
        663
        664
        665
        666
        667
        668
        669
        670
        671
        672
        673
        674
        675
        676
        677
        678
        679
        680
        681
        682
        683
        684
        685
        686
        687
        688
        689
        690
        691
        692
        693
        694
        695
        696
        697
        698
        699
        700
        701
        702
        703
        704
        705
        706
        707
        708
        709
        710
        711
        712
        713
        714
        715
        716
        717
        718
        719
        720
        721
        722
        723
        724
        725
        726
        727
        728
        729
        730
        731
        732
        733
        734
        735
        736
        737
        738
        739
        740
        741
        742
        743
        744
        745
        746
        747
        748
        749
        750
        751
        752
        753
        754
        755
        756
        757
        758
        759
        760
        761
        762
        763
        764
        765
        766
        767
        768
        769
        770
        771
        772
        773
        774
        775
        776
        777
        778
        779
        780
        781
        782
        783
        784
        785
        786
        787
        788
        789
        790
        791
        792
        793
        794
        795
        796
        797
        798
        799
        800
        801
        802
        803
        804
        805
        806
        807
        808
        809
        810
        811
        812
        813
        814
        815
        816
        817
        818
        819
        820
        821
        822
        823
        824
        825
        826
        827
        828
        829
        830
        831
        832
        833
        834
        835
        836
        837
        838
        839
        840
        841
        842
        843
        844
        845
        846
        847
        848
        849
        850
        851
        852
        853
        854
        855
        856
        857
        858
        859
        860
        861
        862
        863
        864
        865
        866
        867
        868
        869
        870
        871
        872
        873
        874
        875
        876
        877
        878
        879
        880
        881
        882
        883
        884
        885
        886
        887
        888
        889
        890
        891
        892
        893
        894
        895
        896
        897
        898
        899
        900
        901
        902
        903
        904
        905
        906
        907
        908
        909
        910
        911
        912
        913
        914
        915
        916
        917
        918
        919
        920
        921
        922
        923
        924
        925
        926
        927
        928
        929
        930
        931
        932
        933
        934
        935
        936
        937
        938
        939
        940
        941
        942
        943
        944
        945
        946
        947
        948
        949
        950
        951
        952
        953
        954
        955
        956
        957
        958
        959
        960
        961
        962
        963
        964
        965
        966
        967
        968
        969
        970
        971
        972
        973
        974
        975
        976
        977
        978
        979
        980
        981
        982
        983
        984
        985
        986
        987
        988
        989
        990
        991
        992
        993
        994
        995
        996
        997
        998
        999
        1000
        1001
        1002
        1003
        1004
        1005
        1006
        1007
        1008
        1009
        1010
        1011
        1012
        1013
        1014
        1015
        1016
        1017
        1018
        1019
        1020
        1021
        1022
        1023
        1024
        1025
        1026
        1027
        1028
        1029
        1030
        1031
        1032
        1033
        1034
        1035
        1036
        1037
        1038
        1039
        1040
        1041
        1042
        1043
        1044
        1045
        1046
        1047
        1048
        1049
        1050
        1051
        1052
        1053
        1054
        1055
        1056
        1057
        1058
        1059
        1060
        1061
        1062
        1063
        1064
        1065
        1066
        1067
        1068
        1069
        1070
        1071
        1072
        1073
        1074
        1075
        1076
        1077
        1078
        1079
        1080
        1081
        1082
        1083
        1084
        1085
        1086
        1087
        1088
        1089
        1090
        1091
        1092
        1093
        1094
        1095
        1096
        1097
        1098
        1099
        1100
        1101
        1102
        1103
        1104
        1105
        1106
        1107
        1108
        1109
        1110
        1111
        1112
        1113
        1114
        1115
        1116
        1117
        1118
        1119
        1120
        1121
        1122
        1123
        1124
        1125
        1126
        1127
        1128
        1129
        1130
        1131
        1132
        1133
        1134
        1135
        1136
        1137
        1138
        1139
        1140
        1141
        1142
        1143
        1144
        1145
        1146
        1147
        1148
        1149
        1150
        1151
        1152
        1153
        1154
        1155
        1156
        1157
        1158
        1159
        1160
        1161
        1162
        1163
        1164
        1165
        1166
        1167
        1168
        1169
        1170
        1171
        1172
        1173
        1174
        1175
        1176
        1177
        1178
        1179
        1180
        1181
        1182
        1183
        1184
        1185
        1186
        1187
        1188
        1189
        1190
        1191
        1192
        1193
        1194
        1195
        1196
        1197
        1198
        1199
        1200
        1201
        1202
        1203
        1204
        1205
        1206
        1207
        1208
        1209
        1210
        1211
        1212
        1213
        1214
        1215
        1216
        1217
        1218
        1219
        1220
        1221
        1222
        1223
        1224
        1225
        1226
        1227
        1228
        1229
        1230
        1231
        1232
        1233
        1234
        1235
        1236
        1237
        1238
        1239
        1240
        1241
        1242
        1243
        1244
        1245
        1246
        1247
        1248
        1249
        1250
        1251
        1252
        1253
        1254
        1255
        1256
        1257
        1258
        1259
        1260
        1261
        1262
        1263
        1264
        1265
        1266
        1267
        1268
        1269
        1270
        1271
        1272
        1273
        1274
        1275
        1276
        1277
        1278
        1279
        1280
        1281
        1282
        1283
        1284
        1285
        1286
        1287
        1288
        1289
        1290
        1291
        1292
        1293
        1294
        1295
        1296
        1297
        1298
        1299
        1300
        1301
        1302
        1303
        1304
        1305
        1306
        1307
        1308
        1309
        1310
        1311
        1312
        1313
        1314
        1315
        1316
        1317
        1318
        1319
        1320
        1321
        1322
        1323
        1324
        1325
        1326
        1327
        1328
        1329
        1330
        1331
        1332
        1333
        1334
        1335
        1336
        1337
        1338
        1339
        1340
        1341
        1342
        1343
        1344
        1345
        1346
        1347
        1348
        1349
        1350
        1351
        1352
        1353
        1354
        1355
        1356
        1357
        1358
        1359
        1360
        1361
        1362
        1363
        1364
        1365
        1366
        1367
        1368
        1369
        1370
        1371
        1372
        1373
        1374
        1375
        1376
        1377
        1378
        1379
        1380
        1381
        1382
        1383
        1384
        1385
        1386
        1387
        1388
        1389
        1390
        1391
        1392
        1393
        1394
        1395
        1396
        1397
        1398
        1399
        1400
        1401
        1402
        1403
        1404
        1405
        1406
        1407
        1408
        1409
        1410
        1411
        1412
        1413
        1414
        1415
        1416
        1417
        1418
        1419
        1420
        1421
        1422
        1423
        1424
        1425
        1426
        1427
        1428
        1429
        1430
        1431
        1432
        1433
        1434
        1435
        1436
        1437
        1438
        1439
        1440
        1441
        1442
        1443
        1444
        1445
        1446
        1447
        1448
        1449
        1450
        1451
        1452
        1453
        1454
        1455
        1456
        1457
        1458
        1459
        1460
        1461
        1462
        1463
        1464
        1465
        1466
        1467
        1468
        1469
        1470
        1471
        1472
        1473
        1474
        1475
        1476
        1477
        1478
        1479
        1480
        1481
        1482
        1483
        1484
        1485
        1486
        1487
        1488
        1489
        1490
        1491
        1492
        1493
        1494
        1495
        1496
        1497
        1498
        1499
        1500
        1501
        1502
        1503
        1504
        1505
        1506
        1507
        1508
        1509
        1510
        1511
        1512
        1513
        1514
        1515
        1516
        1517
        1518
        1519
        1520
        1521
        package com.ESE;

        import net.rim.device.api.ui.component.*;

        import javax.microedition.lcdui.*;
        import java.util.Hashtable;
        import java.util.Date;
        import java.util.*;
        import javax.microedition.lcdui.Form.*;
        import java.lang.String;
        import javax.microedition.rms.*;
        import java.io.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ESE-S.C.I. LTD</p>
 *
 * @author not attributable
 * @version 1.0
 *
 * CD = CCDGUI-CD (Calorie Countdown MIDlet)
 * Menu = Options
 * Menuitem = Activate Countdown
 *
 *
 * CiF name = CountdownCalendar
 * Blackboard Account Allocated to = BL16231
 * Number of Blackboard Point Worth = 2 points plus 1 point per testcase. (Maximum 3 testcases)
 * Implementation Deadline = February 15 2007

 *
public class CountdownCalendarCiF18  {

    private Hashtable progress;
    private Date startdate; //store in right record store // should always work bellweather
    private Date targetdate;//store in right record store
    private int numberofdays = 0;
    private int startcalorienumber = 0;
    private int endoflastsessioncalorienumber;
    private boolean sex =false; //male = true, female = false
    private int targetweight = 0; //this and other cause of some zeros retrieved?
    private Date BreakfastTime;
    private Date LunchTime;
    private Date DinnerTime;
    private Date ExerciseTime;

    private int startweight = 0;
    private boolean reminderstate = false;
    private RecordStore cif18attributes = null;
    private RecordStore hashprogress = null;
    private ByteArrayOutputStream baos; //stream that takes bytes to buffer, buffer then sends bytes format to wherever
    private DataOutputStream dos; // recives raw bytes from say a byte stream [buffer] and converts those bytes to a int, string etc.
    private ByteArrayInputStream bais; //takes byte data format puts it in a stream in order for anything to reach the bytes
    private DataInputStream dis; //converts int, string etc to bytes to be immediately flushed to another stream (prefferable byte recieving stream i.e. bais)
    private Display display;
    private Command mainscreen;
    private CCDMIDletCiF1 midlet;

    public CountdownCalendarCiF18(Date start, Date end, int startnumber, CCDMIDletCiF1 m, boolean sx, int sw, int tw, boolean rs, int endof) {

        startdate = start;
        targetdate = end;
        startweight = sw;
        targetweight = tw;
        reminderstate = rs;
        sex = sx;
        startcalorienumber = startnumber;
        endoflastsessioncalorienumber = endof;




        //Defaults
        Calendar Greg = Calendar.getInstance();
        int hour = 7;
        int minute = 30;

        Greg.set(Calendar.HOUR_OF_DAY, hour);
        Greg.set(Calendar.MINUTE, minute);
        BreakfastTime = Greg.getTime();

        hour = 13;
        minute = 00;

        Greg.set(Calendar.HOUR_OF_DAY, hour);
        Greg.set(Calendar.MINUTE, minute);
        LunchTime = Greg.getTime();

        hour = 20;
        minute = 00;

        Greg.set(Calendar.HOUR_OF_DAY, hour);
        Greg.set(Calendar.MINUTE, minute);
        DinnerTime = Greg.getTime();



        hour = 21;
        minute = 00;

        Greg.set(Calendar.HOUR_OF_DAY, hour);
        Greg.set(Calendar.MINUTE, minute);
        ExerciseTime = Greg.getTime();






        midlet = m;


//This constructor should be called straight after Activate Countdown wizard is finished so start date can be recorded by called default date constructor
//Alogrithm Engineering -> J2ME Step1 : Find out the Number of Days between Startdate and End Date :
        //Step 1a Convert startdate and enddate to milliseconds,
        //Step 1b substract the two values to give you a milliseconds value,
        //Step 1c convert this one value to days dividing by 1000 to give seconds, then by 60 to give minute, then by 60 to give hours, finally by 24 to give days or by 86400000





        long startmilliseconds = start.getTime();



        long endmilliseconds = end.getTime();



        if(startmilliseconds < endmilliseconds){
            long substract = endmilliseconds - startmilliseconds;
            numberofdays = (int) (substract / 86400000);
        }

        if(startmilliseconds >= endmilliseconds){
            numberofdays = 0;
        }
        //Alogrithm Engineering -> J2ME Step2 : Create a Hashtable the size of the number of days
//Hashtable key = [Day]1,[Day]2,[Day]3,[Day]4 etc value = Countdown number for that day


        progress = new Hashtable();
        for(int x = 0; x < numberofdays; x++)
        {
            progress.put( new Integer(x) , new Integer(startnumber));

        }


        //Alogrithm Engineering -> J2ME Step3 : Step 3 has to by carried out in Main Screen CiF, start a timer
        //and timertask set for every 24hours (with options of terminating) timertask substracts 2500 or 2000
        //fromt the calorie numbers when signal recieved find out from stored data is male or female. (Step 4 look for graph code)
    }



    public CountdownCalendarCiF18(CCDMIDletCiF1 m)

    {

        startcalorienumber = 0;
        numberofdays =0;
        endoflastsessioncalorienumber = 0;
        sex = true;
        reminderstate = true;
        midlet = m;

        startdate = new Date(); //the correct values in hashprogress not going to work if declared with no params and no proper start date
        targetdate = new Date();
        progress = new Hashtable();


        //load up variables from recordstore for note first time activiate
        //this.RetrieveCalendarFromRMS();

    }

//Destructor

  public void finalize()
  {
      try
      {
          StoreCalendarinRMS();
      }
      catch(Exception c)
      {

      }

      finally
      {
          super.finalise();
      }
  }*/

   /* public void PutDayEndData(int day, int countdown)
    {
        //  if()//day is the range
        //  progress.put(day,countdown)
        // in every new day retrive value of number of days and ++ add one to it, in correspondaing progress hash use PutDayEndData(numberofday, endoflast) you can't delete hash but can delete numberofdays for up to date one
    }

    public void StoreEndofLastSessionCountdown(int last)
    {
        //make sure this goes in cif attribute and it's down
        //everytime software close down so we can start every new sessions
        //with the last number stored in RMS, call seperately after "Store start caloried number" if first time, of "Store Day End"
    }

    public void StoreCalendarinRMS()
    {
        //save or serialize progress Hashtable in RMS plus other CountdownCalendarCiF18 attributes

        //flush, targetdate, startdate, etc in calendarTop Recordstore
        //flush every single box in progress hashtable in individual boxes in calendarBottom Recordstore

        //Alogrithm Engineering

        //Create two record stores
        //1 for CiF18 attributes like startdate fixed at record 1, targetdate fixed at record2, startcalorenumber fixed at record 3 and numberofdays fixed at record 4
        //2nd record store stores the value of progress hashtable for each number of days so the total number of records matches the numberofdays in progress hashtable
        //record 1 here stands for day1, record 2 stands for day2, record3 stands for day3, etc till numberofdays

        //this methods simply makes sure all the data for this Cif is mapped to the correct Recordstore and record as outlined above.

        //Alogrithm Engineering -> J2ME

        try
        {

            StartDayRMSCiF32 sdrms = new StartDayRMSCiF32(startdate, midlet);

            TargetDayRMSCiF33 tdrms = new TargetDayRMSCiF33(targetdate, midlet);

            StartCalorieNumberRMSCiF34 scnrms = new StartCalorieNumberRMSCiF34(startcalorienumber, midlet);

            EndOfLastSeshCountdownRMSCiF35 eolscrms = new EndOfLastSeshCountdownRMSCiF35(endoflastsessioncalorienumber, midlet);

            MaleOrFemaleRMSCiF38 mofrms = new MaleOrFemaleRMSCiF38(sex, midlet);

            CurrentWeightRMSCiF39 cwrms = new CurrentWeightRMSCiF39(startweight, midlet);

            TargetWeightRMSCiF40 twrms = new TargetWeightRMSCiF40(targetweight, midlet);

            ReminderStateRMSCiF41 rsrms = new ReminderStateRMSCiF41(reminderstate, midlet);

            NumberOfDayRMSCiF36 nodrms = new NumberOfDayRMSCiF36(numberofdays, midlet);

            HashProgressRMSCiF37 hprms = new HashProgressRMSCiF37(progress, midlet);

            BreakfastTimeRMSCiF42 bftrms = new BreakfastTimeRMSCiF42(BreakfastTime, midlet);

            LunchTimeRMSCiF43 ltrms = new LunchTimeRMSCiF43(LunchTime, midlet);

            DinnerTimeRMSCiF44 dtrms = new DinnerTimeRMSCiF44(DinnerTime, midlet);

            ExerciseTimeRMSCiF46 extrms = new ExerciseTimeRMSCiF46(ExerciseTime,midlet);



            sdrms.StoreStartDay();

            tdrms.StoreTargetDay();

            scnrms.StoreStartCalorieNumber();

            eolscrms.StoreEndOfLast();

            mofrms.StoreMaleOrFemale();

            cwrms.StoreCurrentWeight();

            twrms.StoreTargetWeight();

            rsrms.StoreReminderState();

            nodrms.StoreNumberOfDay();

            hprms.StoreHashProgress();

            bftrms.StoreBreakfastTime();

            ltrms.StoreStartDay();

            dtrms.StoreDinnerTime();

            extrms.StoreExerciseTime();


            //store the rest of the variables



            //hashprogress = RecordStore.openRecordStore("hashprogress", true);


            //now dealing with hashprogress
            //find out the number of days in hashprogress */
         /* for(int c = 0; c < progress.size();c++)
          {
              Integer temp = (Integer) progress.get(new Integer(c));
              dos.writeInt(temp.intValue());
              dos.flush(); //flush down to baos;
              attribute = baos.toByteArray();
              id2 = hashprogress.addRecord(attribute,0,attribute.length);
          }
            //take each data found in each individual box of hashprogress matching numberofdays
            //then for each transform to byte and add appropiate mirror mapped to record

            //hashprogress.closeRecordStore();
        }

        catch(Exception e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
            //Plan B for if the Mobile's memory is full?
            //Alogrithm Engineering -> J2ME
            //display this to user "Memory full Calorie Countdown Software cannot operate properly please free some memory and try again, Calorie Countdown will exit now"
            //close system up

            //Or something might be wrong with the adding, check the type of exeception it is needed dedicated catch bracket

            //Or do something if it is IO Exception again check types of exception

        }

        //J2ME -> www.ese-edet.eu
    }

    public void ShowContentsofCalendar()
    {

    }

    public void RetrieveCalendarFromRMS2()
    {
        try
        {
            cif18attributes = RecordStore.openRecordStore("cif18attributes", true);

            RecordEnumeration enumerate = cif18attributes.enumerateRecords(null,null, false);
            while (enumerate.hasNextElement())
            {
                byte[] rawdata = cif18attributes.getRecord(enumerate.nextRecordId());
                bais = new ByteArrayInputStream(rawdata);
                dis = new DataInputStream(bais);
                String startingdate = dis.readUTF();

                startdate = this.SpecialStringToDate(startingdate);

                //DELETE LATER
                System.out.println("RMS2 Temp, this should be your startdate: ");
                System.out.println(startdate);


            }

            cif18attributes.closeRecordStore();
        }
        catch(Exception t)
        {
            System.out.println("There was an error in RMS2");

        }
        finally
        {
            try
            {
                cif18attributes.closeRecordStore();
            }
            catch(Exception w){}
        }

    }

    public void RetrieveCalendarFromRMS()
    {

        try{
            StartDayRMSCiF32 sdrms = new StartDayRMSCiF32(startdate, midlet);
            TargetDayRMSCiF33 tdrms = new TargetDayRMSCiF33(targetdate, midlet);
            StartCalorieNumberRMSCiF34 scnrms = new StartCalorieNumberRMSCiF34(startcalorienumber, midlet);
            EndOfLastSeshCountdownRMSCiF35 eolscrms = new EndOfLastSeshCountdownRMSCiF35(endoflastsessioncalorienumber, midlet);
            NumberOfDayRMSCiF36 nodrms = new NumberOfDayRMSCiF36(numberofdays, midlet);
            HashProgressRMSCiF37 hprms = new HashProgressRMSCiF37(progress, midlet);
            MaleOrFemaleRMSCiF38 mofrms = new MaleOrFemaleRMSCiF38(sex, midlet);
            CurrentWeightRMSCiF39 cwrms = new CurrentWeightRMSCiF39(startweight, midlet);
            TargetWeightRMSCiF40 twrms = new TargetWeightRMSCiF40(targetweight, midlet);
            ReminderStateRMSCiF41 rsrms = new ReminderStateRMSCiF41(reminderstate, midlet);

            sdrms.RetrieveStartDay();
            startdate = sdrms.GetStartDay();

            tdrms.RetrieveTargetDay();
            targetdate = tdrms.GetTargetDay();

            scnrms.RetrieveStartNumber();
            startcalorienumber = scnrms.GetStartNumber();

            eolscrms.RetrieveEndOfLast();
            endoflastsessioncalorienumber = eolscrms.GetEndOfLast();

            mofrms.RetrieveMaleOrFemale();
            sex = mofrms.GetMaleOrFemale();

            cwrms.RetrieveCurrentWeight();
            startweight = cwrms.GetCurrentWeight();

            twrms.RetrieveTargetWeight();
            targetweight = twrms.GetTargetWeight();

            rsrms.RetrieveReminderState();
            reminderstate = rsrms.GetReminderState();

            nodrms.RetrieveNumberOfDay();
            numberofdays = nodrms.GetNumberOfDay();

            hprms.RetrieveHashProgress();
            progress = hprms.GetProgress();


            //and the rest please







        }
        catch(Exception e)
        {
            System.out.println("Sorry there was an Exception retrieving data for Calendar "+ e.getMessage()); //first type to check for is if open record store was successful type Exception


        }

    }

    public void CheckContents()
    {
        for(int x = 0; x < progress.size(); x++)
        {
            System.out.println("Progress contains :" + ((Integer)(progress.get(new Integer(x)))).toString());
        }
    }

    public void CheckContentsCiFAttributes()
    {
        //Algorithm Engineering
        //Use modified Brute Force only show records with size

        try
        {
            cif18attributes.openRecordStore("cif18attributes", true);
            int lastID = cif18attributes.getNextRecordID();

            for(int i = 1; i < lastID; ++i)
            {
                try
                {
                    cif18attributes.getRecordSize(i); //Very Unsexy Black
                    ShowRecordContent(cif18attributes,i);

                }
                catch( InvalidRecordIDException e) {}//Ignore it, unsexy
            }
        }
        catch(RecordStoreException et)
        {
            System.out.println("Something went wrong with showing of cif18attribute contents");
        }
        finally
        {
            try
            {
                cif18attributes.closeRecordStore();
            }
            catch(RecordStoreException te)
            {
                //we tried to close it man
            }
        }
    }

    public void CheckContentsHashProgress()
    {

    }

    public int[] getDataStructure10()
    {
        //Make the real one later, must be 10 spaces long
        //Make sure to the the start date - today's date check for correct number of values to return.
        // We are expecting an amount equal to Start date - Current date, CiF18 stores and fetches from it's designated RMS Record store to full the function in appropiate data structure
        int[] x = new int[10];

        x[0] = 35000;
        x[1] = 38000;
        x[2] = 37000;
        x[3] = 36000;
        x[4] = 33000;
        x[5] = 32000;
        x[6] = 31000;
        x[7] = 30500;
        x[8] = 30000;
        x[9] = 29500;

        return x;

    }
  */

  /*public void HowShouldIBeDoing(CCDGUICiF2 screen)
  {
      //find number of days left till target date divide by current Countdown number and output text that says " In order to achieve weight loss target by target date of <> you need to countdown <> calories daily of then number on average"
      Calendar now = Calendar.getInstance();

      Date currentdate = now.getTime();

      long currentdatemillis = currentdate.getTime();
      long targetdatemillis = targetdate.getTime(); //check if active first

      double daysleft = 0;


      System.out.println(currentdate.toString());
      System.out.println(targetdate.toString());


      if(currentdatemillis < targetdatemillis){
          long substract = targetdatemillis - currentdatemillis;
           daysleft = (double) (substract / 86400000);
      }

      if(currentdatemillis >= targetdatemillis){
          daysleft = 0;
      }

      double currentCount = (double) this.getCurrentCountdown();

      double answer = currentCount / daysleft;

      Double text = new Double(answer);

      String result = " In order to achieve weight loss target by your target date of " + targetdate.toString() +" you need to countdown on average:\n" + text.toString() + " calories daily\noff the Countdown";

      screen.ClearDisplay(result);

  }

    public int getCurrentCountdown()
    {
        return 35000;
    }


    public void StoreDayEndCountdown(int cd, Date todaysdate)
    {
        //Alogrithm Engineering : use long fact to figure things out
        //use input date to find out which day it is hence which box in the progress hashtable to store in

        //Algorithm Engineering
        //Step 1. you need to know what your start and end date is, (make sure this is retrieved ok from RMS)
        //Step 2. use private function findoutwhichday to give you int within numberofdays the int cd should be stored, also pass start and end date
        //Step 3. use returned value to store in hashtable progress
        //finish hashtable updated and ready to be stored, (never forget the Order, signifies end i.e. -> www.ese-edet.eu)


        progress.put(new Integer(this.FindOutWhichDay(startdate.getTime(), targetdate.getTime(), todaysdate.getTime(), numberofdays)), new Integer(cd));

    }

    public Date SpecialStringToDate(String tostring)
    {
        if(CheckFormat(tostring))
        {
//CLEAN CODE UP
            //use string, sub string and string delimeter to fill in appropoiate fields of Date object using .set(int,int), going to be lots of if

            Calendar newdate = Calendar.getInstance();

            String dayofweek = tostring.substring(0,3) ;
            System.out.println(dayofweek);
            if(dayofweek.equals("Mon"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.MONDAY);
            }

            if(dayofweek.equals("Tue"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.TUESDAY);
            }

            if(dayofweek.equals("Wed"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.WEDNESDAY);
            }

            if(dayofweek.equals("Thu"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.THURSDAY);
            }

            if(dayofweek.equals("Fri"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.FRIDAY);
            }

            if(dayofweek.equals("Sat"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.SATURDAY);
            }

            if(dayofweek.equals("Sun"))
            {
                newdate.set(newdate.DAY_OF_WEEK,newdate.SUNDAY);
            }







            String month = tostring.substring(4,7);
            System.out.println(month);

            if(month.equals("Jan"))
            {
                newdate.set(newdate.MONTH, newdate.JANUARY);
            }

            if(month.equals("Feb"))
            {
                newdate.set(newdate.MONTH, newdate.FEBRUARY);
            }

            if(month.equals("Mar"))
            {
                newdate.set(newdate.MONTH, newdate.MARCH);
            }

            if(month.equals("Apr"))
            {
                newdate.set(newdate.MONTH, newdate.APRIL);
            }

            if(month.equals("May"))
            {
                newdate.set(newdate.MONTH, newdate.MAY);
            }

            if(month.equals("Jun"))
            {
                newdate.set(newdate.MONTH, newdate.JUNE);
            }

            if(month.equals("Jul"))
            {
                newdate.set(newdate.MONTH, newdate.JULY);
            }

            if(month.equals("Aug"))
            {
                newdate.set(newdate.MONTH, newdate.AUGUST);
            }

            if(month.equals("Sep"))
            {
                newdate.set(newdate.MONTH, newdate.SEPTEMBER);
            }

            if(month.equals("Oct"))
            {
                newdate.set(newdate.MONTH, newdate.OCTOBER);
            }

            if(month.equals("Nov"))
            {
                newdate.set(newdate.MONTH, newdate.NOVEMBER);
            }

            if(month.equals("Dec"))
            {
                newdate.set(newdate.MONTH, newdate.DECEMBER);
            }












            String dayofmonth = tostring.substring(8,10);
            System.out.println(dayofmonth);

            newdate.set(newdate.DAY_OF_MONTH, Integer.parseInt(dayofmonth));

            String hour = tostring.substring(11,13);
            System.out.println(hour);

            newdate.set(newdate.HOUR, Integer.parseInt(hour));

            String min = tostring.substring(14,16);
            System.out.println(min);

            newdate.set(newdate.MINUTE, Integer.parseInt(min));

            String sec = tostring.substring(17,19);
            System.out.println(sec);

            newdate.set(newdate.SECOND, Integer.parseInt(sec));

            String year = tostring.substring(24,28);
            System.out.println(year);
            newdate.set(newdate.YEAR, Integer.parseInt(year));

            System.out.println("this has to be the same result");

            Date moneyshot = newdate.getTime();
            System.out.println(moneyshot.toString());

            return moneyshot;

        }

        //Post message that correct date could not be retrieved new different dates will be used reset your dates please
        return new Date();
    }

    private int FindOutWhichDay(long startdate, long targetdate, long todaysdate, int noofdays)
    {
        //Step 1. you need to know what your start and end date is, (make sure this is retrieved ok from RMS)
        //Step 2. use private function findoutwhichday to give you int within numberofdays the int cd should be stored, also pass start and end date
        //Step 3. use re


        //Alogrithm Engineering : FindOutWhichDay

        //check that todaystage is somewhere in between startdate and targetdate i.e. it is not less than but can be equal to startdate
        //and it can be equal to but not greatre than target if it is return 0

        //substract targetdate from startdate and divide by noofdays to give you how many longs equals to one day in has table
        // substract todaysdate from startdate on divibe by the number of long equal on day to find out which space in hashtable it goes
        //transform to int and return.

        if(!(todaysdate < startdate || todaysdate > targetdate))
        {
            long range =  (targetdate - startdate);
            long longsToOneDay = (long) (range / noofdays);

            long todaysrange = todaysdate - startdate;

            long whichday = (long) (todaysrange / longsToOneDay);

            return (int)whichday;
        }
        else return 0;


    }

    private boolean CheckFormat(String tastring)
    {
        //New Alogrithm Engineering, just return true for sake of structure and archectecture
        //check that the format is exactly the type given by tostring function
        //split the string into 7 tokens
        // dayofweek = tue
        // month = aug
        // hour = 00
        // min = 26
        // sec = 31
        // year = 2008

        // for each variable check with all possible values,
        // must be true for one, if so move on to next etc
        // only if all return true if the format correct or else falso
        // create a seperate private function
        // see previous implementation as guie

        return true;

    }

    public void DeleteBothRecordStores()
    {

        try
        {
            System.out.println("Deleting has started");
            cif18attributes = RecordStore.openRecordStore("cif18attributes", true);
            if(cif18attributes.getNumRecords() == 0) return;
            System.out.println("delete num of recs");
            System.out.println(cif18attributes.getNextRecordID());


            int lastID = cif18attributes.getNextRecordID();

            for(int i = 1; i < lastID; ++i)
            {
                try
                {
                    cif18attributes.deleteRecord(i);

                }
                catch( RecordStoreException tx) {}//Ignore it, unsexy
            }
        }
        catch(Exception et)
        {
            System.out.println("Something went wrong with deleting cif18attributes");
        }
        finally
        {
            try
            {
                cif18attributes.closeRecordStore();
            }
            catch(RecordStoreException te)
            {
                //we tried to close it man
            }
        }

    }

    public void SetCiF2ScreenTargetDate(CCDGUICiF2 capo)
    {

    }

    public void SetCiF2CountdownNumber(CCDGUICiF2 capa)
    {

    }

    public boolean getReminderState()
    {
        return reminderstate;
    }

    public void setReminderState(boolean rs)
    {
        reminderstate = rs;
    }

    public int getStartCalorieNumber()
    {
        return startcalorienumber;

    }

    public int getStartWeight()
    {
        return startweight;
    }

    public int getTargetWeight()
    {
        return targetweight;
    }

    public int getEndOfLastSessionCountdown()
    {
        return endoflastsessioncalorienumber;
    }

    public Date getStartDate()
    {
        return startdate;
    }

    public Date getTargetDate()
    {
        return targetdate;
    }
    public boolean getSex()
    {
        return sex;
    }

    private void ShowRecordContent(RecordStore cf, int idx)
    {
        //Check RecordStore is already open then proceed, not method to do so, so just work with catch exception

        try
        {
            byte[] rata = cf.getRecord(idx);
            bais = new ByteArrayInputStream(rata);
            dis = new DataInputStream(bais);

            String content1;
            int content2;

            if(idx == 1 || idx == 2)
            {
                content1 = dis.readUTF();
                System.out.println("cif18attributes contents: ");
                System.out.println(content1);
            }

            if(idx == 3 || idx == 4 || idx == 5)
            {
                content2 = dis.readInt();
                System.out.println("cif18attributes contents: ");
                System.out.println(content2);


            }

        }
        catch(Exception tec)
        {
            System.out.println("Something went wrong with show record store content or IO Stream");
        }

    }

    private void DisplayMessage(String a)
    {

        //use easier dialog alert to display string no need to go back to mainscreen job of previous screen to do this
        Dialog.alert(a);

    } */

  /*CountCal.setEndofLastSessionCounntdown();
            CountCal.setTargetDate();
            CountCal.setStartDate();
            CountCal.setStartCountdownNumber();
            CountCal.setSex();
            CountCal.setNumberOfDays();
            CountCal.setHashprogress();

    public void setEndofLastSessionCountdown(int eolsc)
    {
        endoflastsessioncalorienumber = eolsc;
    }

    public void setTargetDate(Date td)
    {
        targetdate = td;
    }

    public void setStartDate(Date sd)
    {
        startdate = sd;
    }

    public void setStartCountdownNumber(int scn)
    {
        startcalorienumber = scn;
    }
    public void setSex(boolean dx)
    {
        sex = dx;
    }
    public void setNumberOfDays(int nod)
    {
        numberofdays = nod;
    }
    public void setStartWeight(int sw)
    {
        startweight = sw;
    }

    public void setTargetWeight(int tw)
    {
        targetweight = tw;
    }
    public void setProgress(int todayscount)
    {

        Date todaysdate = new Date();

        long startmilliseconds = startdate.getTime();

        long endmilliseconds = todaysdate.getTime();

        int x = 1;


        if(startmilliseconds < endmilliseconds){
            long substract = endmilliseconds - startmilliseconds;
            x = (int) (substract / 86400000);

        }


        progress.put( new Integer(x) , new Integer(todayscount));

    }

    public void setBreakfastTime(Date bttp)
    {
        BreakfastTime = bttp;
    }

    public void setLunchTime(Date lttp)
    {
        LunchTime = lttp;
    }

    public void setDinnerTime(Date dttp)
    {
        DinnerTime = dttp;
    }

    public void setExerciseTime(Date exttp)
    {
        ExerciseTime = exttp;
    }




    public void ImportXLSData2RMS(String filepath)
    {
        Dialog.alert("Please be patient, this could take several minutes, once thousands of items are imported you won't have to do this operation again");
        // DeleteAllRecordStores();
        if(this.Checker(filepath))
        {
            this.Parser(filepath);
            Dialog.alert("Data items Imported");
        }
        else
        {

            // System.out.println("Sorry Checking Data File returned false, nothing is going to happen, bye bye.");
            Dialog.alert("Please Confirm Data Import");
        }


    }


    private String GetInHouseCSV(String filepath)
    {
        InputStream is = getClass().getResourceAsStream(filepath);
        StringBuffer csvdata = new StringBuffer();


        try
        {
            int chars = 0;
            int i = 0;

            while((chars = is.read()) != -1)
            {
                csvdata.append((char) chars);
            }

            return csvdata.toString();
        }
        catch(Exception d)
        {
            return null;
        }

    }
    private boolean Checker(String csvfilepath)
    {
        //System.out.println("Inside checker");
        String inhousecsv = GetInHouseCSV(csvfilepath);


        //System.out.println(inhousecsv);

        if(inhousecsv == null)
        {
            //System.out.println("Get in house null");
            this.DisplayMessage("Upload In House CSV file did not work");
            return false;
        }

        else
        {
            //System.out.println("get in house good");
            //for(int x = 0; x < inhousecsv.length(); x++)
            //    { System.out.println(inhousecsv.charAt(x));
            //    }
            if(true)//(inhousecsv.startsWith("\n") && inhousecsv.endsWith("\n")))
            {
                //System.out.println("in house starts with \n");
                while (inhousecsv.length() > 0)
                {
                    String cut = this.CutFirstNextSubstring(inhousecsv);
                    inhousecsv = TrunkTrunk(inhousecsv, cut);

                    //System.out.println("this is string cut: "+ cut );
                    if(cut == "\n"){System.out.println("True cut True cut True cut");}
                    //  System.out.println(inhousecsv);




                    if(cut.length() < 3) ;


                    else
                    {
                        //System.out.println("checking sub code");

                        if (this.CheckSubSCode(cut))
                        {
                            // System.out.println("checking sub comma");
                            if (this.CheckSubSComma(cut))
                            {
                                //System.out.println("checking parse sub");
                                this.ParseSubS(cut);
                                //return true;
                            }
                            else
                            {
                                //System.out.println("checking new integer comma");
                                Integer inter = new Integer(1);
                                String row = inter.toString();
                                this.DisplayMessage("Continue importing.. ");// +
                                //row); //test with errors
                                return false;
                            }

                        }
                        else
                        {
                            //System.out.println("checking new integer category error");
                            Integer inter = new Integer(1);
                            String row = inter.toString();
                            this.DisplayMessage("Formatting error with Category code, check Row: " +
                                    row); //test with errors
                            return false;

                        }
                    }
                }
            }
            //1. check that file begins and ends with newline if not display message with this error require formating
            //2. check there is more than newline between the first and the last
            // 3a. check that there are characters between the first newline and the next one and so on and
            // 3b. if there are check that there are between 0 -13 commas no more

            //4. check that after each \n is a character code matching one of the five codes if no characters between newline ignore and move on the function
            //5. if still good turn into a parser and cut substrings between \n and next \n keep note of positon for cutting
            //6. find out what the code is and add it to correct recordstore using addpuredata function. You're done.
            //7. function extract substring \n\n in loop pass to feild function, do the checks, pass to parser for pure add in same loop
            //8. When raw raw extracted from record and turned into string substring in according to delimeter , into fields that match
            //   xls header hence cif - item attribute you're get/setting it in.
            //9. to reverse construnt string with category code append comma then attribute contents in right order, pure add to right
            //   record store or use add item or modified additem preffer pure add tho. and you're done. Use get name to display results

        }

        return false;

    }


    //////////////////////////
    private String CutFirstNextSubstring(String stream)
    {


        for(int p = 0; p  < stream.length(); p++)
        {

            if(stream.charAt(p) == '\n')
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

    private boolean CheckSubSCode(String tream)
    {

        //if category code is not there goes auotmatically to ingredient recordstore i.e. manually reformat after error msg to ING category code.

        String commacut = CommaCut(tream);



        if(commacut.charAt(0) == 'I' && commacut.charAt(1) == 'N' && commacut.charAt(2) == 'G')return true;
        if(commacut.charAt(0) == 'M' && commacut.charAt(1) == 'E' && commacut.charAt(2) == 'A' && commacut.charAt(3) == 'L') return true;
        if(commacut.charAt(0) == 'E' && commacut.charAt(1) == 'A' && commacut.charAt(2) == 'T')return true;
        if(commacut.charAt(0) == 'D' && commacut.charAt(1) == 'R' && commacut.charAt(2) == 'I' && commacut.charAt(3) == 'N' && commacut.charAt(4) == 'K') return true;
        if(commacut.charAt(0) == 'F' && commacut.charAt(1) == 'I' && commacut.charAt(2) == 'T') return true;

        else return false;


    }

    private boolean CheckSubSComma(String ream)
    {
        int count = 0;

        for(int c = 0; c < ream.length(); c++)
        {
            if(ream.charAt(c) == ',')count++;
        }

        if(count <= 13)
        {
            return true;
        }

        else return false;

    }

    private void ParseSubS(String eam)
    {
        //parse out category code if equal add pure data to ingredient recordstore data etc for all codes.
        //add string directly as a record to corresponding category code recordstore using add rawdataUI
        //add a clean \n to \n line to as record
        try
        {
            String original = eam;
            String commacut = CommaCut(eam);

            if(commacut.charAt(0) == 'I' && commacut.charAt(1) == 'N' && commacut.charAt(2) == 'G')
            {
                IngredientItemsRecordStoreCiF8 ingrec = new IngredientItemsRecordStoreCiF8();
                // if(ingrec.ingredientitemsrecordstorecif8.getNumRecords() < 0)
                //{
                //  Dialog.alert("Food Database already been populated are you sure you want import data? Yes no Yes no act not act FIX THIS TEST");
                //}

                ingrec.AddRawRecord(original);
                //System.out.println("Just added to Ingredient Rec " + original);
            }
            if(commacut.charAt(0) == 'M' && commacut.charAt(1) == 'E' && commacut.charAt(2) == 'A' && commacut.charAt(3) == 'L')
            {


                IngredientItemsRecordStoreCiF8 ingrec = new IngredientItemsRecordStoreCiF8();


                ingrec.AddRawRecord(original);


                //MealItemsRecordStoreCiF7 mealrec = new MealItemsRecordStoreCiF7();
                //mealrec.AddRawRecord(original);
                //System.out.println("Just added to Meals Rec " + original);

            }
            if(commacut.charAt(0) == 'E' && commacut.charAt(1) == 'A' && commacut.charAt(2) == 'T')
            {
                EatingOutRecordStoreCiF46 eatingoutrec = new EatingOutRecordStoreCiF46();
                eatingoutrec.AddRawRecord(original);
                //System.out.println("Just added to EatOut Rec " + original);
            }
            if(commacut.charAt(0) == 'D' && commacut.charAt(1) == 'R' && commacut.charAt(2) == 'I' && commacut.charAt(3) == 'N' && commacut.charAt(4) == 'K')
            {
                IngredientItemsRecordStoreCiF8 ingrec = new IngredientItemsRecordStoreCiF8();


                ingrec.AddRawRecord(original);

                //DrinkRecordStoreCiF47 drinkingrec = new DrinkRecordStoreCiF47();
                //drinkingrec.AddRawRecord(original);
                //System.out.println("Just added to Drinks Rec " + original);
            }
            if(commacut.charAt(0) == 'F' && commacut.charAt(1) == 'I' && commacut.charAt(2) == 'T')
            {
                EnergyOutItemRecordStoreCiF9 fitrec = new EnergyOutItemRecordStoreCiF9();
                fitrec.AddRawRecord(original);
                //System.out.println("Just added to Energy Rec " + original);
            }

        }
        catch(Exception c)
        {
            Dialog.alert("Exception caught: ");
        }

    }

    private String CommaCut(String ratu)
    {

        for(int p = 0; p  < ratu.length(); p++)
        {

            if(ratu.charAt(p) == ',')
            {

                String cut = ratu.substring(0,p);


                return cut;

            }


        }
        return ratu;

    }


    public void DeleteAllRecordStores()
    {
        IngredientItemsRecordStoreCiF8 cif8 = new  IngredientItemsRecordStoreCiF8();
        //MealItemsRecordStoreCiF7 cif7 = new MealItemsRecordStoreCiF7();
        EatingOutRecordStoreCiF46 cif46 = new EatingOutRecordStoreCiF46();
        //DrinkItemCiF48 cif48 = new DrinkItemCiF48();

        cif46.DeleteContents();
        cif8.DeleteContents();

        Dialog.alert("Data Deleted.");
    }


    /////////////////////////////////////////////////////////////////////

    private void Parser(String path)
    {
        ;
    }




    public void stopSoftware()
    {
        //Alog Engineering;

        //Step1. Open all RMS

        StartDayRMSCiF32 sdrms = new StartDayRMSCiF32(startdate, midlet);

        TargetDayRMSCiF33 tdrms = new TargetDayRMSCiF33(targetdate, midlet);

        StartCalorieNumberRMSCiF34 scnrms = new StartCalorieNumberRMSCiF34(startcalorienumber, midlet);

        EndOfLastSeshCountdownRMSCiF35 eolscrms = new EndOfLastSeshCountdownRMSCiF35(0, midlet);

        MaleOrFemaleRMSCiF38 mofrms = new MaleOrFemaleRMSCiF38(sex, midlet);

        CurrentWeightRMSCiF39 cwrms = new CurrentWeightRMSCiF39(startweight, midlet);

        TargetWeightRMSCiF40 twrms = new TargetWeightRMSCiF40(targetweight, midlet);

        ReminderStateRMSCiF41 rsrms = new ReminderStateRMSCiF41(reminderstate, midlet);

        NumberOfDayRMSCiF36 nodrms = new NumberOfDayRMSCiF36(numberofdays, midlet);

        HashProgressRMSCiF37 hprms = new HashProgressRMSCiF37(progress, midlet);

        BreakfastTimeRMSCiF42 bftrms = new BreakfastTimeRMSCiF42(BreakfastTime, midlet);

        LunchTimeRMSCiF43 ltrms = new LunchTimeRMSCiF43(LunchTime, midlet);

        DinnerTimeRMSCiF44 dtrms = new DinnerTimeRMSCiF44(DinnerTime, midlet);

        ExerciseTimeRMSCiF46 extrms = new ExerciseTimeRMSCiF46(ExerciseTime,midlet);

        SupperTimeRMSCiF45 suprms = new SupperTimeRMSCiF45(DinnerTime, midlet);

        ActivatedRecordStoreCiF30 deact = new ActivatedRecordStoreCiF30();






        //Step2. Delete them to zero apart from food ones.

        //sdrms.DeleteRecordStore();

        //tdrms.DeleteRecordStore();

        //scnrms.DeleteRecordStore();

        eolscrms.StoreEndOfLast();

        // mofrms.DeleteRecordStore();

        //cwrms.DeleteRecordStore();

        //twrms.DeleteRecordStore();

        //rsrms.DeleteRecordStore();

        //nodrms.DeleteRecordStore();

        //hprms.DeleteRecordStore();

        //bftrms.DeleteRecordStore();

        //ltrms.DeleteRecordStore();

        //dtrms.DeleteRecordStore();

        //extrms.DeleteRecordStore();

        //suprms.DeleteRecordStore();

        //deact.writeActivatedFalseToStore();

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
 * ALGORITHM ENGINEERING -> ANDROID / ENGLISH / i / BREAKDOWN / BLACK (on www) -> GREEN (HIGH QUALITY CFF QVM in www) -> BLUE = £ on www.ese-edet.eu -> £446.87 +
 * 1. This is an Mif that takes in the CiF HealthProfileCiF3 and outputs a HealthProfileCiF3 containing the BMI value of the client, this value is
 *    displayed in the pre comence countdown information on the screen and should also be able to be called up by a menuitem
 *    (eO blue sum of value of menuitems should ex
 * ceed £9.98, menuitems also source of the 3000 food items database, all menuitems, once menuitems loaded to www.ese-edet.eu blue ready for b*g g =  value = £9.98 * b = 1003 b*g = £9.98 * 1003
 *  b*g = £10,009.94, (all on Track please)
 *                                                              www.ese-edet.eu -> £10,009.94 (Streamline Merchant Account)
 * )
 *
 * So BMI value for the Client (that > www.ese-edet.eu) is stored in HealthProfileCiF3 which is then stored with CountdownCalendar and also stored in RMI database.
 * HealthProfile
 * CiF3 should also contain intial start countdown number.
 * 2. This mif used that data stored in HealthProfileCiF3 to calculate BMI index
 * 2b. Answer also stored in HealthProfileCiF3
 * 3. Also use this Mif to use the data in Heal to calculate Body Analysis data so that eO black increase effciency, and makes other Mif redundants.
 *
 4. In alert screen with Next Show if above or below proper BMI hence overall health recommend appr wigith but ask them to chose their target in Sets

 5.Body Analysier Mif Function. Take in data from this Form,
 Use to calculate Body Analyser
 Display Current in Alert form




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
