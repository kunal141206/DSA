import java.util.*;
class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length;
        int watertrapped = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                int top = stack.pop();
                if(stack.isEmpty()) break;
                int leftidx = stack.peek();
                int width = i-leftidx-1;
                int boundedheight = Math.min(height[i],height[leftidx]) - height[top];
                watertrapped += width*boundedheight;
            }
                stack.push(i);
        }
            return watertrapped;
    }
}