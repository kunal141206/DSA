import java.util.Arrays;
class solution1 {
    public static String countSort(String arr){
        char[] ans = arr.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }
    public static void main(String[] args) {
        // int N = 5;
        String S = "edsab";
        System.out.println(countSort(S));
    }
}