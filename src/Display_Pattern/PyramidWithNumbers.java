package display_pattern;

public class PyramidWithNumbers {
    public static void main(String[] args) {
        int temp = 1;
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j>= i; j--){// Start from 4 and decrement
                    System.out.print(" ");//space
            }
               for(int x = 1; x <= i; x++){
                   System.out.print(temp+" ");
                   temp++;//for incrementing
               }
            System.out.println();//new line
        }
    }
}
