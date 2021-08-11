package ese.com.caloriecountdownappforandroidbrown

import kotlin.math.roundToInt

//⚪️20 & ⚪️20 8 ⚪️20 8 ⚪️20 & ⚪️20 & ⚪️20 8 ⚪️20 & ACCA2 Black Logo -> Yellow Sun

data class JSON_Object_item(val apidata:String, var unit:unit?)
{
    var output:Intermediate_fragmentedObject_CiF0001? = null
    var c:ArrayList<Food_Item_CIF4>? = null

    var Vitamin_c = 0.0
    var TransFat: Double = 0.0
    var Sodium: Double = 0.0
    var Potassium: Double = 0.0
    var PolyunsturatedFat: Double = 0.0
    var MonounsaturatedFat: Double = 0.0
    var Calcuim: Double = 0.0
    var brand_name = "Healthy Byte"
    var country_code = "GB"
    var description = "Bistro Kilishi"
    var food_item_name = description + ": " + brand_name
    var id = 81611826

    var Calories = 106.5
    var Carbohydrates = 5.0
    var Cholesterol = 55.0
    var Fat = 11.0
    var Fiber = 1.0
    var Iron = 15.0
    var Protein = 22.0
    var Saturated_fat = 3.0
    var Sugar = 1.0
    var Vitamin_a = 4.0
    val public = true

    var ServingSizesUnit = "g"
    var ServingSizesValue = 100.0



    constructor(input:Intermediate_fragmentedObject_CiF0001) : this("",null)
    {
        output = input
        initializePropertiesWithOutput(input)
    }

    constructor() : this("",null)
    {

    }

    private fun initializePropertiesWithOutput(input:Intermediate_fragmentedObject_CiF0001)
    {
        c = input.alist
    }






















    /*

    {
“id":"26540388435709",
“index":1,
“nutrition_multiplier”:1,

“unit":"gram",
“value":62.4
},

{
“id":"27090144249597",
“index":2,
“nutrition_multiplier”:0.0160256,

“unit”:"gram","value":1}],
     */




  /*  “deleted”:false,

    "description":"Bistro Kilishi”,

    ”id”:81611826,

    “nutritional_contents":


    {
        “energy”:

        {
            "unit":"calories","value":106.5

        },
        “carbohydrates":10.2,
        “fat":0.87,
        “protein":65.5,
        “sodium”:0.25

    },
    “public":true,
    “serving_sizes":
    [



    {
        “id":"265967619640957","index":1,"nutrition_multiplier":1,"unit":"pack","value":1}],"type":"food","user_id":"90028456758717","verified":false,"version":"265282449657597"

    },”tags":[],"type":"food"

},

{
    "item":*/

    fun jsonwrapper(): JSON_Object
    {
        //moneyshot
        val jsonitsawrapp:JSON_Object = JSON_Object(this)


        return jsonitsawrapp
    }

    fun convertToFood_Item_CIF4():Food_Item_CIF4
    {
        var output:Food_Item_CIF4 = Food_Item_CIF4()

        output.Set_food_item_name(description + ": " + brand_name)
        output.Set_category("ING")
        output.Set_calorie_value(Calories.roundToInt())
        output.Set_calories_per_100g(Calories.toFloat())
        if(ServingSizesUnit == "g" || ServingSizesUnit == "grams" || ServingSizesUnit == "G" || ServingSizesUnit == "Grams" || ServingSizesUnit == "GRAMS"    )
        {
            output.Set_grams_per_serving_portion(ServingSizesValue.toFloat())
        }
        else
        {
            output.Set_grams_per_serving_portion(1.0F)
        }

        output.Set_fat_per_100g(Fat.toFloat())
        output.Set_saturated_fat(Saturated_fat.toFloat())
        output.Set_protein_per_100g(Protein.toFloat())
        output.Set_carbs_per_100g(Carbohydrates.toFloat())
        output.Set_sugar_per_100g(Sugar.toFloat())
        output.Set_salt_per_100g(Sodium.toFloat())
        output.Set_wellbeing_index(false)
        output.Set_fiber(Fiber.toFloat())
        output.Set_price_sterling(1F)
        output.Set_Barcode(1001)

        return output
    }

    private fun putValuesOfApidataIntoUnit(apidata: String, unit: unit):unit
    {
        //TODO()
        return unit
    }
}


/*
“energy":

{
    “unit":"calories","value":200},
    “carbohydrates":5,
    “cholesterol":55,
    “fat":11,
    “fiber":1,
    “iron":15,
    “protein":22,
    “saturated_fat":3,
    “sugar":1,
    “vitamin_a":4},
    “public":true,
    “serving_sizes":
    [

        {
            “id":"26540388435709",
            “index":1,
            “nutrition_multiplier":1,

            “unit":"gram",
            “value":62.4
        },

        {
            “id":"27090144249597",
            “index":2,
            “nutrition_multiplier":0.0160256,

            “unit":"gram","value":1}],


            “type":"food",
            “user_id":"62953108565949",
            “verified":false,
            “version":"67789242885805"},
            “tags":[],
            “type":"food"
        },
        {
             "item":

            {
                “brand_name": "Healthy Byte”,

                “country_code”:"GB",


                "description":"Bistro Kilishi”,

                ”id”:81611826,

                “nutritional_contents":


                {
                    “energy”:
*/