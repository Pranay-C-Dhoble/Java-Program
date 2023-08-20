package SimpleArrayPrograms;
public class Array_Even_No {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8,9,10};

        for (int j : a) {
            if (j % 2 == 0) {
                System.out.println("Even Number is :" + j);
            }
        }
    }
}
