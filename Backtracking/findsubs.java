package Backtracking;

public class findsubs {
    public static void findsubsets(String s,String ans,int i){
        if(i == s.length()){    //base step
            System.out.println(ans);
            return;
        }
        //yes
        findsubsets(s, ans+s.charAt(i), i+1); //recursion step if ans is yes
        //No
        findsubsets(s, ans, i+1);   //recursion step if ans is No
    }
    public static void main(String[] args) {
        String s = "abc";
        findsubsets(s, "", 0);
    }
}
