
public class printfactorial {
    public static int calculatefact(int n){
        if(n == 1){
            return 1;
        }
        return n*calculatefact(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(calculatefact(n));
    }
}
