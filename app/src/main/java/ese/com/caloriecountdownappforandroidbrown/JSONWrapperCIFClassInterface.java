package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

public interface JSONWrapperCIFClassInterface extends JSONWrapperCIFInterface {
    void Set_My_Transaction_CIF22(Transactions_CIF22 IN);

    Transactions_CIF22 getMy_Transaction_CIF22();

    void Set_My_JSONText(String IN);

    String Get_My_JSONText();

    String WrapTransactions_CIF22(Transaction_CIF22 INPUT);

    ArrayList<Transaction_CIF52> getLines();

    Transactions_CIF22 UnWrapTransactions_CIF22();

    @Override
    String Code_JSONText();

    @Override
    Transactions_CIF22 DeCode_JSONText(String json_input);

    @Override
    void Set_JSONText(String json_input);

    @Override
    String Get_JSONText();

    @Override
    String Nutritional_Object_to_JSONText(Nutritional_Content_CiFragmented_Object001 INPUT);


}
