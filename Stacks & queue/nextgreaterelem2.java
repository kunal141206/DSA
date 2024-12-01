import java.util.*;
public class nextgreaterelem2 {
    public int[] nextGreaterElements(int[] nums){
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int N = nums.length;
        for(int i = 2*N-1;i>=0;i--){
            int num = nums[i % N];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
                if(i <N){
                    result[i] = stack.isEmpty() ? -1 : stack.peek();
                }    
                stack.push(num);
        }
            return result;
    }
}
