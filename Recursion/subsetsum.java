import java.util.ArrayList;
import java.util.Collections;
public class subsetsum {
   public static void func(int idx,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> subsetsum){
        if(idx == n){
            subsetsum.add(sum);
            return;
        }
        //pick condition
        func(idx+1, sum+arr.get(idx), arr, n, subsetsum);
        //non pick condition
        func(idx+1, sum, arr, n, subsetsum);
   }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> subsetsum = new ArrayList<>();
        func(0,0,arr,n,subsetsum);
        Collections.sort(subsetsum);    
        return subsetsum;
   }
}
