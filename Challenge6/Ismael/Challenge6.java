public class Challenge6 {

    public static void main(String[] args) {
        System.out.println(removeSpaces("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(removeSpaces("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(removeSpaces("8aaaaa dddd r     "));
    }

    public static String removeSpaces(String inputToBeCleaned)
    {
        var stringClean = "";
        for (Character character : inputToBeCleaned.toCharArray()) {
            if (character != ' ') {
                stringClean += character;   
            }
        }

        return stringClean;
    }
}