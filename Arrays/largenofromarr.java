import java.util.*;
public class largenofromarr {
    public static String printLargest(int n, String[] arr){
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        } 
        StringBuilder result = new StringBuilder();
        for(String i : arr){
            result.append(i);
        }
            return result.toString();
    }
    public static void main(String[] args) {
        String[] arr1 = {"3", "30", "34", "5", "9"};
        int n = arr1.length;
        System.out.println(printLargest(n, arr1));
    }
}
