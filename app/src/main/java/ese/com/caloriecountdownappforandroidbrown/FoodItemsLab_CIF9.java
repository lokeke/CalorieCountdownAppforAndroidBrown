package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by ESE on 01/11/2015.
 */

//Brown : Singleton Design
public class FoodItemsLab_CIF9
{
    private ArrayList<Food_Item_CIF4> mFoodItems;

    private Food_Item_CIF4 mFoodItem;

    private ArrayList<Food_Item_CIF4> resultsListStatic;

    private ArrayList<Food_Item_CIF4> newWord;

    private static FoodItemsLab_CIF9 sFoodItemLab_CIF9;

    private Context mAppContext;

    private FoodItemsLab_CIF9(Context appContext)
    {
        mAppContext = appContext;
        mFoodItems = new ArrayList<Food_Item_CIF4>();
        resultsListStatic = new ArrayList<Food_Item_CIF4>();

        mFoodItem = null;

    }

    public static FoodItemsLab_CIF9 get(Context c)
    {
        if(sFoodItemLab_CIF9 == null)
        {
            sFoodItemLab_CIF9 = new FoodItemsLab_CIF9(c.getApplicationContext());

        }
        return sFoodItemLab_CIF9;
    }

    public ArrayList<Food_Item_CIF4> getmFoodItems()
    {
        return mFoodItems;
    }

    public void setNewWord(ArrayList<Food_Item_CIF4> IN)
    {
        newWord = IN;
    }

    public ArrayList<Food_Item_CIF4> getNewWord() {
        return newWord;
    }

    public ArrayList<Food_Item_CIF4> getResultsListStatic() {
        return resultsListStatic;
    }

    public void setmFoodItems(ArrayList<Food_Item_CIF4> fetched)
    {
        mFoodItems = fetched;
    }

    public void setResultsListStatic(ArrayList<Food_Item_CIF4> suggestions){resultsListStatic = suggestions;}

    public void setmFoodItem(Food_Item_CIF4 pass)
    {
        mFoodItem = pass;
    }

    public Food_Item_CIF4 getmFoodItem()
    {
        return mFoodItem;
    }

    public Food_Item_CIF4 getFoodItem(String food_item_name)
    {
        for(Food_Item_CIF4 f : mFoodItems)
        {
            if (f.Get_food_item_name().equals(food_item_name))
                return f;
        }
        return null;
    }


    public boolean setFoodItem(Food_Item_CIF4 put)
    {
        return mFoodItems.add(put);
    }
    public boolean removeFoodItem(Food_Item_CIF4 in) {return mFoodItems.remove(in);}
    public void appendmFoodItems(ArrayList<Food_Item_CIF4> in)
    {
        //Alogrithm Engineering
        //append takes in food item list
        //in a loop adds each item in the loop to singleton

        for(Food_Item_CIF4 f : in)
        {
            this.setFoodItem(f);         //Brown printIDO this is what I am talking about and reffering exe to www.ese-edet.eu
        }
    }


    public void reset()
    {
        mFoodItems.clear();
    }

    public void clearSummaryBox()
    {
        ;
    }
}
