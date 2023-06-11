public class maxSubarrayII {
    public static void subArrays(int nums[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        //calculate prefix
        for (int i = 1; i < nums.length; i++) {
            prefix[i] =prefix[i-1]+nums[i]; 
        }
        for (int i = 0; i < nums.length; i++) {
            int start =i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = start == 0? prefix[end] : prefix[end]-prefix[start-1];
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }

        }
        System.out.println("The max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int nums[] ={1,-2,6,-1,3 };
        subArrays(nums);
    }
}
