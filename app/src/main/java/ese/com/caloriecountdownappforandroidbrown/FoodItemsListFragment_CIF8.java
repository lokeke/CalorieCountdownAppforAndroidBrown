package ese.com.caloriecountdownappforandroidbrown;


import android.support.v4.app.DialogFragment;
import android.support.v4.app.ListFragment;
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
        //Alogrithm Engineering : Correct food item looking for clicked, if user already gave calories, just add, should not be in
        //this stage, if gave name and weight update balance and summary box straight up don't ask, if user only gave name then you need
        //to ask like blackberry regular, collect weight of item and update with summary box

        Display_Dialog_CIF11 dFrag = new Display_Dialog_CIF11();
        dFrag.Set_myfooditem(mFoodItems.get(position));
        dFrag.show(getActivity().getSupportFragmentManager(), "FoodItems");


    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }



}

