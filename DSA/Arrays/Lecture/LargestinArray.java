import java.util.*;
public class LargestinArray {
    public static int getLargest(int nums[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(Largest<nums[i]){
                Largest = nums[i];
            }
        }
        return Largest;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        System.out.println(getLargest(nums));

    }
}
