package Basic_Java_Assignment;
//"ab-cd" -> "dc-ba"
//"a-bC-dEf-ghIj" -> "j-Ih-gfE-dCba"
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String result = reverseOnlyLetters(s);
        System.out.println(result);
    }

    static String reverseOnlyLetters(String s){
        int i = 0;
        int j = s.length() - 1;
        char [] arr = s.toCharArray();
        while(i < j){
            while(i < j && !Character.isLetter(arr[i])){//isLetter() method determines whether the specified char value is a letter or digit.
                                                        //Character.isLetter() method returns true if the specified char value is a letter.
                i++;
            }
            while(i < j && !Character.isLetter(arr[j])){//Character is a wrapper class for primitive data type char.
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
