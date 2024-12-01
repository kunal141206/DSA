package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class findsubsinlist {
     public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subs = new ArrayList<>();
        findsubsets(nums,result,subs,0);
        return result;
    }
    private static void findsubsets(int[] nums,List<List<Integer>> result,List<Integer> subs,int i){
        if(i == nums.length){
            result.add(new ArrayList<>(subs));
            return;
        }
        //yes
        subs.add(nums[i]);
        findsubsets(nums, result,subs, i+1);
        //no
        subs.remove(subs.size() - 1);
        findsubsets(nums, result,subs,i+1);
    }
    public static void main(String[] args) {
        findsubsinlist findsubsinlist = new findsubsinlist();
        int[] nums = {1,2,3};
        System.out.println(findsubsinlist.subsets(nums));
    }
}
