package String;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int index = -1;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                index = i;
                for(int j = 0; j < needle.length(); j++){
                    if(i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)){
                        index = -1;
                        break;
                    }
                }
                if(index != -1){
                    break;
                }
            }
        }
        return index;
    }
}
