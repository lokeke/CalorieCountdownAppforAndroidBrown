package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

public class Converted_Row_Data_Object_Class
{
    //Black Office
    //Algorithm Engineering Documenation
    //This Fragment contains the part of the text (a Line) for the final string to be depopulated and deserialized into a clone inhousetxt.csv file to
    //mirror the original inhousecsv.txt document but only this time with additional lines/ rows that represents new items, Food or Exercise, that
    //the user added whilst using the app.

    //new class to list, aggregate bring together this fragment to form the final file.
    //create new Object in Blackboard
    //it should have an arraylist of this particular fragment. and that it it represents your depopulated SQLite database to (new) inhousecsv.txt
    //JUnit test and confirm etc then (re)Load -> (WWW.ESE-EDET.EU*)

    public enum Type
    {
        First_Row_Type, Last_Row_Type, Neither
    }

    private ArrayList<Transaction_CIF52> mConverted_Rows;
    private String inhousecsvfile_Line_fragment;

    public Converted_Row_Data_Object_Class(ArrayList<Transaction_CIF52> INPUT)
    {
        mConverted_Rows = INPUT;
        inhousecsvfile_Line_fragment = "";

        for(Transaction_CIF52 m : INPUT)
        {
            inhousecsvfile_Line_fragment = getInhousecsvfile_Line_fragment() + m.get_inhousescvtext() + "\n";
        }
    }

    public String getInhousecsvfile_Line_fragment() {
        return inhousecsvfile_Line_fragment;
    }

    public void setInhousecsvfile_Line_fragment(String INPUT)
    {
        inhousecsvfile_Line_fragment = INPUT;
    }
}
