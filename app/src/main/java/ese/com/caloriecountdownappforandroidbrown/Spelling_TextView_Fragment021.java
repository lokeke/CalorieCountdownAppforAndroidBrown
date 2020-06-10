package ese.com.caloriecountdownappforandroidbrown;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Spelling_TextView_Fragment021 extends ListFragment
{


    Food_Diary_Sheet_CIF3 food_diary_sheet_cif3; //For SpellChecker Results
    String results;
    String word;
    ArrayList<Food_Item_CIF4> resultList;
    ArrayList<Food_Item_CIF4> newWord = new ArrayList<Food_Item_CIF4>();




    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.food_item_text);

        resultList = FoodItemsLab_CIF9.get(getActivity()).getResultsListStatic();


        ArrayAdapter<Food_Item_CIF4> adapter = new ArrayAdapter<Food_Item_CIF4>(getActivity(),android.R.layout.simple_list_item_1,resultList);

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        //Alogrithm Engineering : Correct food item looking for clicked, if user already gave calories, just add, should not be in
        //this stage, if gave name and weight update balance and summary box straight up don't ask, if user only gave name then you need
        //to ask like blackberry regular, collect weight of item and update with summary box

        //Display_Dialog_CIF11 dFrag = new Display_Dialog_CIF11();
        //dFrag.Set_myfooditem(resultList.get(position));
        //dFrag.show(getActivity().getSupportFragmentManager(), "SpeltItems");

        resultList.get(position).Set_Index(position);
        Food_Item_CIF4 name = resultList.get(position);
        newWord.add(position, name);

        FoodItemsLab_CIF9.get(getActivity()).setNewWord(newWord);


    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }






    public ArrayList<String> Delimit_Name_into_Words(String food_item_name)
    {
        //Algorithm Engineering -> android -> (re)Load -> www.ese-edet.eu

        //Step Three : Declare ArrayList<String>

        ArrayList<String> Delimited = new ArrayList<String>();

        //Step One : Declare StringTokenizer
        //Step Two : Delimeter with a " " space.
        //Step Four : Add Delimetered String Words to Array but if length = 1 char discard ignore.

        StringTokenizer st = new StringTokenizer(food_item_name," ", false);
        while (st.hasMoreTokens())
        {
            word = st.nextToken();

            if(word.length() > 2)
            {
                Delimited.add(word);
            }
        }

        //Step Five : Return ArrayList.
        return Delimited;
    }



    public String applySpellCheck(String INPUT)
    {
        //food_diary_sheet_cif3 = new Food_Diary_Sheet_CIF3();
        //results = food_diary_sheet_cif3.SpellChecker2(INPUT);
        //return results;

        return INPUT;
    }



    public ArrayList<Food_Item_CIF4> Split_Results(String INPUT)
    {

        resultList = new ArrayList<Food_Item_CIF4>();
        Food_Item_CIF4 placeholder;
        StringTokenizer st = new StringTokenizer(INPUT,"\n", false);
        while (st.hasMoreTokens())
        {
            word = st.nextToken();

            if(word.length() > 2)
            {
                placeholder = new Food_Item_CIF4();
                placeholder.Set_food_item_name(word);
                resultList.add(placeholder);
            }
        }

        return resultList;
    }


    public void Set_ResultList(ArrayList<Food_Item_CIF4> IN)
    {
        resultList = IN;
    }


    public ArrayList<Food_Item_CIF4> Get_ResultList()
    {
        return resultList;
    }
}
