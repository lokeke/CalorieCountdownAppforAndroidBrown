package ese.com.caloriecountdownappforandroidbrown

class SubClassTransactionsCIF22(fillMe: Nutritional_Content_CiFragmented_Object001) : Transactions_CIF22(Nutritional_Content_CiFragmented_Object001())
{
    var brand_name = "Healthy Byte"
    var country_code = "GB"
    var description = "Bistro Kilishi"
    var id = 81611826
    var food_item_name = description + ": " + brand_name
    var category = "ING"

    var energy: Nutritional_Content_CiFragmented_Object001.EnergyObject = Nutritional_Content_CiFragmented_Object001.EnergyObject(100)
    var Calories = 0.0
    var Carbohydrates = 0.0
    var Cholesterol = 0.0
    var Fat = 0.0
    var Saturated_fat = 0.0
    var TransFat: Double = 0.0

    var sat:Double = 0.0
        get() {
            return 0.0
        }
        set(value) {
            field = value
        }

    var Fiber = 0.0
    var Protein = 0.0
    var Sugar = 0.0
    var soduimorsalt = 0.0
    var Sodium: Double = 0.0
    var Calcuim: Double = 0.0
    var Potassium: Double = 0.0
    var PolyunsturatedFat: Double = 0.0
    var MonounsaturatedFat: Double = 0.0
    var Vitamin_a = 0.0
    var Vitamin_c = 0.0
    var Iron = 0.0

    var public = true
    var grams_per_serving_portion = 30.0
    var ServingSizesUnit = "g"
    var ServingSizesValue = 100.0

    var servingSize = Nutritional_Content_CiFragmented_Object001.ServingSizes("myFitnessPal JSON")

    var isConversionDoneQuestionMark: Boolean = false
        get() {
            val field1 = field
            return field1
        }
        set(value){
            field = value
        }

    var wellbeing_index = false
    var price_sterling = 1
    val barcode = 10011

    constructor():this(Nutritional_Content_CiFragmented_Object001(NutritionalContentsFromWebPage(Intermediate_fragmentedObject_CiF0001(ArrayList<JSON_Object_item>()))))
    {

    }





}