package ese.com.caloriecountdownappforandroidbrown;

public class MIF10_Time_Format_Checker_Class implements MIF10_Time_Format_Checker_fragment
{
    public boolean Time_Format_Checker(int IN, int INPUT)
    {
        if(IN == INPUT)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    public boolean Time_Format_Checker(String IN)
    {
        if(Check_Length(IN))
        {
            if(All_and_Each_Character_Digit(IN))
            {
                if(No_Delimeter(IN))
                {
                    if(NotGreaterThanSixty(IN))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }

                return true;
            }
        }


        return false;

    }

    public boolean Time_Format_Checker(int IN)
    {

        return(IN < 10000);

    }


    private boolean All_and_Each_Character_Digit(String IN)
    {
        for(int c = 0; c < IN.length(); c++)
        {
            if(isChar(IN.charAt(c)))
            {
                ;
            }
            else
            {
                return false;
            }
        }

        return true;
    }



    private boolean Check_Length(String IN)
    {
        android.util.Log.d("Check Length",new RoundingCIF13().IntToString(IN.length()));
        if(IN.length() == 4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isChar(char IN)
    {
        if(IN == '0' || IN == '1' || IN == '2' || IN == '3' || IN == '4' || IN == '5' || IN == '6' || IN == '7' || IN == '8' || IN == '9' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean No_Delimeter(String IN)
    {
        for(int c = 0; c < IN.length(); c++)
        {
            if(IN.charAt(c) == ':' || IN.charAt(c) == ';' || IN.charAt(c) == '.')
            {
                return false;
            }
        }

        return true;
    }

    private boolean NotGreaterThanSixty(String IN)
    {
        if(IN.charAt(2) == '6' || IN.charAt(2) == '7' || IN.charAt(2) == '8' || IN.charAt(2) == '9')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
