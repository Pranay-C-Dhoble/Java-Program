package String;

public class half_characters {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("String without space : "+str);
        System.out.print("String with space : ");
        int t = (str.length()/2);
        for(int i=0;i<t;i++){
            System.out.print(str.charAt(i)+" "); // charAt() method returns the character at the specified index in a string.
        }
    }
}
