public class Challenge3 {
    public static void main(String[] args) 
    {
        System.out.println(Challenge3.validateEvenOrOdd(4));
        System.out.println(Challenge3.validateEvenOrOdd(7));
        System.out.println(Challenge3.validateEvenOrOdd(0));
    }

    public static String validateEvenOrOdd(int numToValidate)
    {
        return numToValidate % 2 == 0? "Even" : "Odd";
    }
}