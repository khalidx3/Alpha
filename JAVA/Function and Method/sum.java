public class sum {
    public static int sumOfdigit(int n){
        int sum = 0;
        while(n!=0){
            int remainder = n % 10;
            sum+=remainder;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfdigit(10023));
    }
}
