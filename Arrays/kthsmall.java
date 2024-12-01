
import java.util.Collections;
import java.util.PriorityQueue;
public class kthsmall {
    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder(null));
        for(int i : arr){
            minheap.offer(i);

            if(minheap.size() > k){
                minheap.poll();
            }
        }
            return minheap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
