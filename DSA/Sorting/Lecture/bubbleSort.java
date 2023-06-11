public class bubbleSort{
    // public static void sort(int nums[]){
    //     int n = nums.length;
    //     for (int turns = 0; turns < n-1; turns++) {
    //         for (int i = 0; i < n-1-turns; i++) {
    //             if(nums[i]>nums[i+1]){
    //             int temps = nums[i];
    //             nums[i]= nums[i+1];
    //             nums[i+1] = temps;
    //             }
               
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={5,1,4,6,3};
    //     sort(arr);
    //     for(int i = 0; i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    //optimized code for already sorted
    public static void sort(int nums[]){
        int n = nums.length;
        for (int turns = 0; turns < n-1; turns++) {
            int swap =0;
            for (int i = 0; i < n-1-turns; i++) {
                if(nums[i]>nums[i+1]){
                int temps = nums[i];
                nums[i]= nums[i+1];
                nums[i+1] = temps;
                swap++;
                }
               
               
            }
            if(swap == 0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}