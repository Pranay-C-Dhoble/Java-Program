package String;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        char[] arr = new char[s.length()];
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)) {
                case '(' -> arr[index++] = ')';
                case '{' -> arr[index++] = '}';
                case '[' -> arr[index++] = ']';
                default -> {
                    if(index == 0 || arr[--index] != s.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return index == 0;
    }
}
