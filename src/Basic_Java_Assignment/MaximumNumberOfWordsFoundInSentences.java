package basic_java_assignment;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String [] sent ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = maxNumberOfWords(sent);
        System.out.println(result);
    }
    static int maxNumberOfWords(String [] sent){
        int max = 0;
        for(String s : sent){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max + 1; //because we have to count the last word also
    }
}
