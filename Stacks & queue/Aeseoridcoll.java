import java.util.Stack;

public class Aeseoridcoll {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 && num < 0){
                int top = stack.peek();
                if(Math.abs(num) > top){
                    stack.pop();
                }
                else if(Math.abs(num) == top){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(num);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size() -1;i>= 0;i--){
            result[i] = stack.pop();
        }
            return result;
    }
}
