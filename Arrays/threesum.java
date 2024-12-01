import java.util.ArrayList;
import java.util.Arrays;
public class threesum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length - 2 ;i++){
            if(i >0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add((ArrayList<Integer>) Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                while(left < right && nums[left] == nums[left - 1]) left++;
                while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
            return result;
    }
}
