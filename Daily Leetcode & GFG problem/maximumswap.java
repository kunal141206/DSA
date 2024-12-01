public class maximumswap {
    public static int maximumSwap(int num){
       char[] digit = String.valueOf(num).toCharArray();
       int n = digit.length;
        int[] rightmax = new int[n];
        int maxpos = n-1;
        rightmax[n-1] = n-1;
        for (int i = n-2; i >=0; i--) {
            if(digit[i] > digit[rightmax[i+1]]) maxpos = i;
            rightmax[i] = maxpos;
        }

// here rightmax[i] is the index that contains the index of largest element in an array
        for (int i = 0; i < n; i++) {
            if(digit[i] != digit[rightmax[i]]){
                char temp = digit[rightmax[i]];
                digit[rightmax[i]] = digit[i];
                digit[i] = temp;
                return Integer.valueOf(new String(digit));
            }
        }
            return num;
    }
    public static void main(String[] args) {
        int num = 22341345;
        System.out.println(maximumSwap(num));   
    }
}
