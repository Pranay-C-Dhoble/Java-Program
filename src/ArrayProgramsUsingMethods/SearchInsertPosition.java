package ArrayProgramsUsingMethods;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        int target = 3;
        int ans = searchInsert(arr,target);
        System.out.println("length of actual array : "+ans);
    }

    public static int searchInsert(int []arr,int target){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                return j;
            }
            else if(arr[j]>target){
                return j;
            }
        }
        return arr.length;
    }
}
