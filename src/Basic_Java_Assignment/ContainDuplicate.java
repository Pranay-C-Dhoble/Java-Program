package basic_java_assignment;

import java.util.Arrays;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainDuplicate obj = new ContainDuplicate();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.containsDuplicate(nums));
    }
}
