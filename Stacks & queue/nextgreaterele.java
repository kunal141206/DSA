
import java.util.*;
public class nextgreaterele {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
       Map<Integer,Integer> nextGreaterMap = new HashMap<>();
       Stack<Integer> stack = new Stack<>();
       for(int i = nums2.length - 1;i >= 0;i--){
            int num = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            nextGreaterMap.put(num,stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
       }    
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }    
        return result;
    }    
}
