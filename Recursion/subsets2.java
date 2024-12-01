import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class subsets2 {
    public static void func(int idx,int n,int[] nums ,List<Integer> l1,List<List<Integer>> result){
        if(idx == n){
            if ( !result.contains(l1)) {
                result.add(new ArrayList<>(l1)) ;   
            }
            return;
        }
        //include subset
        l1.add(nums[idx]);
        func(idx+1, n,nums ,l1, result);
        l1.remove(l1.size() - 1);
        //exclude subset
        func(idx+1, n, nums, l1, result);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        func(0,n,nums,l1,result);
        return result;
    }
}
