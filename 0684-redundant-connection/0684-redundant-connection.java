class Solution {
    int n;
    
    public boolean bfs(Map<Integer, List<Integer>> mp, int start, int end) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        
        while (!que.isEmpty()) {
            int curr = que.poll();
            visited[curr] = true;
            if (curr == end) return true;
            
            for (int x : mp.get(curr)) {
                if (!visited[x]) {
                    que.offer(x);
                }
            }
        }
        return false;
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        n = edges.length;
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            
            if (mp.containsKey(u) && mp.containsKey(v) && bfs(mp, u, v)) {
                return edge;
            }
            
            mp.putIfAbsent(u, new ArrayList<>());
            mp.putIfAbsent(v, new ArrayList<>());
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        return new int[0];
}
}