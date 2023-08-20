package ArrayProgramsUsingMethods;

public class ReturnIndicesOfTheTwoNumbersSuchThatTheyAddUpToTarget {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        int target = 6;
        int [] ans = twoSum(arr,target);
        System.out.println("The indices of the two numbers such that they add up to target are : "+java.util.Arrays.toString(ans));
    }
    public static int[] twoSum(int []num, int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(target==num[i]+num[j]){
                    return new int[] {i,j};// returning indices of the two numbers such that they add up to target
                }
            }
        }
        return null;
    }
}
