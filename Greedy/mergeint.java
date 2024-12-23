package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class mergeint {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if(currentInterval[1] >= intervals[i][0]){
                currentInterval[1] = Math.max(currentInterval[1],intervals[i][1]);
            }
            else{
                res.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
            res.add(currentInterval);
            return res.toArray(new int[res.size()][2]);
    }
}
