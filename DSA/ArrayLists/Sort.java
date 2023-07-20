import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(2);
    
    System.out.println(list);
   Collections.sort(list); //ascending
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder()); //descending
    System.out.println(list);
    }
}
