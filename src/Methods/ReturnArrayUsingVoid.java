package Methods;

public class ReturnArrayUsingVoid {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArray(int []arr){
        arr[0] = 5;
    }

}
