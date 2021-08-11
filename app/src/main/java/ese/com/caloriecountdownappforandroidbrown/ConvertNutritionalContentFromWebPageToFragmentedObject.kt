package ese.com.caloriecountdownappforandroidbrown

class ConvertNutritionalContentFromWebPageToFragmentedObject(var from:NutritionalContentsFromWebPage)
{
    var to:Nutritional_Content_CiFragmented_Object001
        get() { return to}
        set(value) {to = value}

    fun conversion():Nutritional_Content_CiFragmented_Object001
    {
        return to
    }
}