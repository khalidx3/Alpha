public class palindrome {
    
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;
        while(palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse *10 + remainder;
            palindrome = palindrome/10;
        }
        if(n==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 121;
        if(isPalindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
