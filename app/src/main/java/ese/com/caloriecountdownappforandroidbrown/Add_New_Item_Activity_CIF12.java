package ese.com.caloriecountdownappforandroidbrown;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Add_New_Item_Activity_CIF12 extends FragmentActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__new__item__activity__cif12);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment);

        if(fragment == null)
        {
            fragment = new Add_New_Item_Activity_CIF2Fragment();
            fm.beginTransaction().add(R.id.fragment,fragment).commit();
        }

    }

}

