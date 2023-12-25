package methods;
//********* java is always Call By Value *********
public class ReturnArrayUsingVoid {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        int x = 5;
        reverseArray(arr, x);
        System.out.println(x);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArray(int [] arr, int i){    //why array is change but i is not change?
                                                    //because array is reference type and i is primitive type
        arr [0] = 7;                                //Reference means address
        i = 8;                                      //Primitive means value
    }

}
