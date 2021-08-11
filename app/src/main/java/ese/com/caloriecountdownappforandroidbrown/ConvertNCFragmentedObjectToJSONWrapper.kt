package ese.com.caloriecountdownappforandroidbrown

import android.os.Parcel
import android.os.Parcelable

class ConvertNCFragmentedObjectToJSONWrapper(var from:Nutritional_Content_CiFragmented_Object001)
{//: Parcelable {

    var to:JSONWrapperCIFClass = JSONWrapperCIFClass(Transactions_CIF22())
        get() {
            return field
        }
        set(value) {to = value}

    fun convert():JSONWrapperCIFClass
    {
        return to
    }

    /*constructor(parcel: Parcel) : this(TODO("from"))
    {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ConvertNCFragmentedObjectToJSONWrapper> {
        override fun createFromParcel(parcel: Parcel): ConvertNCFragmentedObjectToJSONWrapper {
            return ConvertNCFragmentedObjectToJSONWrapper(parcel)
        }

        override fun newArray(size: Int): Array<ConvertNCFragmentedObjectToJSONWrapper?> {
            return arrayOfNulls(size)
        }
    }*/
}