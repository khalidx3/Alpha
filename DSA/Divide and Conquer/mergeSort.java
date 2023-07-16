public class mergeSort{
    public static void sorting(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
         sorting(arr, si, mid);
         sorting(arr, mid+1, ei);
         merge(arr, si, mid, ei);
        
    }
    public static void merge(int arr[],int si,int mid, int ei){

        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //for temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;

            }else{
                temp[k] =arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp to orginal arr
        for(k = 0, i= si; k<temp.length;k++, i++){
            arr[i] = temp[k];

        }
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