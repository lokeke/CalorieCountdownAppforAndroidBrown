package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 16/09/2016.
 */
public class Breakfast_Transaction_Line_CIF17 extends Transaction_CIF52
{
    private int Breakfast_ID;
    private int Breakfast_Date;
    private String Breakfast_Meal_Type;
    private int Breakfast_Meal_Type_ID;
    private int Breakfast_Amount;
    private int Breakfast_Balance;
    private int Meal_Box_ID;
    private String Meal_Box_Food_Type;
    private BoxCIF17 food_item_list;

    private String Description;
    //private Breakfast_Transaction_CIF22 food_item_list;
    private int Calorie_IN;
    private int Calorie_OUT;
    private int Countdown_BALANCE; //Balance Brought FORWARD.

    public Breakfast_Transaction_Line_CIF17()
    {

    }

    public Breakfast_Transaction_Line_CIF17(String mealname)
    {
        super(mealname);
    }


    public int Get_Breakfast_ID()
    {
        return Breakfast_ID;
    }

    public void Set_Breakfast_ID(int in)
    {
        Breakfast_ID = in;
    }

    public int Get_Meal_Box_ID()
    {
        return Meal_Box_ID;
    }

    public void Set_Meal_Box_ID(int in)
    {
        in = Meal_Box_ID;
    }


    public int Get_Breakfast_Date()
    {
        return Breakfast_Date;
    }

    public void Set_Breakfast_Date(int in)
    {
        Breakfast_Date = in;
    }

    public String Get_Breakfast_Meal_Type()
    {
        return Breakfast_Meal_Type;
    }

    public void Set_Breakfast_Meal_Type(String in)
    {
        Breakfast_Meal_Type = in;
    }

    public int Get_Breakfast_Meal_Type_ID()
    {
        return Breakfast_Meal_Type_ID;
    }

    public void Set_Breakfast_Meal_Type_ID(int in)
    {
        Breakfast_Meal_Type_ID = in;
    }

    public int Get_Breakfast_Amount()
    {
        return Breakfast_Amount;
    }

    public void Set_Breakfast_Amount(int in)
    {
        Breakfast_Amount = in;
    }


    public int Get_Breakfast_Balance()
    {
        return Breakfast_Balance;
    }

    public void Set_Breakfast_Balance(int in)
    {
        Breakfast_Balance = in;
    }

    public String Get_Meal_Box_Food_Type()
    {
        return Meal_Box_Food_Type;
    }

    public void Set_Meal_Box_Food_Type(String in)
    {
        in = Meal_Box_Food_Type;
    }

    public BoxCIF17 Get_Food_Items(){ return food_item_list;};

    public void Set_Food_Items(BoxCIF17 in){ food_item_list = in;}

    public void Get_Date(int IN)
    {

    }

    public String Get_String()
    {
        return Description;
    }

    public void Set_Description(String in)
    {
        Description = in;
    }

    public int Get_Calorie_IN()
    {
        return Calorie_IN;
    }

    public void Set_Calorie_IN(int in)
    {
         Calorie_IN = in;
    }

    public int Get_Calorie_OUT()
    {
        return Calorie_OUT;
    }

    public void Set_(int in)
    {
         Calorie_OUT= in;
    }

    public int Get_Countdown_BALANCE()
    {
        return Countdown_BALANCE;
    }

    public void Set_Countdown_BALANCE(int in)
    {
         Countdown_BALANCE= in;
    }





}
