package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

public class Merge_List_fragment_object extends ArrayList<Food_Item_CIF4>
{
    private ArrayList<Food_Item_CIF4> mMerger;

    public Merge_List_fragment_object()
    {
        mMerger = new ArrayList<Food_Item_CIF4>();
    }


    public void merge(ArrayList<Food_Item_CIF4> INPUT)
    {
        //Algorithm Engineering
        //This Object takes in and ArrayList and adds it's content to an the already existing
        //contents of mMerge.

        for(Food_Item_CIF4 f : INPUT)
        {
            mMerger.add(f);
        }


    }
}
