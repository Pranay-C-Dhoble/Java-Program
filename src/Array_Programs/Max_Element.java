package Array_Programs;
public class Max_Element {
    public static void main(String[] args) {
        int []a = {98,20,10,70,40,101,70,80,45,26,100};
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            if (temp < a[i]){
                temp = a[i];
            }
        }
        System.out.println("Maximum Element of this Array is : "+temp);
    }
}
