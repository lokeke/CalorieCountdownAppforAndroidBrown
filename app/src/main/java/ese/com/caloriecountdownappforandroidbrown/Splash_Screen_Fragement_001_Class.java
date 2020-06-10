package ese.com.caloriecountdownappforandroidbrown;

import android.app.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash_Screen_Fragement_001_Class extends Activity implements Splash_Screen_Fragment_001 {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    public Splash_Screen_Fragement_001_Class()
    {
        super();
    }


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash_Screen_Fragement_001_Class.this,CCD_GUI_CD_CIF1.class);
                Splash_Screen_Fragement_001_Class.this.startActivity(mainIntent);
                Splash_Screen_Fragement_001_Class.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    public int Display_Splash_Screen()
    {
        return 0;
    }
}




