package Basic_Java_Assignment;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int reverse = 0;
        while(temp != 0){
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }
}
