import java.util.*;

public class ConnectNrope {
    public static int minCost(int arr[]){
    Queue<Integer> q = new LinkedList<>();
    for(int i =0;i<arr.length;i++){
        q.add(arr[i]);
    }
    int ans = 0;
    while(q.size()>1){
        int first = q.poll();
        int second = q.poll();
        int sum = first+second;
        ans+=sum;
        q.add(sum);

    }
    return ans;
}
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(minCost(arr));
    }
}
