package Methods;
public class RunningSumOfAnArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};// declaring and initializing array
        System.out.println("The array is : "+java.util.Arrays.toString(arr));
        int [] pre = runningSum(arr);// calling runningSum() method
        System.out.println("The running sum of array is : "+java.util.Arrays.toString(pre));//Array.toString() method returns a string representation of the contents of the specified array.
    }
    public static int[] runningSum(int[] nums) {// method to find running sum of an array
        int [] pre = new int[nums.length];// Creating Object of int array
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        return pre;
    }
}
