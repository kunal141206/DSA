import java.util.Stack;
public class maximumwidth {
    public static int maxWidthRamp(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int maxwidth = 0;
        for (int i = 0; i < nums.length;i++) {
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }
        for (int i = nums.length - 1;i >= 0; i--) {
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                maxwidth = Math.max(maxwidth, i - stack.pop());
            }
        }
            return maxwidth;
    }
    public static void main(String[] args) {
       int[]  nums = {6,0,8,2,1,5};
       System.out.println(maxWidthRamp(nums));
    }
}
