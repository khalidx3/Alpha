import java.util.*;
public class ReverseFirstKelement {
    public static Queue<Integer> reverse(Queue<Integer>q,int k){
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<k;i++){
            s.push((q.remove()));
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return q;

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(reverse(q,k));
    }
}
