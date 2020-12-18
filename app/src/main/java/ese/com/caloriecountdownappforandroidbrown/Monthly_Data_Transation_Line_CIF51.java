package ese.com.caloriecountdownappforandroidbrown;

import java.util.ArrayList;

/**
 * Created by lokeke on 08/03/2017.
 * //BlackBoard Builder/Member DOCUMENTATION

 //// massage MonthlyDataTransactionLine CIF containing Compartmentalized Monthly Data into a TransactionLine of
 // One Monthly Statement String to be added together to form whole Monthly Statment/ Food Diary/Journal
 // using this MIF:

 // When retrieving monthly statement data an array of the CIF datastructure containing thadis returned representing
 // each row line of the statement to poe tog
 // stuff the data from SQL into the CIF and send

 // The Final monthly statement String to be displayed by Countdown Report Object Fragment fairly independent with few entry points like methods.
 //
 // get contents of Breakfast Transacton in the CIF Data carrying get and set Data Object, MIF massage into line of Statement Report, print the Title in Calorie Countdown Monthly Statement/ Food Diary or Food Journa next line Month and start and finsih day dates, summary of the month or selected datepicker timetable then lay out monthly stataement in line by line in format and done.
 // (like Accounting Statement nor? Calorie Accounting, accounting for your Calories App on Google Play)

 // Make sure functions and data model retreive extremely correct stuff from App database Data layer.

 // MVC / Patterns example of =  fragment IDO Design UML Brownprint cube objects* can be used.

 // Builder implements Brown fast not adding anything just exe fast Brown and test thoroughly through all kinds of motions to improve performance memory efficiency leam more for less resoures BEFAM etc*
 // then shakes for preformanace lean more efficenty BEFAM etc Builder/Value then (Re)Load -> ese-edet.eu STOP.
 //
 //                                                    exe < ESE S.C.I LTD >
 //
 //                                                      The Donald 3/1/18* Every single year.
 //                                                        fast
 //
 //                                                          exe [green] not black.

 //& red

 //Breakfast transaction has got a line date of breakfast and the number of food items per that breakfast session each food item having
 // a line to themselives




 //Goal to Make Monthly Statement, what data do we need, days Meals Table and Matching Food Item List Table, this is what CIF51 //
 //to contain
 //each row in th Breakfast/Lunch/Dinner Transaction Table will have a unique ID to identify Cell/Row/Column/Field etc
 // in the Sister Food Item List Table will always just be a list of Food items, but there is a column for identifier
 // each food item that contans the same identifier is a row from Meal Transaction Table belongs to that transaction
 // in CIF Contains List of transaction object, use inheritance to create Breakfast/Lunch/Dinner Transacion Objects
 // attributes in each Object matchs fields/tables in Trasaction databases and have get and set functions for each
 // also have an array list of food items CIF populated using Unique ID from the Database.
 // i
 *
 */

public class Monthly_Data_Transation_Line_CIF51
{




    private ArrayList<Transactions_CIF22> mTransactions;
    //private BoxCIF17 mFoodItemList;

    public void Set_Transaction(ArrayList<Transactions_CIF22> IN)
    {
        mTransactions = IN;
    }

    public ArrayList<Transactions_CIF22> Get_Transaction()
    {
        return mTransactions;
    }

    public boolean Add_Transaction(Transactions_CIF22 IN)
    {
        return mTransactions.add(IN);
    }

    public boolean Delete_Transaction(Transactions_CIF22 IN)
    {
        return mTransactions.remove(IN);
    }

    public Transactions_CIF22 Get_Transaction(int index)
    {
        return mTransactions.get(index);
    }

    public void ClearAllTransactions()
    {
        mTransactions.clear();
    }

    public boolean Is_This_Transaction_There(Transactions_CIF22 IN)
    {
        return mTransactions.contains(IN);
    }





    //public void Set_FoodItemList(BoxCIF17 IN)
    //{
    //    mFoodItemList = IN;
    //}

    // public BoxCIF17 Get_FoodItemList()
    // {
    //    return mFoodItemList;
    //}

    public void Sort_Transactions_Acsending()
    {


            // (ESE PIPELINE ESE S.C.I LTD)
            //Algorithm Engineering -> ANDROID -> (Re)Load -> www.ese-edet.eu
            //Get_Date
        //Label this for www.ese-edet.eu



        for(int c = 0; c < mTransactions.size(); c++)
        {
            java.util.Date compare = mTransactions.get(c).Get_TransactionLines().get(c).Get_Date() ;
            Transactions_CIF22 compareObject = mTransactions.get(c);


            for(int x = 0; x < mTransactions.size(); x++)
            {
                x = c;
                java.util.Date comparedLv2 = mTransactions.get(x).Get_TransactionLines().get(c).Get_Date();
                Transactions_CIF22 comparedObjectLv2 = mTransactions.get(x);
                Transactions_CIF22 escrow;

                if (compare.getTime() >  comparedLv2.getTime())
                {
                    escrow = compareObject;
                    mTransactions.add(c,comparedObjectLv2);
                    mTransactions.add(x,escrow);
                    break;
                }

                if(compare.getTime() ==  comparedLv2.getTime())
                {

                }

                if(compare.getTime() <  comparedLv2.getTime())
                {

                }
            }
        }


    }

    public void Sort_Transactions_Descending()
    {
        // (ESE PIPELINE ESE S.C.I LTD)
        //Algorithm Engineering -> ANDROID -> (Re)Load -> www.ese-edet.eu
        //Get_Date
        //Label this for www.ese-edet.eu



        for(int c = 0; c < mTransactions.size(); c++)
        {
            java.util.Date compare = mTransactions.get(c).Get_TransactionLines().get(c).Get_Date() ;
            Transactions_CIF22 compareObject = mTransactions.get(c);


            for(int x = 0; x < mTransactions.size(); x++)
            {
                x = c;
                java.util.Date comparedLv2 = mTransactions.get(x).Get_TransactionLines().get(c).Get_Date();
                Transactions_CIF22 comparedObjectLv2 = mTransactions.get(x);
                Transactions_CIF22 escrow;

                if (compare.getTime() <  comparedLv2.getTime())
                {
                    escrow = compareObject;
                    mTransactions.add(c,comparedObjectLv2);
                    mTransactions.add(x,escrow);
                    break;
                }

                if(compare.getTime() ==  comparedLv2.getTime())
                {

                }

                if(compare.getTime() >  comparedLv2.getTime())

                {

                }
            }
        }

    }



}
