package basic_java_assignment;

public class AddString {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String result = addStrings(num1, num2);
        System.out.println(result);
    }
    static String addStrings(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder(); //StringBuilder is a class //sb is object of StringBuilder class
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += num1.charAt(i) - '0'; //'0' is a character //charAt() is a method and return type is char
                i--;                          // ASCII value of '0' is 48 and '1' is 49
            }                                   //intAt() is a method and return type is int
            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0){
            sb.append(carry); //append() is a method and return type is StringBuilder
        }
        return sb.reverse().toString();
    }
}
