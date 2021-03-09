package ese.com.caloriecountdownappforandroidbrown;

import android.app.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.Manifest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


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

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if (!checkAccessCameraPermission() || !checkAccessExternalStoragePermission()) {
                    requestPermission();

                } else {
                    /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(Splash_Screen_Fragement_001_Class.this,CCD_GUI_CD_CIF1.class);
                    Splash_Screen_Fragement_001_Class.this.startActivity(mainIntent);
                    Splash_Screen_Fragement_001_Class.this.finish();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    private boolean checkAccessCameraPermission() {

        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private boolean checkAccessExternalStoragePermission() {

        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;

    }

    public int Display_Splash_Screen()
    {
        return 0;
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }

    int PERMISSION_REQUEST_CODE = 101;

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 101:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(Splash_Screen_Fragement_001_Class.this,CCD_GUI_CD_CIF1.class);
                    Splash_Screen_Fragement_001_Class.this.startActivity(mainIntent);
                    Splash_Screen_Fragement_001_Class.this.finish();
                } else {
                    finish();
                }
                break;
        }
    }




}




