package Strings;

public class solution1 {
    public int characterReplacement(String s, int k) {
        int[] freqMap = new int[26]; // Array to count occurrences of characters ('A' to 'Z')
        int left = 0, maxCount = 0, result = 0; // Initialize variables
    
        for (int right = 0; right < s.length(); right++) { 
            // Update frequency of the character at 'right'
            freqMap[s.charAt(right) - 'A']++; 
            
            // Track the maximum frequency of any single character in the window
            maxCount = Math.max(maxCount, freqMap[s.charAt(right) - 'A']); 
            
            // Check if the current window is valid (i.e., characters to change <= k)
            if ((right - left + 1) - maxCount > k) {
                // If the window is invalid, shrink it by moving the 'left' pointer
                freqMap[s.charAt(left) - 'A']--; 
                left++; // Move the left pointer to reduce the window size
            }
    
            // Update the maximum valid window size (result)
            result = Math.max(result, right - left + 1); 
        }
    
        return result; // Return the length of the longest valid substring
    }
    
}
