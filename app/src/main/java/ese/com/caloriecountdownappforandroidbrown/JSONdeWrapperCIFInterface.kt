package ese.com.caloriecountdownappforandroidbrown

interface JSONdeWrapperCIFInterface
{
    //Brown Office: "Wrap Transaction_CiF022 into JSONWrapp JSON Specification ready for Circulation internally and externally to the system
    fun WrapTransactions_CIF22(INPUT: Transaction_CIF22?): String?
    //Brown Office: "unWrap JSONWrapper into Transaction_CiF022
    fun UnWrapTransactions_CIF22(INPUT: String?): Transaction_CIF22?
}