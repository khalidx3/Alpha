public class lastoccurance {
    public static int lastOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,3,4};
        int key = 3;
        System.out.println(lastOccur(arr, key, 0));
    }
}
