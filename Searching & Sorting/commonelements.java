import java.util.ArrayList;
import java.util.List;

class solution3{
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,List<Integer> arr3){
        List<Integer> res = new ArrayList<>();
        int a = 0,m = 0,k= 0;
        while (a < arr1.size() &&  m < arr2.size() && k < arr3.size()) {
            int val1 = arr1.get(a);
            int val2 = arr2.get(m);
            int val3 = arr3.get(k);
            if(val1 == val2 && val2 == val3){
                if(res.isEmpty() || res.get(res.size() - 1) != val1 ){
                    res.add(val1);
                }
                a++;
                m++;
                k++;
            }
            else if(val1 < val2){
                a++;
            }
            else if(val2 < val3){
                m++;
            }
            else{
                k++;
            }
        }
        if(res.isEmpty()){
            List<Integer> nocommon = new ArrayList<>();
            nocommon.add(-1);
            return nocommon;
        }
            return res;    
    }
}