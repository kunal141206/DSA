import java.util.PriorityQueue;
public class kthlarge {
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i : nums){
            minHeap.offer(i);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
            return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 5;
        System.out.println(findKthLargest(nums, k));
    }
}
