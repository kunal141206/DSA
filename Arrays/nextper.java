import java.util.Arrays;

public class nextper { 
    public static void nextpermutation(int[] nums){
        int i = nums.length - 2;
        while(i>=0 && nums[i] >= nums[i+1] ){
            i--;
        }
        if(i >= 0 ){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
            reverse(nums,i+1,nums.length - 1); 
    }
    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextpermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
