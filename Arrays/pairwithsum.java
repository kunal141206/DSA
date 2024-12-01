public class pairwithsum {
    public static  int countPair(int k, int arr[]){
        int n = arr.length;
        int s = 0;
        int e  = n-1;
        int c = 0;
        while(s<e){
            if((arr[s] + arr[e]) == k){
                c += 1;
                s++;
                e--;
            }
            else if ((arr[s] + arr[e]) <  k) {
                s++;
            }
            else{
                e--;
            }   
        }
            return c;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 98 ;
        System.out.println(countPair(k, arr));
    }
}
