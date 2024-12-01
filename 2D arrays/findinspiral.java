import java.util.ArrayList;
import java.util.List;

public class findinspiral {
    public static int findK(int a[][],int n,int m,int k){
        List<Integer> ans  = new ArrayList<>();
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
           if(k>= 0 && k <= ans.size()){
                return ans.get(k-1);
            }
                return -1;  
    }
    public static void main(String[] args) {
        int A[][] = {{1, 2},
        {3, 4}}; 
        int N = 2, M = 2, K = 2 ;
        System.out.println(findK(A, N, M, K));
    }
}
