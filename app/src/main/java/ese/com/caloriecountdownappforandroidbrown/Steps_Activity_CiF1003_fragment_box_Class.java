package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.hardware.SensorEventListener;
import android.text.NoCopySpan;
import android.widget.Toast;

public class Steps_Activity_CiF1003_fragment_box_Class extends AppCompatActivity implements SensorEventListener
{
    private SensorManager sensorManager;
    Sensor mCount_Sensor;
    boolean running = false;
    RoundingCIF13 rounder = new RoundingCIF13();
    int mStep_Count = 0;

    public Steps_Activity_CiF1003_fragment_box_Class()
    {
        android.util.Log.d("We are in Constructor", new RoundingCIF13().IntToString(mStep_Count));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        android.util.Log.d("STEPS", "Above Sensor Manager");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        android.util.Log.d("STEPS", "Below Sensor Manager");

        running = true;

        mCount_Sensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(mCount_Sensor != null)
        {
            sensorManager.registerListener(this, mCount_Sensor, SensorManager.SENSOR_DELAY_UI);
        }
        else
        {
            Toast.makeText(this,"Sensor not Found :(",Toast.LENGTH_SHORT).show();
        }
    }

    public int Output_Step_Count()
    {

        //android.util.Log.d("STEPS", "Above Sensor Manager");
        //sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
       // android.util.Log.d("STEPS", "Below Sensor Manager");
       // mStep_Count = 6847;


        return mStep_Count;
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        if(running == false)
        {
            running = true;

            mCount_Sensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

            if (mCount_Sensor != null)
            {
                sensorManager.registerListener(this, mCount_Sensor, SensorManager.SENSOR_DELAY_UI);
            }
            else
                {
                Toast.makeText(this, "Sensor not Found :(", Toast.LENGTH_SHORT).show();
                }
        }
    }


    @Override
    public void onPause()
    {
        super.onPause();

        if(running == false)
        {
            //sensorManager.unregisterListener(this);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (running) {
            mStep_Count = rounder.FloatToInt(event.values[0]);
            android.util.Log.d("Step_Count Value", new RoundingCIF13().IntToString(mStep_Count));
        } else {
            Toast.makeText(this, "Sensor not picked up :(", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor m, int accuracy) {

    }

    public int Get_Step_Count()
    {
        return mStep_Count;
    }
}
