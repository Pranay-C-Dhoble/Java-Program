package String;

public class SecondHalfCharacters {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("String without space : "+str);
        System.out.print("String with space : ");
        int t = (str.length()/2);// t is the index of the middle character of the string
        for(int i=t;i<str.length();i++){
            System.out.print(str.charAt(i)+" "); // charAt() method returns the character at the specified index in a string.
        }
    }
}
