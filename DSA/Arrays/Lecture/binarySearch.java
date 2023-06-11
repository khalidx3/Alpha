public class binarySearch {
    public static int binary_Search(int n[], int target) {
        int start =0;
        int end = n.length-1;

        while(start<= end){
            int mid = (start+end)/2;
            if(n[mid]==target){
                return mid;
            }
            if(n[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
            
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        int target = 4;
        int result = binary_Search(n, target);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("The value is at index "+result);
        }
    }
}
