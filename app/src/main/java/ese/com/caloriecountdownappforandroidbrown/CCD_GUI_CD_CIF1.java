package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class CCD_GUI_CD_CIF1 extends AppCompatActivity {


    public static CCD_GUI_CD_CIF1 instance;

    private static final String ACTION_STORE_BALANCE = "ese.com.caloriecountdownappforandroid.action.STORE_BALANCE";
    private static final String TAG = "Calorie Countdown app";

    private static final String webadress = "https://web2.0calc.com/";
    private static final String CALCULATOR_PACKAGE_NAME = "com.android.calculator2";
    private static final String CALCULATOR_CLASS_NAME = "com.android.calculator2.Calculator";

    private static int REQUEST_CODE_GET_FOOD_ITEM = 1;
    private static int REQUEST_CODE_START_DEBIT_ACTIVITY = 5;
    private static int REQUEST_CODE_START_WEIGHT_LOSS_ACTIVITY = 8;
    private static int REQUEST_CODE_LOG_IT_IN = 15;
    private static int REQUEST_CODE_NEW_DAY = 7;
    private static int REQUEST_CODE_MONTHLY_STATEMENT_ACTIVITY = 9;
    private static int REQUEST_CODE_DIET_PLAN = 16;

    private Button mCreditButton;
    private Button buttonGallery;
    private Button mDebitButton;
    private SummaryBoxCIF12 mSummation;
    private Date ResetBreakfastTime;
    private Date ResetLunchTime;
    private Date ResetDinnerTime;
    private Date ResetMidnight;

    private String SResetBreakfastTime;
    private String SResetLunchTime;
    private String SResetDinnerTime;
    private String SResetMidnight;

    private String mBalance_text;
    private int mBalance;
    private TextView mBalance_textview;



    private static Context appContext;
    public static MyCallBack mCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccd__gui__cd__cif1);

        instance = this;

       mCallback = new MyCallBack() {
            @Override
            public void refreshMainActivity() {
                CCD_GUI_CD_CIF1.this.recreate();

                //"OR"

                //finish();
                //startActivity(getIntent());
            }
        };

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher7);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Update your Food Diary", Snackbar.LENGTH_LONG)
                        .setAction("Update", null).show();
            }
        });



        appContext = getApplicationContext();



        mCreditButton = (Button) findViewById(R.id.button2);
        buttonGallery = (Button) findViewById(R.id.buttonGallery);
        mDebitButton = (Button) findViewById(R.id.button);
        mCreditButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(getApplicationContext());
                //data_model_adapter.setSex(true);


                StartFoodDiaryAidSheetCIF3();
                //CancelAlarm();

            }
        });
        mDebitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //StartDebitActivityCIF13();
            }
        });


        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CCD_GUI_CD_CIF1.this, GalleryActivity.class);
                startActivity(intent);
            }
        });

        //final TextView countdownbalance = (TextView) findViewById(R.id.textView);
        //countdownbalance.setText(RetrieveCountdownBalance());

        //boolean value = getIntent().getBooleanExtra(NewDayCountdown.START_WEIGHT_LOSS,false);
        //if(value)
        //{
            //Start_Weight_LossPlus24();
        //}

        //Start_Weight_Loss();


    }


    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_ccdgui__cif1);


        //mCreditButton = (Button) findViewById(R.id.button2);
        //mDebitButton = (Button) findViewById(R.id.button);
        //mCreditButton.setOnClickListener(new View.OnClickListener() {

            //@Override
            //public void onClick(View v) {
                //MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(getApplicationContext());
                //data_model_adapter.setSex(true);


          //      StartFoodDiaryAidSheetCIF3();
                //CancelAlarm();

        //    }
        //});
        //mDebitButton.setOnClickListener(new View.OnClickListener() {

            //@Override
            //public void onClick(View v) {
            //    StartDebitActivityCIF13();
          //  }
        //});


        //final TextView countdownbalance = (TextView) findViewById(R.id.textView);
        //countdownbalance.setText(RetrieveCountdownBalance());

        //boolean value = getIntent().getBooleanExtra(NewDayCountdown.START_WEIGHT_LOSS,false);
        //if(value)
       // {
            //Start_Weight_LossPlus24();
     //   }




   // }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ccd__gui__cd__cif1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        //noinspection SimplifiableIfStatement
        if (id == R.id.sub_submenuitem1) {

            StartWebCalculatorFragment2();

            return true;
        }

        if (id == R.id.sub_submenuitem2) {

            Start_Native_Calculator();

            return true;
        }

        if (id == R.id.action_start_weightloss)

        {
            Start_Weight_Loss_ActivityCIF4();
            return true;
        }

        if (id == R.id.action_log_it_in_reminder)

        {
            Start_Notification_ActivityCIF5();
            return true;
        }

        if (id == R.id.submenu3)

        {
            Start_Diet_Plan_Activity();
            return true;
        }





        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent data) {
        super.onActivityResult(requestcode, resultcode, data);

        try {

            if (data == null) {
                Log.d(TAG, "Sorry Mate, Intent is null Baby!");
                return;
            }
        } catch (Exception c) {
            ;
        }


        if (requestcode == REQUEST_CODE_START_WEIGHT_LOSS_ACTIVITY) {
            String vitals;
            int openingbalance;

            if (data != null) {
                openingbalance = data.getIntExtra(Start_Weight_Loss_ActivityCIF14Fragment.OPENING_BALANCE, 1);
                ResetBreakfastTime = new RoundingCIF13().StringToDate(data.getStringExtra(Start_Weight_Loss_ActivityCIF14Fragment.ResultBreakfastTime));
                ResetLunchTime = new RoundingCIF13().StringToDate(data.getStringExtra(Start_Weight_Loss_ActivityCIF14Fragment.ResultLunchTime));
                ResetDinnerTime = new RoundingCIF13().StringToDate(data.getStringExtra(Start_Weight_Loss_ActivityCIF14Fragment.ResultDinnerTime));
                ResetMidnight = new RoundingCIF13().StringToDate(data.getStringExtra(Start_Weight_Loss_ActivityCIF14Fragment.ResultMidnight));
                vitals = data.getStringExtra(Start_Weight_Loss_ActivityCIF14Fragment.VitalStats);

                Display_Dialog_CIF11 display_dialog_cif11 = new Display_Dialog_CIF11();
                display_dialog_cif11.Set_mAppContext(this);
                display_dialog_cif11.Showing(vitals);
                //CCDGUI_CIF1.CurrentCalendar cc = new CCDGUI_CIF1.CurrentCalendar();
                //Start_Weight_Loss(cc.Hour, cc.Minute, cc.Day_of_the_Month, cc.Month, cc.Year);
                Start_Weight_Loss();
                OpenAccount(openingbalance);
                //android.util.Log.d("Start_Weight_Loss", "these are your values:Hour:" + new RoundingCIF13().IntToString(cc.Hour) + " Min: " + new RoundingCIF13().IntToString(cc.Minute) + " Day of month: " + new RoundingCIF13().IntToString(cc.Day_of_the_Month) + " Month: " + new RoundingCIF13().IntToString(cc.Month) + " Year: " + new RoundingCIF13().IntToString(cc.Year));
                ResetAlarmTimer(ResetBreakfastTime, ResetLunchTime, ResetDinnerTime, ResetMidnight);
            } else {
                ResetBreakfastTime = new Date();
                ResetLunchTime = new Date();
                ResetDinnerTime = new Date();
                ResetMidnight = ProperMidnight();
                vitals = "It's empty mate";
                openingbalance = 0;
            }

        }



        if (requestcode == REQUEST_CODE_LOG_IT_IN) {
            String vitals;
            int openingbalance;

            if (data != null)
            {
                openingbalance = data.getIntExtra(Start_Weight_Loss_ActivityCIF14Fragment.OPENING_BALANCE, 1);

                //ResetBreakfastTime = new RoundingCIF13().StringToDate(data.getStringExtra(Log_It_In_CIF15Fragment.ResultBreakfastTime));
                //ResetLunchTime = new RoundingCIF13().StringToDate(data.getStringExtra(Log_It_In_CIF15Fragment.ResultLunchTime));
                //ResetDinnerTime = new RoundingCIF13().StringToDate(data.getStringExtra(Log_It_In_CIF15Fragment.ResultDinnerTime));
                //ResetMidnight = new RoundingCIF13().StringToDate(data.getStringExtra(Log_It_In_CIF15Fragment.ResultMidnight));

                SResetBreakfastTime = (data.getStringExtra(Log_It_In_CIF15Fragment.ResultBreakfastTime));
                SResetLunchTime = (data.getStringExtra(Log_It_In_CIF15Fragment.ResultLunchTime));
                SResetDinnerTime = (data.getStringExtra(Log_It_In_CIF15Fragment.ResultDinnerTime));
                SResetMidnight = (data.getStringExtra(Log_It_In_CIF15Fragment.ResultMidnight));



                android.util.Log.d("Supreme_Money_Shot RestB", SResetBreakfastTime );
                android.util.Log.d("Supreme_Money_Shot RestL", SResetLunchTime );
                android.util.Log.d("Supreme_Money_Shot RestD", SResetDinnerTime );
                android.util.Log.d("Supreme_Money_Shot RestN", SResetMidnight );

                ResetBreakfastTime = myStringToDate(SResetBreakfastTime);
                ResetLunchTime = myStringToDate(SResetLunchTime);
                ResetDinnerTime = myStringToDate(SResetDinnerTime);
                ResetMidnight = myStringToDate(SResetMidnight);

                ResetAlarmTimer(ResetBreakfastTime, ResetLunchTime, ResetDinnerTime, ResetMidnight);



            }
            else
                {

                ResetBreakfastTime = new Date();
                ResetLunchTime = new Date();
                ResetDinnerTime = new Date();
                ResetMidnight = ProperMidnight();
                vitals = "It's empty mate";
                openingbalance = 0;

                }

                //Start_Day_End();

        }
    }


        private void StartWebCalculatorFragment2 ()
        {

            Uri uri = Uri.parse(webadress);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

            //CancelAlarm();

        }


        private void Start_Native_Calculator ()
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            intent.setComponent(new android.content.ComponentName(CALCULATOR_PACKAGE_NAME, CALCULATOR_CLASS_NAME));
            try {
                this.startActivity(intent);
            } catch (android.content.ActivityNotFoundException noSuchActivity) {
                // handle exception where calculator intent filter is not registered
            }
        }

        private void Start_Weight_Loss_ActivityCIF4 ()
        {
            Intent i = new Intent(CCD_GUI_CD_CIF1.this, ese.com.caloriecountdownappforandroidbrown.Start_Weight_Loss_ActivityCIF14.class);
            this.startActivityForResult(i, REQUEST_CODE_START_WEIGHT_LOSS_ACTIVITY);

        }


        public void Start_Weight_Loss ()
        {
            //Alogrithm Engineering ~> Android (Black ~> Builder) : This is Lego Box for where 5pm Magic Occurs :

            MIF1NewDayEndSetAlarm dayEndSetAlarm = new MIF1NewDayEndSetAlarm();
            dayEndSetAlarm.NewDayEndSetAlarm(new Date(), this);

        }

        public void Start_Day_End()
        {
            //android.util.Log.d("Day END inside Bridge","Day end cfwd Started");

            //mBalance = 76702;
            //mBalance_text = "76,702";

            //mBalance_textview = (TextView)findViewById(R.id.textView);
            //mBalance_textview.setText(mBalance_text);


            //New_Day_1();
        }

        public void Start_Notification_ActivityCIF5()
        {
            //Alogrithm Engineering ~> Android ( Black ~> Builder -> (re)Load... -> www.ese-edet.eu ) : This is Lego Box for where ___ Occurs :

            Intent i = new Intent(CCD_GUI_CD_CIF1.this, Log_It_In_CIF15.class);
            this.startActivityForResult(i, REQUEST_CODE_LOG_IT_IN);

        }

    public void Start_Day_End_ActivityCIF5a()
    {
        //Alogrithm Engineering ~> Android ( Black ~> Builder -> (re)Load... -> www.ese-edet.eu ) : This is Lego Box for where ___ Occurs :

       //Intent i = new Intent(CCD_GUI_CD_CIF1.this, Day_END_CIF15a.class);
        // this.startActivityForResult(i, REQUEST_CODE_NEW_DAY);

    }

        public void Start_Diet_Plan_Activity()
        {
            //Alogrithm Engineering ~> Android ( Black ~> Builder -> (re)Load... -> www.ese-edet.eu ) : This is Lego Box for where ___ Occurs :

            Intent i = new Intent(CCD_GUI_CD_CIF1.this, Diet_Plan_Activity_fragment008Fragment.class);
            this.startActivityForResult(i, REQUEST_CODE_DIET_PLAN);

        }

        private void OpenAccount ( int OpeningBalance)
        {
            //android.util.Log.d("Countdown","Consider Countdown Updated Token") ;
            final TextView countdownbalance = (TextView) findViewById(R.id.textView);
            String CountdownFigure = countdownbalance.getText().toString();
            CountdownFigure = new RoundingCIF13().IntToString(OpeningBalance);
            countdownbalance.setText(CountdownFigure);
            StoreCountdownBalance(CountdownFigure);

        }

    private boolean ResetAlarm(Date b, Date l, Date d, Date m, Date e, Date mm)
    {

        try
        {
            SpecialThreadCIF15 speetread = new SpecialThreadCIF15(getApplicationContext());

            speetread.Set_RBreakfastTime(b);
            speetread.Set_RLunchTime(l);
            speetread.Set_RDinnerTime(d);
            speetread.Set_RMidnightTime(m);

            ObjectWithAllTheTimesCIF10 objectWithAllTheTimesCIF10 = speetread.ActivateAlarm();
            //ResetAlarmTimer(objectWithAllTheTimesCIF10);

            speetread.start();
            return true;
        }

        catch(Exception c)
        {
            //Make exception more specifit
            //Catch the right name of exception that is thrown if thread already running e.g.
            //if already set in Start Weight Loss Menuitem. and tell user by displaying on screen
            //using appropiate display functions that alarm already set and running
            return false;
        }

    }

    private void ResetAlarmTimer(Date resetBreakfastTime, Date resetLunchTime, Date resetDinnerTime, Date resetMidnight)
    {

        resetBreakfastTime = add24(resetBreakfastTime); //?
        resetLunchTime = add24(resetLunchTime);
        resetDinnerTime = add24(resetDinnerTime);
        resetMidnight = add24(resetMidnight);

        if(ResetAlarm(resetBreakfastTime, resetLunchTime, resetDinnerTime, resetMidnight, resetLunchTime, resetDinnerTime))
        {
            ;
        }

        this.ResetAlarm( plus24hour(resetBreakfastTime),plus24hour(resetLunchTime),plus24hour(resetDinnerTime),plus24hour(resetMidnight),plus24hour(resetLunchTime), plus24hour(resetDinnerTime));

    }

    public Date ProperMidnight()
    {
        int hour = 5;
        int minute = 0;

        Calendar Greg = Calendar.getInstance();
        Greg.set(Calendar.HOUR, hour);
        Greg.set(Calendar.MINUTE, minute);
        Greg.set(Calendar.AM_PM,Calendar.PM);
        return Greg.getTime();
    }

    public void StoreCountdownBalance(String Balance)
    {
        MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(getApplicationContext());
        data_model_adapter.StoreBalance(Balance);
    }

    private Date add24(Date time)
    {
        //long OneMinute = (1000 * 60 * 60 * 24);
        //time.setTime(time.getTime() + (OneMinute * 3000));
        return time;

    }

    private Date plus24hour(Date time)
    {
        long OneMinute = (1000 * 60 * 60 * 24);
        time.setTime(time.getTime() + (OneMinute * 3000));
        return time;
    }


    private void StartFoodDiaryAidSheetCIF3() {

        Intent i = new Intent(CCD_GUI_CD_CIF1.this, Food_Diary_Sheet_CIF3.class);
        this.startActivityForResult(i, REQUEST_CODE_GET_FOOD_ITEM);
        //CancelAlarm();

    }

    private Date myStringToDate(String editText)
    {
        String hour = editText.substring(0,2);
        String minute = editText.substring(2,4);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, new RoundingCIF13().StringToInt(hour));
        calendar.set(Calendar.MINUTE,new RoundingCIF13().StringToInt(minute));

        Date result = new Date(calendar.getTimeInMillis());

        return result;
    }

    @Override
    public void recreate()
    {
        android.util.Log.d("Main", "We have been recreated, now delete this");
        //Simply get new Balance and display.

        mBalance = 76702;
        mBalance_text = "76,702";

        mBalance_textview = (TextView)findViewById(R.id.textView);
        mBalance_textview.setText(mBalance_text);
    }


    public static Context getAppContext() {
        return appContext;
    }


    public interface MyCallBack
    {
        public void refreshMainActivity();
    }


    private void NewDay()
    {
        MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(this);
        String currentBalance = data_model_adapter.RetrieveBalance();
        mBalance = new RoundingCIF13().StringToInt(currentBalance);
        if(data_model_adapter.getSex() == "MALE")
        {
            mBalance = mBalance - 2570;
        }
        if(data_model_adapter.getSex() == "FEMALE")
        {
            mBalance = mBalance - 2050;
        }
        else
        {
            mBalance = mBalance - 2350;
        }
        data_model_adapter.StoreBalance(new RoundingCIF13().IntToString(mBalance));
        data_model_adapter.StoreDayEndBalance((mBalance - 350 + 2570));
    }

    private void New_Day_1()
    {
        NewDay();
    }


}
