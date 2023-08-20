package SimpleArrayPrograms;

public class Reverse_Array {
    public static void main(String[] args) {
        int []a = {10,40,50,60,70,80};
        System.out.print("Before Reverse Operation : ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
        int i = 0, j = a.length - 1;
        while(i < j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        System.out.print("After Reverse Operation : ");
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
