public class findminimun {
    public static int findMin(int[] nums){
        int minimum = nums[0];
        int start = 0;
        int end = nums.length - 1;
        int pivot = nums[end];
        int mid =  (start +  end) / 2;
        if(pivot <= nums[mid]){
            start = mid + 1;
        }
        else{
            end = mid;
        }
        while (start <= end) {
            if(nums[start] < minimum){
                minimum = nums[start];
            }
                start++;
        }
            return minimum;
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(findMin(nums));
    }
}
