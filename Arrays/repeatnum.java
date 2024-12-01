import java.util.Arrays;
import java.util.HashSet;
public class repeatnum {
    //O(NLOGN) -------> Approach
    public static int[] repeatednumber(int[] A){
        int Am = -1;
        int K = -1;
        Arrays.sort(A);
        for(int i = 1;i<A.length;i++){
            if(A[i] == A[i-1]){
                Am = A[i];
                break;
            }
        }
        long sumofN = (A.length * (A.length + 1))/2;
        long actualsum = 0;
        for(int i : A){
            actualsum += i;
        }
        K = (int)(sumofN - (actualsum - Am));
        int result[] = new int[2];
        result[0] = Am;
        result[1] = K; 
        return result;
    }
    //O(N) ------> Approach using Hashset
    public static int[] optimizedrepeatednumber(int[] A){
        int Am = -1;
        int K = -1;
        HashSet<Integer> seen = new HashSet<>();
        long sumOfN = (long) A.length * (A.length + 1)/2;
        long actualSum = 0;
        for(int i : A){
            seen.add(i);
            if(seen.contains(i)){
                Am = i;
            }
            actualSum += i;
        }
        K = (int)(sumOfN - (actualSum - Am));
        return new int[]{Am,K};
    }
    public static void main(String[] args) {
        int[] A = {3,1,2,5,3};
        int[] result = optimizedrepeatednumber(A);
        System.out.println("Repeated number : "+result[0]);
        System.out.println("Missing number " +result[1]);
    }
}
