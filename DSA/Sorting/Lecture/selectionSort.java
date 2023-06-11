public class selectionSort {
    public static void sort(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[min]>nums[j]){
                   min = j;
                }
                
            }
            int temp = nums[min];
            nums[min]= nums[i];
            nums[i] = temp;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,4,5};
        sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
