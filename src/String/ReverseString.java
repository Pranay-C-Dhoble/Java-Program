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
         //what is the use of StringBuffer class?
         //StringBuffer class is used to create mutable (modifiable) string.
         //The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
            //Whereas String class once created cannot be changed.
            //StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
            //StringBuffer class is synchronized i.e. it is thread-safe and hence can be used when we need to share StringBuffer between multiple threads.

     }
}
