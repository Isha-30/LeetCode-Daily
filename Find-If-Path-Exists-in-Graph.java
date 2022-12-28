class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return hasPath(adj, source, destination, visited);
    }
    
    private boolean hasPath(ArrayList<ArrayList<Integer>> adj, int src, int des, boolean[] visited){
        if(src == des)
            return true;
        
        visited[src] = true;
        
        for(int edge : adj.get(src)){
            if(visited[edge] == false){
                boolean path = hasPath(adj, edge, des, visited);
                if(path)
                    return true;
            }
        }
        return false;
    }
}
