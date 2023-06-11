public class maxSubarray {
    public static void subArrays(int nums[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length ; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum+= nums[k];
                    
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
        }
        System.out.println("The max sum = "+ maxsum);

    }
    public static void main(String[] args) {
        int nums[] ={1,-2,6,-1,3 };
        subArrays(nums);
    }
}
