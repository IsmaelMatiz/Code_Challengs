package Challenge1.Ismael;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class challenge1 {

    public static void main(String[] args) {
        List<String> array1 = new ArrayList(Arrays.asList("Keep", "Remove", "Keep", "Remove", "Keep"));
        List<String> array2 = new ArrayList(Arrays.asList("Keep"));
        List<String> array3 = new ArrayList(Arrays.asList("Keep", "Remove", "Keep", "Remove", "Keep", "Remove", "Keep", "Remove", "Keep", "Keep"));

        System.out.println(removeSecondElement(array3));
    }

    public static List<String> removeSecondElement(List<String> arrayToProcess)
    {        
        for(int i = 1; i < arrayToProcess.size(); i++)
        {
            arrayToProcess.remove(i);
        }

        return arrayToProcess;
    }
}
