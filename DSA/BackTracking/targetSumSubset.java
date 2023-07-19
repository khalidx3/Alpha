public class targetSumSubset {
    public static void targetSum(int arr[],int idx,String set,int sos,int tar){
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+".");
            }
            return;
        }
        targetSum(arr, idx+1, set+arr[idx], sos+arr[idx], tar);
        targetSum(arr, idx+1, set, sos, tar);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 70;
        targetSum(arr, 0, " ", 0, target);
    }
    
}
