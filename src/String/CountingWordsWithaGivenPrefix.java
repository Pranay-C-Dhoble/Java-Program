package String;
import java.lang.String;
public class CountingWordsWithaGivenPrefix {
    public static void main(String[] args) {
        String []words = {"i love you", "i like India","i love Leetcode"};
        String prefix = "i love";
        int result = prefixCount(words, prefix);
        System.out.println(result);
    }
    public static int prefixCount(String []words, String prefix){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.startsWith(prefix)){// startsWith() method tests if this string starts with the specified prefix.
                count++;
            }
        }
        return count;
    }
}
//Input: words = ["pay","attention","practice","attend"], pref = "at"
//Output: 2
//Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".