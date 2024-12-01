
import java.util.ArrayList;
public class elimination {
    public static int lastRemaining(int n){
        ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                arr.add(i);
            }
            boolean removeodd = true;
            while (arr.size() > 1) {
                removeElements(arr,removeodd);
                removeodd = !removeodd;
            }
                return arr.get(0);
        }
        private static void removeElements(ArrayList<Integer> arr,boolean removeodd){
            ArrayList<Integer> newarr = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                if (removeodd && i % 2 == 1) {
                    newarr.add(arr.get(i));
                }
            }
            for (int i = arr.size()-1; i >= 0; i--) {
                if(!removeodd && i % 2 == 1){
                    newarr.add(arr.get(i));
                }
            }
                arr.clear();
                arr.addAll(newarr);
        }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(lastRemaining(n));
    }
}
