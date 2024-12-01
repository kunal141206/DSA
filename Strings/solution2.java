package Strings;
public class solution2 {
    public static String longestPalindrome(String s){
       int l = 0; 
       int r = s.length();
       StringBuilder res = new StringBuilder();
       while (l<r) {
            if(s.charAt(l) == s.charAt(r)){
                if(s.substring(l, r).equals(s.substring(r,l))){
                    res.append(s.substring(l, r));
                }
            }
                r--;
       }
            return res.toString();
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}