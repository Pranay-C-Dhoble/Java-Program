package Array_Programs;
public class Min_Element {
    public static void main(String[] args) {
        int []a = {10,40,76,89,2,4,37,4,1,8,9,0,-6};
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            if(temp > a[i]){
                temp = a[i];
            }
        }
        System.out.println("Minimum Element of this Array is : "+temp);
    }
}
