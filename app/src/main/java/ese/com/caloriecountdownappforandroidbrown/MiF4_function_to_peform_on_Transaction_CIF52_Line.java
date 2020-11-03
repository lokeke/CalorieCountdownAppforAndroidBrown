package ese.com.caloriecountdownappforandroidbrown;

public class MiF4_function_to_peform_on_Transaction_CIF52_Line
{
    Transaction_CIF52 My_Transaction_CIF52_line;

    MiF4_function_to_peform_on_Transaction_CIF52_Line(Transaction_CIF52 INPUT)
    {
        My_Transaction_CIF52_line = INPUT;
    }

    Transaction_CIF52 function_to_peform_on_Transaction_CIF52_Line (Transaction_CIF52 INPUT, Row_Type_fragment type)
    {
        if(type == Row_Type_fragment.First_Row_Type)
        {
            INPUT.setInhousecsvLinetext(INPUT.dePopulateContents_As_First_Line_and_return());
        }

        if(type == Row_Type_fragment.Last_Row_Type)
        {
            INPUT.setInhousecsvLinetext(INPUT.dePopulateContents_As_Last_Line_and_return());
        }

        if(type == Row_Type_fragment.Neither)
        {
            INPUT.setInhousecsvLinetext(INPUT.dePopulateContents_As_Neither_and_return());
        }

        return INPUT;
    }

}
