package Graphs;
import java.util.*;
public class dfsofgraph {
    public static void dfs(int node,boolean visited[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        visited[node] = true;
        ans.add(node);
        for(int i : adj.get(node)){
            if(!visited[i]){
                dfs(i,visited,adj,ans);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[adj.size()];
        visited[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0,visited,adj,ans);
        return ans;
    }
}
