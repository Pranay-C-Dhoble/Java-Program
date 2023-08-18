package String;

public class Add_a_Space {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("String without space : "+str);
        System.out.print("String with space : ");
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" "); // charAt() method returns the character at the specified index in a string.
        }
    }
}
