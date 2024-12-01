package Greedy;

import java.util.Arrays;

public class nonoverlaping {
    public int eraseOverlapIntervals(int[][] intervals){
        if (intervals.length == 0) return 0;
        int count = 0;
       Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[1],arr2[1]));
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] < end){
                count++;
            }
            else{
                end = intervals[i][1];
            }
        }
            return count;
    }
}
