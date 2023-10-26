package String;
//What is Anagram?
//Two strings are said to be anagrams of each other if it contains the same characters, only the order of characters can be different.
//For example, “act” and “tac” are an anagram of each other.
//Anagram Program in Java
public class Anagram {
    public static void main(String[] args) {
        String a = "aab";
        String b = "aba";
        boolean isAnagram = false;
        boolean visited[] = new boolean[b.length()];
        if(a.length() == b.length()){
            for(int i = 0; i < a.length(); i++){
                char c = a.charAt(i);
                isAnagram = false;
                for(int j = 0; j < b.length(); j++){
                    if(b.charAt(j) == c && !visited[j]){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
