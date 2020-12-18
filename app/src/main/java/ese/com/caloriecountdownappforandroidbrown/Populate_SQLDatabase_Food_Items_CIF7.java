package ese.com.caloriecountdownappforandroidbrown;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by lokeke on 07/10/2015.
 */
public class Populate_SQLDatabase_Food_Items_CIF7
{



    //or Constructor or OnCreate

    //Use a JSON File to load inshousecsv.txt from file to food_items table and back from food items table to inhouse?

    String filepath;
    String Data;
    Context mContext;
    Display_Dialog_CIF11 display;

    public Populate_SQLDatabase_Food_Items_CIF7(String filename, String d, Context m)
    {
        filepath = filename;
        mContext = m;
        display = new Display_Dialog_CIF11();
        display.Set_mAppContext(mContext);
        Data = d;
    }


    public boolean Populate()
    {
        //Inflate and Populate SQL Food Item Database from File (name/inhousecsv.txt) translating //then->
        return ImportXLSData2RMS(filepath);
        //Delete table first in database if Populate called


    }


    public boolean PopulateSampleData()
    {
        return true;
    }


    public boolean ImportXLSData2RMS(String filepath)
    {
        display.Showing("Please be patient, this could take several minutes, once thousands of items are imported you won't have to do this operation again");
        // DeleteAllRecordStores();
        if(this.Checker(filepath))
        {
            this.Parser(filepath);
            display.Showing("Data items Imported");
            return true;
        }
        else
        {
            // System.out.println("Sorry Checking Data File returned false, nothing is going to happen, bye bye.");
            display.Showing("Please Confirm Data Import");
            return false;
        }

    }

    private boolean Checker(String csvfilepath)
    {
        //System.out.println("Inside checker");
        String inhousecsv = "";
        inhousecsv = GetInHouseCSV(csvfilepath);


        //System.out.println(inhousecsv);

        if(inhousecsv == null)
        {
            //System.out.println("Get in house null");
            display.Showing("Upload of data file did not work");
            return false;
        }

        else
        {
            //System.out.println("get in house good");
            //for(int x = 0; x < inhousecsv.length(); x++)
            //    { System.out.println(inhousecsv.charAt(x));
            //    }
            if(true)//(inhousecsv.startsWith("\n") && inhousecsv.endsWith("\n")))
            {
                //System.out.println("in house starts with \n");
                while (inhousecsv.length() > 0)
                {
                    String cut = this.CutFirstNextSubstring(inhousecsv);
                    inhousecsv = TrunkTrunk(inhousecsv, cut);

                    //System.out.println("this is string cut: "+ cut );
                    if(cut == "\n"){System.out.println("True cut True cut True cut");}
                    //  System.out.println(inhousecsv);




                    if(cut.length() < 3) ;


                    else
                    {
                        //System.out.println("checking sub code");

                        if (this.CheckSubSCode(cut))
                        {
                            // System.out.println("checking sub comma");
                            if (this.CheckSubSComma(cut))
                            {
                                //System.out.println("checking parse sub");
                                this.ParseSubS(cut);
                                //return true;
                            }
                            else
                            {
                                //System.out.println("checking new integer comma");
                                Integer inter = new Integer(1);
                                String row = inter.toString();
                                display.Showing("Continue importing.. ");// +
                                //row); //test with errors
                                return false;
                            }

                        }
                        else
                        {
                            //System.out.println("checking new integer category error");
                            Integer inter = new Integer(1);
                            String row = inter.toString();
                            display.Showing("Formatting error with Category code, check Row: " +
                                    row); //test with errors
                            return false;

                        }
                    }
                }
            }
            //1. check that file begins and ends with newline if not display message with this error require formating
            //2. check there is more than newline between the first and the last
            // 3a. check that there are characters between the first newline and the next one and so on and
            // 3b. if there are check that there are between 0 -13 commas no more

            //4. check that after each \n is a character code matching one of the five codes if no characters between newline ignore and move on the function
            //5. if still good turn into a parser and cut substrings between \n and next \n keep note of positon for cutting
            //6. find out what the code is and add it to correct recordstore using addpuredata function. You're done.
            //7. function extract substring \n\n in loop pass to feild function, do the checks, pass to parser for pure add in same loop
            //8. When raw raw extracted from record and turned into string substring in according to delimeter , into fields that match
            //   xls header hence cif - item attribute you're get/setting it in.
            //9. to reverse construnt string with category code append comma then attribute contents in right order, pure add to right
            //   record store or use add item or modified additem preffer pure add tho. and you're done. Use get name to display results

        }

        if(inhousecsv.length() == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    private String GetInHouseCSV(String filepath)
    {
        //java.io.InputStream is = getClass().getResourceAsStream(filepath);
        String ret = Data;
        //try {

            //InputStream is = mContext.openFileInput(filepath);
            //File file = new File(filepath);
            //java.io.FileInputStream is = new FileInputStream(file.getAbsoluteFile().toString());

            //if (is == null)
            //{
            //    java.io.InputStreamReader isReader = new InputStreamReader(is);

                //java.io.FileReader filereader = new FileReader(new File("Volume1.txt"));
           //     java.io.BufferedReader bufferedReader = new BufferedReader(isReader);
           //     String receiveString = "";
           //     StringBuilder stringBuilder = new StringBuilder();

           //      while ((receiveString = bufferedReader.readLine()) != null)
            //      {
            //          stringBuilder.append(receiveString);
            //      }

            //     is.close();
            // ret = stringBuilder.toString();




                //StringBuffer csvdata = new StringBuffer();


                //int chars = 0;
                //int i = 0;

                //while ((chars = is.read()) != -1) {
                //    csvdata.append((char) chars);
                //}

                //return csvdata.toString();
           // }
           // return ret;
       // }
       // catch(FileNotFoundException a)
       // {
       //     display.Showing("File Was Not Found." + a.toString());
        //    return null;
        //}
        //catch(IOException b)
        //{
       //     display.Showing("File Access Error." + b.toString());
       //     return null;
        //}
        //catch(Exception c)
        //{
        //    display.Showing("General Error. " + c.toString());
        //    return null;
        //}

    return ret;

    }

    private void Parser(String path)
    {
        ;
    }

    private String CutFirstNextSubstring(String stream)
    {


        for(int p = 0; p  < stream.length(); p++)
        {

            if(stream.charAt(p) == '\n')
            {

                String cut = stream.substring(0,(p+1));

                return cut;

            }


        }
        return new String("");
    }

    private String TrunkTrunk(String ramoramo, String gone)
    {
        int len = gone.length();
        int ramolen = ramoramo.length();

        ramoramo = ramoramo.substring(len, ramolen);
        return ramoramo;

    }

    private boolean CheckSubSCode(String tream)
    {

        //if category code is not there goes auotmatically to ingredient recordstore i.e. manually reformat after error msg to ING category code.

        String commacut = CommaCut(tream);



        if(commacut.charAt(0) == 'I' && commacut.charAt(1) == 'N' && commacut.charAt(2) == 'G')return true;
        if(commacut.charAt(0) == 'M' && commacut.charAt(1) == 'E' && commacut.charAt(2) == 'A' && commacut.charAt(3) == 'L') return true;
        if(commacut.charAt(0) == 'E' && commacut.charAt(1) == 'A' && commacut.charAt(2) == 'T')return true;
        if(commacut.charAt(0) == 'D' && commacut.charAt(1) == 'R' && commacut.charAt(2) == 'I' && commacut.charAt(3) == 'N' && commacut.charAt(4) == 'K') return true;
        if(commacut.charAt(0) == 'F' && commacut.charAt(1) == 'I' && commacut.charAt(2) == 'T') return true;

        else return false;


    }

    private boolean CheckSubSComma(String ream)
    {
        int count = 0;

        for(int c = 0; c < ream.length(); c++)
        {
            if(ream.charAt(c) == ',')count++;
        }

        if(count <= 13)
        {
            return true;
        }

        else return false;

    }

    private void ParseSubS(String eam)
    {
        //parse out category code if equal add pure data to ingredient recordstore data etc for all codes.
        //add string directly as a record to corresponding category code recordstore using add rawdataUI
        //add a clean \n to \n line to as record
        try
        {
            String original = eam;
            String commacut = CommaCut(eam);

            if(commacut.charAt(0) == 'I' && commacut.charAt(1) == 'N' && commacut.charAt(2) == 'G')
            {
                MIF4_Data_Model_Adapter ingrec = new MIF4_Data_Model_Adapter(mContext);
                // if(ingrec.ingredientitemsrecordstorecif8.getNumRecords() < 0)
                //{
                //  Dialog.alert("Food Database already been populated are you sure you want import data? Yes no Yes no act not act FIX THIS TEST");
                //}

                ingrec.AddRawRecord(original);
                //System.out.println("Just added to Ingredient Rec " + original);
            }
            if(commacut.charAt(0) == 'M' && commacut.charAt(1) == 'E' && commacut.charAt(2) == 'A' && commacut.charAt(3) == 'L')
            {


                MIF4_Data_Model_Adapter ingrec = new MIF4_Data_Model_Adapter(mContext);


                ingrec.AddRawRecord(original);


                //MealItemsRecordStoreCiF7 mealrec = new MealItemsRecordStoreCiF7();
                //mealrec.AddRawRecord(original);
                //System.out.println("Just added to Meals Rec " + original);

            }
            if(commacut.charAt(0) == 'E' && commacut.charAt(1) == 'A' && commacut.charAt(2) == 'T')
            {
                MIF4_Data_Model_Adapter eatingoutrec = new MIF4_Data_Model_Adapter(mContext);
                eatingoutrec.AddRawRecord(original);
                //System.out.println("Just added to EatOut Rec " + original);
            }
            if(commacut.charAt(0) == 'D' && commacut.charAt(1) == 'R' && commacut.charAt(2) == 'I' && commacut.charAt(3) == 'N' && commacut.charAt(4) == 'K')
            {
                MIF4_Data_Model_Adapter ingrec = new MIF4_Data_Model_Adapter(mContext);


                ingrec.AddRawRecord(original);

                //DrinkRecordStoreCiF47 drinkingrec = new DrinkRecordStoreCiF47();
                //drinkingrec.AddRawRecord(original);
                //System.out.println("Just added to Drinks Rec " + original);
            }
            if(commacut.charAt(0) == 'F' && commacut.charAt(1) == 'I' && commacut.charAt(2) == 'T')
            {
                MIF4_Data_Model_Adapter fitrec = new MIF4_Data_Model_Adapter(mContext);
                fitrec.AddRawRecord(original);
                //System.out.println("Just added to Energy Rec " + original);
            }

        }
        catch(Exception c)
        {
            display.Showing("Exception caught: ");
        }

    }

    private String CommaCut(String ratu)
    {

        for(int p = 0; p  < ratu.length(); p++)
        {

            if(ratu.charAt(p) == ',')
            {

                String cut = ratu.substring(0,p);


                return cut;

            }


        }
        return ratu;

    }


    public void Delete_Database()
    {
        SQLDatabase_Food_Items_CIF6 jackie = new SQLDatabase_Food_Items_CIF6(mContext);
        jackie.Delete_Food_items_Table();
    }


}
