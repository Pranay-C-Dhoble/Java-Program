package String;

public class LongestCommonString {
    public static void main(String[] args) {
        String [] arr = {"flower","flow","flight"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];// initialize the prefix with the first string
        for(int i = 1; i < strs.length; i++){// iterate through the array
            while(strs[i].indexOf(prefix) != 0){// indexOf() method returns the index within this string of the first occurrence of the specified substring
                prefix = prefix.substring(0, prefix.length() - 1);// substring() method returns a new string that is a substring of this string
            }
        }
        return prefix;
    }
}
