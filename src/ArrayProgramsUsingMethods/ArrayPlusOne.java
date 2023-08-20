package ArrayProgramsUsingMethods;

public class ArrayPlusOne {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,9};
        int [] ans = plusOne(arr);// 1,2,4,6,9
        System.out.println("Array after adding 1 : "+java.util.Arrays.toString(ans));//expected output : [1,2,4,7,0]
        }
        public static int[] plusOne(int[] arr){
            int n = arr.length;
            for(int i=n-1;i>=0;i--){// 9,6,4,2,1
                if(arr[i]<9){// 9<9,6<9,4<9,2<9,1<9
                    arr[i]++;
                    return arr;
                }
                arr[i]=0;// 9=0,6=0,4=0,2=0,1=0
            }
            int [] newNumber = new int[n+1];
            newNumber[0]=1;
            return newNumber;
        }
}
