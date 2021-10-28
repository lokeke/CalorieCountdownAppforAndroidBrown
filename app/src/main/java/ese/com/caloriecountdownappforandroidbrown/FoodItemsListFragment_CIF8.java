package ese.com.caloriecountdownappforandroidbrown;


import android.content.Intent;

import androidx.fragment.app.ListFragment;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by ESE on 14/10/2015.
 */
public class FoodItemsListFragment_CIF8 extends ListFragment
{
    private static final int REQUEST_CODE_JSON_WRAP = 18;

    //private FoodItemsCursor m_food_items_cursor;
    private ArrayList<Food_Item_CIF4> mFoodItems;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.food_item_text);
        mFoodItems = FoodItemsLab_CIF9.get(getActivity()).getmFoodItems();

        ArrayAdapter<Food_Item_CIF4> adapter = new ArrayAdapter<Food_Item_CIF4>(getActivity(),android.R.layout.simple_list_item_1,mFoodItems);

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {


        if(mFoodItems.get(position).Get_food_item_name().endsWith("not found"))
        {
            Start_JSON_Wrapping(mFoodItems.get(position).Get_food_item_name());
        }
        else
            {

            //Algrithm Engineering -> Kotlin : Correct food item looking for clicked, if user already gave calories, just add, should not be in
            //this stage, if gave name and weight update balance and summary box straight up don't ask, if user only gave name then you need
            //to ask like blackberry regular, collect weight of item and update with summary box

            Display_Dialog_CIF11 dFrag = new Display_Dialog_CIF11();
            dFrag.Set_myfooditem(mFoodItems.get(position));
            dFrag.show(getActivity().getSupportFragmentManager(), "FoodItems");

            }


    }

    public void Start_JSON_Wrapping(String INPUT)
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Starts the process of JSONWrapper, by taking the name of the Food item not found, which we ultimately
        //wish to add to SQL_CiF6 and in a dialog back toast message ask the User & Client to Repeat app "CREDIT" should now find it there
        //Remember complete depopulate with Unit.27
        //Description :
        //STEP ONE

        android.content.Intent intent = new Intent(this.getContext(), JSONWrappingActivity.class );
        intent.putExtra("not found",INPUT);
        CCD_GUI_CD_CIF1.itemToFind = INPUT;
        this.startActivityForResult(intent, REQUEST_CODE_JSON_WRAP);
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }



}

