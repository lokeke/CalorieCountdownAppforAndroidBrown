package ese.com.caloriecountdownappforandroidbrown;

public class JSONdeWrapperCIFClass extends Transaction_CIF22
{

    private JSONWrapperCIFClass Wrapper;
    private Transaction_CIF22 deWrapped;


    public void Set_Wrapper(JSONWrapperCIFClass IN)
    {
        Wrapper = IN;
    }

    public void Set_deWrapp(Transaction_CIF22 IN)
    {
        deWrapped = IN;
    }

    public JSONWrapperCIFClass getWrapper() {
        return Wrapper;
    }

    public Transaction_CIF22 getDeWrapped() {
        return deWrapped;
    }


    public Transaction_CIF22 deWrappingParser(JSONWrapperCIFClass DOCUMENT_IN)
    {
        return new Transaction_CIF22();
    }

    public JSONWrapperCIFClass Wrapp(Transaction_CIF22 IN)
    {
        return new JSONWrapperCIFClass();
    }
}
