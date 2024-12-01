import java.util.ArrayList;
import java.util.List;
public class reorganizearr{
    public static List<Integer> rearrange(List<Integer> arr){
        int n = arr.size();
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<n;i++) {
            res.add(-1);
        }
        for (int i = 0; i < n; i++) {
            int element = arr.get(i);
            if(element >= 0 && element < n){
                res.set(element,element); 
            }
        }
            return res;
    }
}