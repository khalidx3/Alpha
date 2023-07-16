public class firstoccurance{
    public static int firstoccur(int arr[], int i, int key){
        if(arr.length==i){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5};
        int key = 3;
        System.out.println(firstoccur(arr, 0, key));
        
    }
}