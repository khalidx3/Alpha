public class binaryString {
    public static void solution(int n, int lastPlace, String str ){
        if(n==0){
            System.out.println(str);
            return;
        }


        solution(n-1, 0, str+"0");
        if(lastPlace == 0){
            //sit 0 on nth chair
            solution( n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        solution(5, 0, "");
    }
    
}
