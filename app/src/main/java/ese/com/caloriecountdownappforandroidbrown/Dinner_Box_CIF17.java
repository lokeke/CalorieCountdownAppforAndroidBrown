package ese.com.caloriecountdownappforandroidbrown;

/**
 * Created by lokeke on 16/09/2016.
 */
public class Dinner_Box_CIF17 extends BoxCIF17
{
    public Dinner_Box_CIF17()
    {
        super();
    }

    private int Dinner_ID;
    private int Dinner_Date;
    private String Dinner_Meal_Type;
    private int Dinner_Meal_Type_ID;
    private int Dinner_Amount;
    private int Dinner_Balance;
    private int Meal_Box_ID;
    private String Meal_Box_Food_Type;


    public Dinner_Box_CIF17(String mealname)
    {
        super(mealname);
    }

    public int Get_Dinner_ID()
    {
        return Dinner_ID;
    }

    public void Set_Dinner_ID(int in)
    {
        Dinner_ID = in;
    }

    public long Get_Meal_Box_ID()
    {
        return Meal_Box_ID;
    }

    public void Set_Meal_Box_ID(int in)
    {
        in = Meal_Box_ID;
    }


    public int Get_Dinner_Date()
    {
        return Dinner_Date;
    }

    public void Set_Dinner_Date(int in)
    {
        Dinner_Date = in;
    }

    public String Get_Dinner_Meal_Type()
    {
        return Dinner_Meal_Type;
    }

    public void Set_Dinner_Meal_Type(String in)
    {
        Dinner_Meal_Type = in;
    }

    public int Get_Dinner_Meal_Type_ID() { return Dinner_Meal_Type_ID;}

    public void Set_Dinner_Meal_Type_ID(int in)
    {
        Dinner_Meal_Type_ID = in;
    }

    public int Get_Dinner_Amount()
    {
        return Dinner_Amount;
    }

    public void Set_Dinner_Amount(int in)
    {
        Dinner_Amount = in;
    }

    public int Get_Dinner_Balance()
    {
        return Dinner_Balance;
    }

    public void Set_Dinner_Balance(int in)
    {
        Dinner_Balance = in;
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