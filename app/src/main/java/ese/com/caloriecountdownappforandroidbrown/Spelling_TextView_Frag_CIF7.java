package ese.com.caloriecountdownappforandroidbrown;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;

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

