import java.util.PriorityQueue;
import java.util.Arrays;
public class divideinterval {
    public int minGroups(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int[] interval : intervals){
            if(!minheap.isEmpty() && minheap.peek() < interval[0]){
                minheap.poll();
            }
                minheap.add(interval[1]);
        }
            return minheap.size();
    }
}
