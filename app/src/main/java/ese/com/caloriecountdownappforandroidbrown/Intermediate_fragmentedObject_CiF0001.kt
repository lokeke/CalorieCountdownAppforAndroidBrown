package ese.com.caloriecountdownappforandroidbrown

//This fragament contains the intermediary json, data structure
// to connect NutritionalContentsFromWeb -> enum unit that cannot be intialised as enum see Builder+
data class Intermediate_fragmentedObject_CiF0001(val jsonObject: ArrayList<JSON_Object_item>)
{
 val alist:ArrayList<Food_Item_CIF4> = convertToFoodItemsArray(jsonObject)


         fun convertToFoodItemsArray(input:ArrayList<JSON_Object_item>):ArrayList<Food_Item_CIF4>
         {

             var alist:ArrayList<Food_Item_CIF4> = ArrayList()

             input.forEach { m -> convertANDadd(m,alist) }

             return alist
         }

    private fun convertANDadd(inputa:JSON_Object_item, inputb:ArrayList<Food_Item_CIF4>)
    {
        inputb.add(convertJSON_Object_item(inputa))
    }

    private fun convertJSON_Object_item(input:JSON_Object_item):Food_Item_CIF4
    {
        var output:Food_Item_CIF4 = input.convertToFood_Item_CIF4()

        return output
    }
}
