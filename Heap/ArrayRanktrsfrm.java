import java.util.HashMap;
import java.util.TreeSet;

public class ArrayRanktrsfrm{
    public int[] arrayRankTransform(int[] arr) {
       TreeSet<Integer> set = new TreeSet<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i : arr){
            set.add(i);
       }
       int rank = 1;
       for(int num : set){
            map.put(num,rank);
            rank++;
       }
       for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
       }
            return arr; 
    }
}