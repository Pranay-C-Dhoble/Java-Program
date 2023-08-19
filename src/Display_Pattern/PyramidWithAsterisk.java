package Display_Pattern;
public class PyramidWithAsterisk {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 4; i++){
            for(int x = 4; x > i; x--){// This loop is for printing spaces
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){// This loop is for printing asterisks
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
