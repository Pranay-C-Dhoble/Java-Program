package basic_java_assignment;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){ //isLetterOrDigit() is a method and return type is boolean
                i++;                                                 //Character is a class
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){//toLowerCase() is a method and return type is char
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
