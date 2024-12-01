import java.util.PriorityQueue;
import java.util.Collections;
public class maximumkelements {
    public static long maxKelements(int[] nums, int k){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            maxheap.add(i);
        }
            long sum = 0;
        for (int i = 0; i < k; i++) {
            int maxval = maxheap.poll();
            sum += maxval;
            int newval = (int)Math.ceil(maxval / 3.0);
            maxheap.add(newval);
        }
            return sum;
    }
    public static void main(String[] args) {
        int[]  nums = {10,10,10,10,10};
        int k = 5;
        System.out.println(maxKelements(nums, k));
    }
}
