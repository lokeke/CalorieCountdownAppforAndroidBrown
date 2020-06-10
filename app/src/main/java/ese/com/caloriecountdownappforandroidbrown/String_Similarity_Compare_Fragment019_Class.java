package ese.com.caloriecountdownappforandroidbrown;



public class String_Similarity_Compare_Fragment019_Class implements String_Similarity_Compare_Fragment019
{
    public float Compare_Strings(String INPUT1, String INPUT2)
    {
        //Algorithm Engineering -> android -> (re)Load... -> www.ese-edet.eu

        //fragment (interface/class)another function take in two strings in function called
        // compare similarity returns a float the is percentage match or similarity where 100.00 is identical and
        // 0 is no letters in common, we search through database and return results that are 60.00 or more.

        //Convert (i)intellgence envelope to Documentation :
        //Similarity ration = y / N (total character length of longest input

        //Step a : Create fragment variables to store all start top.

        int y = 0;
        int n = 0;
        int length = 0;
        float Output = 0;

        String foundation_token = "empty";
        String shorter_string = "empty";

        //Step One : Apply SpellChecker2 to INPUT1 Food item name typed in.
        //in lets Client choose from option received the return correct fooditem name to INPUT1

        //Step Two : Show results including orginal name in Textview wizard for selection.

        //Step Three : Selection becomes new INPUT1.

        Food_Diary_Sheet_CIF3 module = new Food_Diary_Sheet_CIF3();
        INPUT1 = module.SpellChecker2(INPUT1);


        //Step Four : Compare the length of the two Strings.
        //Step Five : Go for the longer one as foundation.

        length = length_of_longest_string(INPUT1,INPUT2);


        //Step Six : for each Character in the longer String Loop compare with match character position of short String.

        foundation_token = return_longest_string(INPUT1,INPUT2);
        shorter_string = return_shortest_string(INPUT1,INPUT2);

        //Step Six : if identical y++ else n++

        for(int c = 0; c < foundation_token.length(); c++)
        {
            if(foundation_token.charAt(c) == shorter_string.charAt(c))
            {
                y++;
            }
            else
            {
                n++;
            }
        }

        //Step Seven : Out of loop calculate similarity ratio y/N (total lenght of longest character fragment* into a variable

        Output = Similarity_Ratio((float) y, (float) n, (float) length);

        //Step 8 : OUTPUT Similarity ration as float.

        return Output;

        // (re)Load... -> www.ese-edet.eu



    }


    private int length_of_longest_string(String x, String y)
    {
        int first = x.length();
        int second = y.length();

        if(first > second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }

    private String return_longest_string(String x, String y)
    {
        if(x.length() > y.length())
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    private String return_shortest_string(String x, String y)
    {
        if(x.length() < y.length())
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    private float Similarity_Ratio(float y, float n, float l)
    {
        float ratio = y/l;

        return round(ratio);
    }



    private float round(float in)
    {
        in = in * 100;
        int k = (int) in;
        in = k;
        in = in/100;
        return in;
    }
}
