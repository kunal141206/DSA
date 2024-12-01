import java.util.Stack;
public class miniswaps {
    public static int minSwaps(String s){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '['){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count += 1;
                }
            }
        }
            return (count + 1)/2;
    }
    public static void main(String[] args) {
        String s = "[]";
        System.out.println(minSwaps(s));
    }
}
