import java.util.Arrays;
public class overlappinginterval {
    public static int[][] overlappedInterval(int[][] Intervals){
        if(Intervals.length <= 1){
            return Intervals;
        }
        Arrays.sort(Intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int index = 0;
        for(int i = 1;i < Intervals.length;i++){
            if(Intervals[index][1] >= Intervals[i][0]){
                Intervals[index][1] = Math.max(Intervals[index][1], Intervals[i][1]);
            }
            else{
                index++;
                Intervals[index] = Intervals[i];
            }
        }
            return Arrays.copyOfRange(Intervals, 0, index+1);
    }
    public static void main(String[] args) {
        int[][] intervals = {{6,8},{1,9},{2,4},{4,7}};
        int[][] result = overlappedInterval(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}