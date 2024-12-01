import java.util.HashMap;

public class LomgestSubarraywithsum {
    public static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer,Integer> remainderMap = new HashMap<>();
        int currentsum = 0;
        int maxlength = 0;
        remainderMap.put(0,-1);
        for(int i = 0;i<a.length;i++){
            currentsum += a[i];
            int remainder = currentsum % k;
            if(remainder < 0){
                remainder  += k;
            }
            if(remainderMap.containsKey(remainder)){
                int prevIndex = remainderMap.get(remainder);
                maxlength = Math.max(maxlength,i - prevIndex);
            }
            else{
                remainderMap.put(remainder,i);
            }
        }
                return maxlength;
    }
    public static void main(String[] args) {
        
    }
}
