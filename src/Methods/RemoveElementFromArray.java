package Methods;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int val = 3;
        int ans = removeElement(arr,val);
        System.out.println("length of actual array : "+ans);
    }
    public static int removeElement(int []arr,int val){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=val){
                arr[i]=arr[j];// replacing the value of arr[i] with arr[j]
                i++;
            }
        }
        return i;
    }
}
