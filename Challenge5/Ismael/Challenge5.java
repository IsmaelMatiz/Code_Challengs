import java.util.ArrayList;

public class Challenge5 {
    public static void main(String[] args) {
        System.out.println(between(5, 20));
    }   
    
    public static ArrayList<Integer> between(int from, int to){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            resultList.add(i);
        }

        return resultList;
    }
}