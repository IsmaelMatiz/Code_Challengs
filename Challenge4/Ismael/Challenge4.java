import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println(hexToDec("-c"));
    }

    public static int hexToDec(final String hexString) 
    {
        var counterPow = 0;
        var resultDecimal = 0;
        var hexString2 = hexString.toUpperCase().replace("-", "");
        var isNegative= hexString.contains("-");
        List<Integer> decimalsToBeCalculated = new ArrayList<Integer>();

        for (char digit : hexString2.toCharArray()) 
        {
            var decimalNum = getDecimalNum(digit);

            if (decimalNum == null) {
                System.out.println("Por favor ingrese un hexadecimal valido");
                return 0;
            }

            decimalsToBeCalculated.add(decimalNum);
        }

        for (int i = decimalsToBeCalculated.size()-1; i >= 0; i--) {
            resultDecimal += decimalsToBeCalculated.get(i) * Math.pow(16, counterPow);
            counterPow++;
        }

        return isNegative? resultDecimal * -1 : resultDecimal;
    }

    public static Integer getDecimalNum(Character hexDigit)
    {
          Map<String,Integer> letterToNum = Map.of(
          "A",10,
          "B",11,
          "C", 12,
          "D",13,
          "E", 14,
          "F",15
          );
          var asciiVal = (int) hexDigit;


          if (asciiVal >= 65 && asciiVal <= 70) {
              return letterToNum.get(hexDigit.toString());
          }else if(asciiVal >= 48 && asciiVal <= 57)
          {
              return Integer.parseInt(hexDigit.toString());
          }else
          {
              return null;
          }
    }
}
