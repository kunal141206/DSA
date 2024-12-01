package Backtracking;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class combinationsumsolve {
     public static List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    private static void backtrack(int[] candidates,int target,int start,List<Integer> currcomb,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(currcomb));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(candidates[i] > target) break;

            currcomb.add(candidates[i]);//yes condition
            backtrack(candidates, target-candidates[i], i, currcomb, result);//Recursive step
            currcomb.remove(currcomb.size()-1);// backtracking step
        }
    }
}
