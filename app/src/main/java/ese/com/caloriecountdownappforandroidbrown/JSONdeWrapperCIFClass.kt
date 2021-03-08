package ese.com.caloriecountdownappforandroidbrown

class JSONdeWrapperCIFClass : Transaction_CIF22(), JSONdeWrapperCIFInterface
{
    var wrapper: JSONWrapperCIFClass? = null
        private set
    var deWrapped: Transaction_CIF22? = null
        private set

    fun Set_Wrapper(IN: JSONWrapperCIFClass?)
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        wrapper = IN
    }

    fun Set_deWrapp(IN: Transaction_CIF22?)
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        deWrapped = IN
    }

    fun deWrappingParser(DOCUMENT_IN: JSONWrapperCIFClass?): Transaction_CIF22
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        return Transaction_CIF22()
    }

    fun Wrapp(IN: Transaction_CIF22?): JSONWrapperCIFClass
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        return JSONWrapperCIFClass(Transactions_CIF22())
    }

    override fun WrapTransactions_CIF22(INPUT: Transaction_CIF22?): String?
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        var output = "deWrapper's empty"
        return output
    }



    override fun UnWrapTransactions_CIF22(INPUT: String?): Transaction_CIF22?
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        return Transaction_CIF22()
    }

    fun UnWrapTransactions_CIF22(INPUT: String?, In: Transaction_CIF22): Transaction_CIF22
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        return In
    }

    fun UnWrapTransaction_CIF22(INPUT: Transaction_CIF22): Transaction_CIF22
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        return INPUT
    }

    fun parseWebPage(): ArrayList<JSONdeWrapperCIFClass>
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE

        TODO("Returns an ArrayList<String?> Containing JSON Objects, used to intialize JSONWrapper, ultimately to add new items and Client/User Searches again move on towards 0.0")
    }

    fun convertJSONWrapperToCIF22(INPUT: JSONdeWrapperCIFClass): Transaction_CIF22
    {
        TODO()
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE
    }

    fun convertJSONWrapperArrayToCIF22Array(INPUT: ArrayList<JSONdeWrapperCIFClass>): ArrayList<Transaction_CIF22>
    {
        TODO()
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE
    }

    fun addNewFoodItems(INPUT: Transaction_CIF22)
    {
        //Algorithm Engineering -> Kotlin Documentation
        //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
        //Description :
        //STEP ONE
    }

    fun addNewFoodItemsArray(INPUT: ArrayList<Transaction_CIF22>)
    {
            //Algorithm Engineering -> Kotlin Documentation
            //Introduction : Takes in a Transaction_CIF22 Object and adds in to SQLite like 'Add New Food Item' Module.
            //Description :
            //STEP ONE
    }
}