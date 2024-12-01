public class pairssum {
    public static int pairsum(int[] arr){
        if(arr.length < 2){
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if(value > largest){
                slargest = largest;
                largest = value;
            }
            else if(value != largest && value > slargest){
                slargest = value;
            }
        }
        if(slargest == Integer.MIN_VALUE){
            return 0;
        }
            return (largest + slargest);
    }
    public static void main(String[] args) {
        int  arr[] = {12, 34, 10, 6, 40};
        System.out.println(pairsum(arr));
    } 
}
