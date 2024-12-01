// import java.util.*;
public class setzero {
    public static void setZeroes(int[][] a){
        //O(m * n) complexity space and time both 
        // HashSet<Integer> row = new HashSet<>();
        // HashSet<Integer> col = new HashSet<>();
        // for(int i = 0;i<a.length;i++){
        //     for(int j = 0;j<a[0].length;j++){
        //         if(a[i][j] == 0){
        //             row.add(i);
        //             col.add(j);
        //         }
        //     }
        // }
        // for(int i = 0;i<a.length;i++){
        //     for(int j = 0;j<a[0].length;j++){
        //         if(row.contains(i) || col.contains(j)){
        //             a[i][j] = 0;
        //         }       
        //     }
        // }
        //O(m+n) time but less time complexity
        int n = a.length;
        int m = a[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(a[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    a[i][j] = 0;
                }       
            }
        }
    }
    public static void main(String[] args) {
        int[][]  a = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(a);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }        
    }
}
