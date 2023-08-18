package String;
public class space_in_uppercase{
    //WAP to add a space after every character of a given string and print them in UPPERCASE
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str1 = str.toUpperCase();
        System.out.println("String without space : "+str);
        System.out.print("String with space : ");
        for(int i=0;i<str1.length();i++){
            System.out.print(str1.charAt(i)+" "); // charAt() method returns the character at the specified index in a string.
        }
    }

}
