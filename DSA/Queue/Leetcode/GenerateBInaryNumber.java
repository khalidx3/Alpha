import java.util.ArrayList;
import java.util.*;


public class GenerateBInaryNumber{
    public static ArrayList<String> generate(int N){
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while(N-- >0){
            String temp = q.remove();

            ans.add(temp);

            q.add(temp +"0");
            q.add(temp +"1");
        }
        return ans;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
}