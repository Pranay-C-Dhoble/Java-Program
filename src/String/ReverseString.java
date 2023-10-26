package String;

public class ReverseString {
    public static void main(String[] args) {
        SecondMethod();
        FirstMethod();
    }
    static void SecondMethod() {
        String str = "Hello World";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of " + str + " is " + reverse);
    }
    //reverse array using methods in String class
     static void FirstMethod() {
         String str = "Hello World";
         String reverse = "";
         reverse = new StringBuffer(str).reverse().toString();
         System.out.println("Reverse of " + str + " is " + reverse);
     }
}
