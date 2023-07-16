public class friendsPairing {
    public static int solution(int n){
        if(n==1||n==2){
            return n;
        }
        // single 
        int single = solution(n-1);
        // pair
        int pair = single * solution(n-2);

        //tot ways
        return single + pair;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
    
}
