import java.util.*;

public class removek {
    public static String removeKdigits(String num, int k) {
        // Initialize a stack to keep track of digits
        Stack<Character> stack = new Stack<>();
        
        // If the number length is equal to k, return "0"
        if (num.length() == k) {
            return "0";
        }
        
        // Iterate through each digit in the number
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            
            // Remove digits from the stack if the current digit is smaller
            // to ensure the smallest possible number
            while (!stack.isEmpty() && stack.peek() > current && k > 0) {
                stack.pop();
                k--;
            }
            
            stack.push(current);
        }
        
        // If k > 0, remove the remaining digits from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Build the resulting number from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        // Reverse to get the correct order
        sb.reverse();
        
        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        // If the string is empty, return "0"
        return sb.length() == 0 ? "0" : sb.toString();
    }
    
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k)); // Output: "1219"
        
        // Additional test cases
        System.out.println(removeKdigits("10200", 1)); // Output: "200"
        System.out.println(removeKdigits("10", 2));    // Output: "0"
        System.out.println(removeKdigits("1234567890", 9)); // Output: "0"
    }
}
