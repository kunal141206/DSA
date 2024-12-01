public class findstep {
    public static int findStepKeyIndex(int[] arr, int k, int x){
        if(arr == null || arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length;) {
            if(arr[i] == x){
                return i;
            }
            i += Math.max(1,Math.abs(arr[i] - x)/k);
        }
            return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 6};
        int k = 1;
        int x = 6;
        System.out.println(findStepKeyIndex(arr, k, x));
    }
}
