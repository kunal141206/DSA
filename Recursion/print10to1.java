

public class print10to1{
    public static void printInc(int n){
        //base case
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void printDec(int n){
        //base case
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
        System.out.println();
        printDec(n);
    }
}