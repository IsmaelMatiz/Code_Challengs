public class Challenge8 {

    public static void main(String[] args) {
        System.out.println(getFive());
    }

    public static int getFive()
    {
        var index = "asdfe}";
        return index.lastIndexOf('}');
    }
}