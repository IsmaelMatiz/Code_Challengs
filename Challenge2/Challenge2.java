public class Challenge2
{
    public static void main(String[] args)
    {
        System.out.println("TestBool 1: "+validateBool(true));
        System.out.println("TestBool 2: "+validateBool(false));
    }

    public static String validateBool(Boolean testBool)
    {
        return testBool? "Yes" : "No";
    }
}
