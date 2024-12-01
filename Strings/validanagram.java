package Strings;

import java.util.Arrays;

public class validanagram {
    public  static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        return Arrays.equals(sarray,tarray);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}