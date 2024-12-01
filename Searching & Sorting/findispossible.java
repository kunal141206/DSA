import java.util.ArrayList;

class solution {
    public static ArrayList<Integer> Max_Sum(int[] arr, int k){
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0;
        int r = arr.length - 1;
        int closestsum = Integer.MIN_VALUE;
        int closestL = -1;
        int closestR = -1;
        while (l<r) {
            int currentsum = arr[l] + arr[r];
            if(currentsum < k){
                if(currentsum > closestsum){
                    closestsum = currentsum;
                    closestL = l;
                    closestR = r;
                }
                l++;
            }
            else{
                r--;
            }
        }
        if (closestL == -1 && closestR == -1) {
            res.add(-1);
            res.add(-1);
        } else {
            res.add(arr[closestL]);
            res.add(arr[closestR]);
        }        
        return res;       
    }
}