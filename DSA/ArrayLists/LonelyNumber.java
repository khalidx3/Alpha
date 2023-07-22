import java.util.ArrayList;

public class LonelyNumber {
    public static ArrayList<Integer> lonely(ArrayList<Integer>list){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if(list.get(i)!=list.get(j)|| list.get(i)!=list.get(i+1)||list.get(i)!=list.get(i+1)){
                     result.add(i);
            
                }
                
            }
            
            
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonely(list));
    }
}
