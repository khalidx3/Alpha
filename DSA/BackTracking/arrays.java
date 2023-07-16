public class arrays{
    public static void solution(int arr[],int idx,int val){
        //base
        if(idx==arr.length){
            Printarr(arr);
            return;
        }
        //kaam
        arr[idx]=val;
        solution(arr, idx+1, val+1);
        arr[idx]=arr[idx]-2;

    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        solution(arr, 0, 1);
        Printarr(arr);
    }
}