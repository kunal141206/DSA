package Strings;
import java.util.*;
public class removeconsecutive {
    public static String removeConsecutiveCharacter(String S){
       Stack<Character> stack = new Stack<>();
        for(char i : S.toCharArray()){
            if(stack.isEmpty() || stack.peek() != i ){
                stack.push(i);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : stack){
            res.append(ch);
        }
            return res.toString();
    }
    public static void main(String[] args) {
        String S = "aabaa";
        System.out.println(removeConsecutiveCharacter(S));
    }
}
