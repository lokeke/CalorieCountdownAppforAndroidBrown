package ese.com.caloriecountdownappforandroidbrown;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Breakfast_Receiver_Fragment extends BroadcastReceiver
{

    private Context goey;
    private Intent notificationIntent;


    @Override
    public void onReceive(Context context, Intent intent)
    {
        goey = context;
        notificationIntent = intent;

        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // Set the alarm here.

            //Shoot Builder notification.
        }
    }
}
