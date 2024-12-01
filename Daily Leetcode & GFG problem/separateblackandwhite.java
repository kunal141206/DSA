public class separateblackandwhite {
    public static long minimumSteps(String s){
        long count = 0;
        int cw = 0;
        for (char  c : s.toCharArray()) {
            if(c == '0'){
                cw++;
            }
            else if(c == '1'){
                count += cw;
            }    
        }
            return count;
    }
    public static void main(String[] args) {
        String s = "11000111";
        long sp = separateblackandwhite.minimumSteps(s);
        System.out.println(sp);
    }
}
