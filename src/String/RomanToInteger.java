package String;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int result = romanToInt(roman);
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        int result = 0;
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)) {// switch case is faster than if-else//charAt() method returns the character at the specified index in a string
                case 'I' -> arr[i] = 1;
                case 'V' -> arr[i] = 5;
                case 'X' -> arr[i] = 10;
                case 'L' -> arr[i] = 50;
                case 'C' -> arr[i] = 100;
                case 'D' -> arr[i] = 500;
                case 'M' -> arr[i] = 1000;
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                result = result - arr[i];// subtract the value of the current index//when the value of the next index is greater
            }else{
                result = result + arr[i];// add the value of the current index when//the value of the next index is smaller
            }
        }
        return result + arr[arr.length - 1];// add the value of the last index
    }
}
