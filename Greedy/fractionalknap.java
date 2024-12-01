package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class fractionalknap {
   public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity){
        double ratio[][] = new double[val.size()][2];
        for (int i = 0; i < val.size(); i++) {
            ratio[i][0] = i;
            ratio[i][1] = val.get(i)/(double)wt.get(i); 
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        double ans = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= wt.get(idx)){
                ans += val.get(idx);
                capacity -= wt.get(idx);
            }
            else{
                ans += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
            return ans;
    }
}
