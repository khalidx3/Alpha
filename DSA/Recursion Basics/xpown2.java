public class xpown2 {
    public static int Opow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpow = Opow(x,n/2);
        // int sol =  Opow(x,n/2) * Opow(x,n/2); o(n)
        int sol = halfpow * halfpow; // O(log n)

        if(n%2!=0){
            sol = x*sol;
        }
        return sol;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Opow(x, n));
    }
}
