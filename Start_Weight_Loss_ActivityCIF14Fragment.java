package ese.com.caloriecountdownappforandroidbrown;

import android.content.Intent;
import androidx.core.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;


/**
 * A placeholder fragment containing a simple view.
 */
public class Start_Weight_Loss_ActivityCIF14Fragment extends Fragment {

    public static final String OPENING_BALANCE = "Opening Countdown Figure / Value / Balance";
    public static final String ResultBreakfastTime = "Breakfast time";
    public static final String ResultLunchTime = "Lunch time";
    public static final String ResultDinnerTime = "Dinner time";
    public static final String ResultMidnight = "Midnight time";
    public static final String VitalStats = "Vital Statistics;";


    private Button mOpenAccount;
    private HealthProfileCiF3 mAccount;
    private Display_Dialog_CIF11 display_dialog_cif11;


    public Start_Weight_Loss_ActivityCIF14Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start__weight__loss__activity_cif14, container, false);

        display_dialog_cif11 = new Display_Dialog_CIF11();
        mAccount = new HealthProfileCiF3();

        mOpenAccount = (Button) v.findViewById(R.id.button14);
        mOpenAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                android.util.Log.d("Debugging","We are about to shoot intent0");
                OpenAccount(mAccount);

                if(CheckBreakfastLunchDinnerTimesIn(mAccount))
                {
                    android.util.Log.d("Debugging","We are about to shoot intent6");
                    BackToParentWithOpeningBalance(mAccount);
                    android.util.Log.d("Debugging", "We are about to shoot intent7");
                }
                else
                {
                    BreakfastLunchDinnerTimesNotIn();
                }

            }
        });

        return v;
    }



    private void OpenAccount(HealthProfileCiF3 IN)
    {
        //IDO ~> Alogrithm Engineering ~> Android : Display VitalStats :
        DisplayVitalStats(GetOpeningBalance(GetVitalStatsString(FillInMIFs(ExtractView(IN)))));
    }


    private HealthProfileCiF3 ExtractView(HealthProfileCiF3 IN)
    {
        EditText editText65 = (EditText) getActivity().findViewById(R.id.edit_text65);
        EditText editText66 = (EditText) getActivity().findViewById(R.id.edit_text66);
        DatePicker editText76 = (DatePicker) getActivity().findViewById(R.id.date_picker_76);
        EditText editText67 = (EditText) getActivity().findViewById(R.id.edit_text67);
        EditText editText69 = (EditText) getActivity().findViewById(R.id.edit_text69);
        EditText editText70 = (EditText) getActivity().findViewById(R.id.edit_text70);
        EditText editText71 = (EditText) getActivity().findViewById(R.id.edit_text71);
        EditText editText72 = (EditText) getActivity().findViewById(R.id.edit_text72);
        EditText editText73 = (EditText) getActivity().findViewById(R.id.edit_text73);
        EditText editText74 = (EditText) getActivity().findViewById(R.id.edit_text74);
        EditText editText75 = (EditText) getActivity().findViewById(R.id.edit_text75);

        Spinner spinner1 = (Spinner) getActivity().findViewById(R.id.spincity1);
        Spinner spinner2 = (Spinner) getActivity().findViewById(R.id.spincity2);
        Spinner spinner3 = (Spinner) getActivity().findViewById(R.id.spincity3);
        Spinner spinner4 = (Spinner) getActivity().findViewById(R.id.spincity4);


        IN.setFirstname(editText65.getText().toString());
        IN.setLastname(editText66.getText().toString());
        IN.setDOB(editText76.getDayOfMonth(), editText76.getMonth(), editText76.getYear());
        IN.setEmailaddress(editText67.getText().toString());
        IN.setClientGender(editText69.getText().toString());
        IN.setClientBodyFrame(spinner1.getSelectedItem().toString());
        IN.setWeightUnits(spinner2.getSelectedItem().toString());
        IN.setCurrentWeight(editText70.getText().toString());
        IN.setTargetWeight(editText71.getText().toString());
        IN.setQuickStart(spinner3.getSelectedItem().toString());
        //IN.setHieghtUnits(spinner4.getSelectedItem().toString());
        IN.setHieghtUnits("CM");
        IN.setClientHeight(editText72.getText().toString());
        IN.setBreakfastTime(editText73.getText().toString());
        IN.setLunchTime(editText74.getText().toString());
        IN.setFinalMealTime(editText75.getText().toString());

        return IN;


    }

    private HealthProfileCiF3 FillInMIFs(HealthProfileCiF3 IN)
    {
        Mif3BMIFunction bmiFunction = new Mif3BMIFunction();
        android.util.Log.d("BMI is", new RoundingCIF13().DoubleToString(bmiFunction.BMIfunction(IN).getClientBMI()));
        Mif3BMR bmr = new Mif3BMR();
        Mif3ClientBodyFat clientBodyFat = new Mif3ClientBodyFat();
        Mif3HealtVitalStats healtVitalStats = new Mif3HealtVitalStats();
        Mif3StartNumber startNumber = new Mif3StartNumber();
        Mif3StartDate startDate = new Mif3StartDate();
        Mif3TargetEndDate targetEndDate = new Mif3TargetEndDate();
        Mif3StartWeight startWeight = new Mif3StartWeight();
        Mif3DisplayContents displayContents = new Mif3DisplayContents();

        return healtVitalStats.HealtVitalStats(bmr.BMR(bmiFunction.BMIfunction(clientBodyFat.ClientBodyFat(startDate.StartDate(targetEndDate.TargetEndDate(startWeight.StartWeight(startNumber.StartNumber(IN))))))));
    }






    private HealthProfileCiF3 GetVitalStatsString(HealthProfileCiF3 IN)
    {
        return IN;
    }

    private HealthProfileCiF3 GetOpeningBalance(HealthProfileCiF3 IN)
    {
        //return IN.getStartCountdown();
        return IN;

    }

    private void DisplayVitalStats(HealthProfileCiF3 IN)
    {
        //CiF11 display text
        //Display_Dialog_CIF11 display_dialog_cif11 = new Display_Dialog_CIF11();
        //display_dialog_cif11.Set_mAppContext(this.getActivity());
        //display_dialog_cif11.Showing(GetVitalStatsString(IN).getVitalStatsString());

    }

    private void BackToParentWithOpeningBalance(HealthProfileCiF3 IN)
    {
        MIF4_Data_Model_Adapter data_model_adapter = new MIF4_Data_Model_Adapter(getActivity());
        data_model_adapter.StoreStartWeightLoss(IN);
        ObjectWithAllTheTimesCIF10 objectWithAllTimes = StartNotificationCycle(mAccount);
        //= goey.ResetAlarm(specialThreadCIF15); //Send and intent back to start reset Alarm
        //Readme : ActivateAlarm does it's thing and returns CIF10 packed data for next thread alarms
        //these are packed into an intent and shot off for The Bridge CIF1 to receive
        //unpack the data and reset a new special tread similar to this still for next Alarm, capish?

        Intent i2 = new Intent();
        android.util.Log.d("Debugging", "We are about to shoot intent1");
        i2.putExtra(OPENING_BALANCE, IN.getStartCountdown());
        i2.putExtra(ResultBreakfastTime, new RoundingCIF13().DateToStringStandard(objectWithAllTimes.getResetBreakfastTime()));
        i2.putExtra(ResultLunchTime, new RoundingCIF13().DateToStringStandard(objectWithAllTimes.getResetLunchTime()));
        i2.putExtra(ResultDinnerTime, new RoundingCIF13().DateToStringStandard(objectWithAllTimes.getResetDinnerTime()));
        i2.putExtra(ResultMidnight, new RoundingCIF13().DateToStringStandard(objectWithAllTimes.getResetDayEnd()));
        i2.putExtra(VitalStats, IN.getVitalStatsString());
        android.util.Log.d("Debugging", "We are about to shoot intent2");

        getActivity().setResult(getActivity().RESULT_OK, i2);
        android.util.Log.d("Debugging", "We are about to shoot intent3");
        getActivity().finish();
        android.util.Log.d("Debugging","We are about to shoot intent4");

    }

    private ObjectWithAllTheTimesCIF10 StartNotificationCycle(HealthProfileCiF3 IN)
    {
        //Step One : We have Breakfast, Lunch and Dinner time in IN,
        //Step Two : Use these values to intialize and activate SpecialThread CIF
        SpecialThreadCIF15 specialThreadCIF15 = new SpecialThreadCIF15(getActivity().getParent());

        //Step Three : Then call activate alarm by itself no parameters and that's it's Build Pipeline straw till Reload Good Luck.

        return specialThreadCIF15.ActivateAlarm();
    }

    private boolean CheckBreakfastLunchDinnerTimesIn(HealthProfileCiF3 in)
    {
        return true;

        /*String breakfast = in.getBreakfastTime();
        String lunch = in.getLunchTime();
        String dinner = in.getFinalMealTime();

        if(checkTimeFormat(breakfast))
        {
            if(checkTimeFormat(lunch))
            {
                if(checkTimeFormat(dinner))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }*/

    }

    private void BreakfastLunchDinnerTimesNotIn()
    {
        ;
    }

    private boolean checkTimeFormat(String in)
    {


        if(in.length() != 5)
        {
            return false;
        }

        if(     in.substring(0,1) == "0" ||
                in.substring(0,1) == "1" ||
                in.substring(0,1) == "2" ||
                in.substring(0,1) == "3" ||
                in.substring(0,1) == "4" ||
                in.substring(0,1) == "5" ||
                in.substring(0,1) == "6" ||
                in.substring(0,1) == "7" ||
                in.substring(0,1) == "8" ||
                in.substring(0,1) == "9"
                )
        {
            if (in.substring(1,2) == "0" || in.substring(1,2) == "1" ||
                in.substring(1,2) == "2" ||
                in.substring(1,2) == "3" ||
                in.substring(1,2) == "4" ||
                in.substring(1,2) == "5" ||
                in.substring(1,2) == "6" ||
                in.substring(1,2) == "7" ||
                in.substring(1,2) == "8" ||
                in.substring(1,2) == "9"
                    )
            {
                if(in.substring(2,3) == ":")
                {
                    if(in.substring(3,4) == "0" ||
                            in.substring(3,4) == "1" ||
                            in.substring(3,4) == "2" ||
                            in.substring(3,4) == "3" ||
                            in.substring(3,4) == "4" ||
                            in.substring(3,4) == "5" ||
                            in.substring(3,4) == "6" ||
                            in.substring(3,4) == "7" ||
                            in.substring(3,4) == "8" ||
                            in.substring(3,4) == "9"
                            )
                    {
                        if(in.substring(4,5) == "0" ||
                                in.substring(4,5) == "1" ||
                                in.substring(4,5) == "2" ||
                                in.substring(4,5) == "3" ||
                                in.substring(4,5) == "4" ||
                                in.substring(4,5) == "5" ||
                                in.substring(4,5) == "6" ||
                                in.substring(4, 5) == "7" ||
                                in.substring(4,5) == "8" ||
                                in.substring(4,5) == "9"
                                )
                        {
                            return true;
                        }
                        else
                        {
                           return false;
                        }

                    }
                    else
                    {
                        return false;
                    }




                }
                else
                {
                    return false;
                }

            }
            else
            {
                return false;
            }




        }
        else
        {
            return false;
        }



    }



}
