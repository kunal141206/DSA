import java.util.ArrayList;
import java.util.List;

public class spiral {
    public static List<Integer> spiralOrder(int[][] a){
        List<Integer> ans  = new ArrayList<>();
        if (a.length == 0) return ans;
        int sr = 0,er = a.length-1;
        int sc = 0,ec = a[0].length-1;
        while (sr<=er && sc<=ec) {
            //top
            for (int j = sc; j <= ec; j++) {
                ans.add(a[sr][j]);
            }
            //right
            for (int i = sr+1; i <= er; i++) {
                ans.add(a[i][ec]);
            }
            //bottom
            for (int j = ec-1; j >= sc; j--) {
                if(sr == er){
                    break;
                }
                ans.add(a[er][j]);
            }
            //left
            for (int i = er-1; i >= sr+1; i--) {
                if(sc == ec){
                    break;
                }
                ans.add(a[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
            return ans;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(a));
    }    
}
