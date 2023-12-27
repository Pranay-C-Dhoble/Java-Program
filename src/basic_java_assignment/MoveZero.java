package basic_java_assignment;

import java.util.Arrays;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZero obj = new MoveZero();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
