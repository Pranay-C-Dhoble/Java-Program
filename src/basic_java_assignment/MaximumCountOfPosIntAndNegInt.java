package basic_java_assignment;

public class MaximumCountOfPosIntAndNegInt {
    public int maximumCount(int[] nums) {
         int pcount = 0;
         int ncount = 0;
        for (int num : nums) {
            if (num > 0) {
                pcount++;
            } else if (num < 0) {
                ncount++;
            }
        }
        return Math.max(pcount, ncount);

    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        MaximumCountOfPosIntAndNegInt obj = new MaximumCountOfPosIntAndNegInt();
        System.out.println(obj.maximumCount(nums));
    }
}
