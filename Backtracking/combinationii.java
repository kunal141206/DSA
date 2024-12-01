package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationii {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        func(candidates,target,0,curr,result);
        return result;
    }
    public void func(int[] candidates,int target,int idx, List<Integer> curr,List<List<Integer>> result) {  
            int n =  candidates.length;  
                if(target == 0){
                    result.add(new ArrayList<>(curr));
                    return;
                }
            //pick the current combination
            for(int i = idx;i < n;i++){
                    if((i == idx || candidates[i-1] != candidates[i]) && candidates[i] <= target){
                        curr.add(candidates[i]);
                        func(candidates,target-candidates[i],i+1,curr,result);
                        curr.remove(curr.size()-1);
                    }
                }
    }
}
