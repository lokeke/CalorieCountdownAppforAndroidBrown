package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 16/09/2016.
 */
public class Lunch_Box_CIF17 extends BoxCIF17
{
    public Lunch_Box_CIF17()
    {
        super();
    }

    public Lunch_Box_CIF17(String mealname)
    {
        super(mealname);
    }


    private int Lunch_ID;
    private int Lunch_Date;
    private String Lunch_Meal_Type;
    private int Lunch_Meal_Type_ID;
    private int Lunch_Amount;
    private int Lunch_Balance;
    private int Meal_Box_ID;
    private String Meal_Box_Food_Type;




    public int Get_Lunch_ID()
    {
        return Lunch_ID;
    }

    public void Set_Lunch_ID(int in)
    {
        Lunch_ID = in;
    }

    public long Get_Meal_Box_ID()
    {
        return Meal_Box_ID;
    }

    public void Set_Meal_Box_ID(int in)
    {
        in = Meal_Box_ID;
    }


    public int Get_Lunch_Date()
    {
        return Lunch_Date;
    }

    public void Set_Lunch_Date(int in)
    {
        Lunch_Date = in;
    }

    public String Get_Lunch_Meal_Type()
    {
        return Lunch_Meal_Type;
    }

    public void Set_Lunch_Meal_Type(String in)
    {
        Lunch_Meal_Type = in;
    }

    public int Get_Lunch_Meal_Type_ID() { return Lunch_Meal_Type_ID;}

    public void Set_Lunch_Meal_Type_ID(int in)
    {
        Lunch_Meal_Type_ID = in;
    }

    public int Get_Lunch_Amount()
    {
        return Lunch_Amount;
    }

    public void Set_Lunch_Amount(int in)
    {
        Lunch_Amount = in;
    }

    public int Get_Lunch_Balance()
    {
        return Lunch_Balance;
    }

    public void Set_Lunch_Balance(int in)
    {
        Lunch_Balance = in;
    }

    public String Get_Meal_Box_Food_Type()
    {
        return Meal_Box_Food_Type;
    }

    public void Set_Meal_Box_Food_Type(String in)
    {
        in = Meal_Box_Food_Type;
    }



}

