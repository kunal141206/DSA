import java.util.ArrayList;
import java.util.PriorityQueue;

public class mergeKarrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> output = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] array : arr){
            for(int nums : array){
                pq.offer(nums);
            }
        }
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
            return output;
    }
}
