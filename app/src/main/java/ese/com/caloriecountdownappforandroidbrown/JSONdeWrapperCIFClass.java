package ese.com.caloriecountdownappforandroidbrown;

public class JSONdeWrapperCIFClass extends Transaction_CIF22 implements JSONdeWrapperCIFInterface
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
        return new JSONWrapperCIFClass(new Transactions_CIF22());
    }

    @Override
    public String WrapTransactions_CIF22(Transaction_CIF22 INPUT)
    {
        return new String("deWrapper's empty");
    }

    @Override
    public Transaction_CIF22 UnWrapTransactions_CIF22(String INPUT)
    {
        Transaction_CIF22 OUTPUT = new Transaction_CIF22();
        return OUTPUT;
    }

    public Transaction_CIF22 UnWrapTransactions_CIF22(String INPUT, Transaction_CIF22 In)
    {
        return In;
    }

    public Transaction_CIF22 UnWrapTransaction_CIF22(Transaction_CIF22 INPUT)
    {
        return INPUT;
    }
}
