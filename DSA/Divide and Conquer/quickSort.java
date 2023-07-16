public class quickSort {
    public static void sorting(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pIdx= partition(arr,si,ei);
        sorting(arr, si, pIdx-1); //left
        sorting(arr, pIdx+1, ei); //right

    } 
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j =si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,5,3,2};
        sorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}
