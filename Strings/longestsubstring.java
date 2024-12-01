package Strings;
import java.util.*;
public class longestsubstring {
    public static int lengthOfLongestSubstring(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            // If character is already in the set, move the left pointer
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character and update maxLength
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
