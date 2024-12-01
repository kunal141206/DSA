package Greedy;

import java.util.Arrays;

public class assigncookies {
    public int findContentChildren(int[] g, int[] s){
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int i = 0;
        while(j < s.length && i < g.length){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
            return count;
    }
}
