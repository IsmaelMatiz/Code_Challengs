import java.util.ArrayList;
import java.util.Arrays;

public class Challenge7 {
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(splitString("Robin Singh")));
        System.out.println(Arrays.toString(splitString("I love arrays they are my favorite")));
    }

    public static String[] splitString (String inputToSplit)
    {
        var resultArray = new ArrayList<String>();
        var auxString = "";
        for (Character character : inputToSplit.toCharArray()) {
            if (character != ' ') {
                auxString += character;
            }
            else
            {
                resultArray.add(auxString);
                auxString = "";
            }
        }

        if (!auxString.isEmpty()) {
            resultArray.add(auxString);
        }

        return resultArray.toArray(new String[resultArray.size()]);
    }
}