import java.util.*;
public class slidingwindow {
    public static int[] maxSlidingWindow(int[] nums, int k){
        if (nums == null || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1]; 
        Deque<Integer> deque = new LinkedList<>(); 

        for (int i = 0; i < n; i++) {
            //checks that the index not get out of bound
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            //ensures that the deque is decreasing in order 
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        
        return result;
    }
}
