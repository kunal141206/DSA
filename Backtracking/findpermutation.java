package Backtracking;
import java.util.ArrayList;  
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet; 
public class findpermutation {
    public List<List<Integer>> permute(int[] nums) {  
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);  
        backtrack(nums, 0, results);  
        return results;  
    }
    private static void backtrack(int[] nums, int start, List<List<Integer>> results) {  
        if (start == nums.length) {  //base step
            List<Integer> permutation = new ArrayList<>();  
            for (int num : nums) {  
                permutation.add(num);  
            }  
                results.add(permutation);
                return;  
        }  
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if(used.contains(nums[i])){
                continue;
            }
            used.add(nums[i]);  
            swap(nums, start, i);  
            backtrack(nums, start + 1, results);  
            swap(nums, start, i);  
        }  
    }
    private static void swap(int[] nums, int i, int j) {  
        int temp = nums[i];  
        nums[i] = nums[j];  
        nums[j] = temp;  
    }  
    public static void main(String[] args) {  
        findpermutation findpermutation = new findpermutation(); 
        // Example 1  
        int[] nums1 = {1, 1, 2};  
        System.out.println(findpermutation.permute(nums1)); // Output: All permutations of [1, 2, 3]  
    }  
}
