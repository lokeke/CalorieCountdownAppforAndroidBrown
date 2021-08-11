package ese.com.caloriecountdownappforandroidbrown

import android.os.Parcel
import android.os.Parcelable

//import kotlin.

class Nutritional_Content_CiFragmented_Object001(val fromWebPage: NutritionalContentsFromWebPage)
    : Parcelable {

    var transactionsCif22:SubClassTransactionsCIF22? = null

    var brand_name = "Healthy Byte"
    var country_code = "GB"
    var description = "Bistro Kilishi"
    var id = 81611826
    var food_item_name = "food item name"
    var category = "ING"

    var energy:EnergyObject = EnergyObject(100)
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

    var servingSize = ServingSizes("myFitnessPal JSON")

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




    init
    {
        transactionsCif22 = fromWebPage.transactionCif22
    }

    constructor(parcel: Parcel) : this(NutritionalContentsFromWebPage(Intermediate_fragmentedObject_CiF0001(ArrayList<JSON_Object_item>()))) {
        Carbohydrates = parcel.readDouble()
        Fat = parcel.readDouble()
        Protein = parcel.readDouble()
        soduimorsalt = parcel.readDouble()
        public = parcel.readByte() != 0.toByte()
    }

    constructor():this(NutritionalContentsFromWebPage(Intermediate_fragmentedObject_CiF0001(ArrayList<JSON_Object_item>())))
    {

    }

    public class EnergyObject(content:Int)
    {

        val unit:String = "Calories"

        private var _contents = content
        var contents
            get() = _contents
            set(value) {
                _contents = value
            }


        private var _value = 0.0
        var value:Double
            get() = _value
            set(value) {
                _value = value
            }


    }

    public class ServingSizes(val input:String)
    {
        var unit = "grams"
        var nutritionMultiplier = 1
        var type = "Food"
        var userid = (0..35).shuffled().last()
        var verified = false
        var version = "2.0"

    }


    fun convertToJSONText():String = "JSON Text"


    fun get_Food_items():ArrayList<Food_Item_CIF4>
    {
        val foodItemCif4:Food_Item_CIF4 = Food_Item_CIF4("Big Mac")
        var output:ArrayList<Food_Item_CIF4> = ArrayList<Food_Item_CIF4>()
        output.add(foodItemCif4)

        return output
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(Carbohydrates)
        parcel.writeDouble(Fat)
        parcel.writeDouble(Protein)
        parcel.writeDouble(soduimorsalt)
        parcel.writeByte(if (public) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Nutritional_Content_CiFragmented_Object001> {
        override fun createFromParcel(parcel: Parcel): Nutritional_Content_CiFragmented_Object001 {
            return Nutritional_Content_CiFragmented_Object001(parcel)
        }

        override fun newArray(size: Int): Array<Nutritional_Content_CiFragmented_Object001?> {
            return arrayOfNulls(size)
        }
    }

    fun get_Food_item_or_items_Kotlin_1_5_0():Food_Item_CIF4
    {
        return Food_Item_CIF4()
    }
}












































//private val JSONObject: `val`? = null: Any? = null
//private val theJSONObject: `val`? = null: JSONObject? = null
//private var JSONText //Parse function takes IN JSON Text transforms into in intermediary JSONOBject then
//        : `var`? = null
//: String? = null

//helper function takes JSON Object and Parses into a Transaction_CIF022_fragment_Object according to data structure and
//reserializes back into text
//to go in .NET SQL Server Database or SQLite internally or third party, seamless, all can't tell the difference apple
//www ESE /visa.sys

//fun Set_My_JSONText(): `fun`? {
//    JSONText = IN
//}

//fun Get_My_JSONText(): `fun`??: String? {
//    return JSONText
//}


/*
category = "ING"
        food_item_name = fromWebPage.description + ": " + fromWebPage.brand
        grams_per_serving_portion = 30.0

        energy= EnergyObject(100)
        Fat = 0.0
        sat = 0.0
        Protein = 0.0
        Carbohydrates = 0.0
        Sugar = 0.0
        soduimorsalt = 0.0
        wellbeing_index = false;
        Fiber = 0.0;
        price_sterling = 1;

        var brand_name = "Healthy Byte"
        var country_code = "GB"
        var description = "Bistro Kilishi"
        var id = 81611826
        var food_item_name = "food item name"
        var category = "ING"

        var energy:EnergyObject = EnergyObject(100)
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

        var servingSize = ServingSizes("myFitnessPal JSON")

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

 */