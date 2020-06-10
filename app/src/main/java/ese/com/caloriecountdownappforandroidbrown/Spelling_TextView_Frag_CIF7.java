package ese.com.caloriecountdownappforandroidbrown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class Spelling_TextView_Frag_CIF7 extends FragmentActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_item_list_cif7);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer2);

        if(fragment == null)
        {
            fragment = new Spelling_TextView_Fragment021();

            fm.beginTransaction().add(R.id.fragmentContainer2,fragment).commit();
        }

    }

}

