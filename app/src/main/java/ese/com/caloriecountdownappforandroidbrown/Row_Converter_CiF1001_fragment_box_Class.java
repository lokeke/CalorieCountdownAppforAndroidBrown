package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

public class Row_Converter_CiF1001_fragment_box_Class
{

    private JSONWrapperCIFClass My_mTableA;
    private Transactions_CIF22 My_Transaction_CiF022;
    private ArrayList<Transaction_CIF52> My_rows;



    public Row_Converter_CiF1001_fragment_box_Class(JSONWrapperCIFClass INPUT)
    {
        My_mTableA = INPUT;
    }

    public void addTableA(JSONWrapperCIFClass INPUT)
    {
        My_mTableA = null;
        My_mTableA = INPUT;
    }

    public ArrayList<Transaction_CIF52> iterate()
    {
        deWrapp_My_mTable();

        for (Transaction_CIF52 l : My_Transaction_CiF022.Get_TransactionLines())
        {
            for (Transaction_CIF52 m : My_Transaction_CiF022.Get_TransactionLines()) {

                //apply my function to the generic Transaction_CIF52 Line as INPUT
                MiF4_function_to_peform_on_Transaction_CIF52_Line mif = new MiF4_function_to_peform_on_Transaction_CIF52_Line(m);
                m = mif.function_to_peform_on_Transaction_CIF52_Line(m,m.getType());

                My_rows.add(m);

            }
        }

        return My_rows;


    }

    public Converted_Row_Data_Object_Class transform(JSONWrapperCIFClass INPUT)
    {
        //take the Line/Row in INPUT and transform in a Data_Object returned
        INPUT.UnWrapTransactions_CIF22();
        My_Transaction_CiF022= INPUT.getMy_Transaction_CIF22();

        return new Converted_Row_Data_Object_Class(iterate());
    }

    private void deWrapp_My_mTable()
    {
        My_Transaction_CiF022 = null;
        My_rows = null;

        My_Transaction_CiF022 = My_mTableA.getMy_Transaction_CIF22();
        //My_rows = My_Transaction_CiF022.get_My_Line();
        My_rows = new ArrayList<Transaction_CIF52>();


    }
}
