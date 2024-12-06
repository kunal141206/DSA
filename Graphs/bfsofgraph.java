package Graphs;
import java.util.*;
public class bfsofgraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
       ArrayList<Integer> ans = new ArrayList<>();
       boolean visited[] = new boolean[V];
       Queue<Integer> q = new LinkedList<>();
       q.add(0);
       visited[0] = true;
       while(!q.isEmpty()){
           int node = q.poll();
           ans.add(node);
           for(int i : adj.get(node)){
               if(!visited[i]){
                   visited[i] = true;
                    q.add(i);
               }
           }
       }
            return ans;
    }
}
