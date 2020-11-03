package ese.com.caloriecountdownappforandroidbrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ese.com.caloriecountdownappforandroidbrown.ui.debitactivitycif13.Debit_Activity_CIF13Fragment;

public class Debit_Activity_CIF13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debit__activity__c_i_f13_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Debit_Activity_CIF13Fragment.newInstance())
                    .commitNow();
        }
    }
}