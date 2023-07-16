public class tillingproblem {
public static int solution(int a, int n){
    if(n==0||n==1 ){
        return 1;
    }
    int vertical =  solution(a, n-1);
    int horizontal = solution(a, n-2);

    return vertical+horizontal;

}
    public static void main(String[] args) {
        int a =2;
        int n =4;
        System.out.println(solution(a, n));
    }
}
