class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] colors = new int[n + 1];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) 
            graph.add(new ArrayList<>());

        for (int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }

        for (int i = 1; i <= n; i++) {
            if (colors[i] == 0 && !helper(graph, i, colors, 1)) 
                return false;
        }
        return true;
    }

    private boolean helper(List<List<Integer>> graph, int i, int[] colors, int color) {
        if (colors[i] == color) 
            return true;
        if (colors[i] == -color) 
            return false;
        colors[i] = color;
        for (int next : graph.get(i)) {
            if (!helper(graph, next, colors, -color))
                return false;
        }

        return true;
    }
}
