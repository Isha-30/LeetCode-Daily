class Solution {
    public int[] findOriginalArray(int[] changed) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        if(changed.length % 2 !=0)
            return new int[]{};
        
        int[] ans = new int[changed.length/2];
        
        for(int n : changed)
            map.put(n, map.getOrDefault(n, 0)+1);
        
        Arrays.sort(changed);
        
        int count = 0, ind = 0;
        for(int n : changed){
            if(map.get(n) <= 0)
                continue;
            if(map.getOrDefault(n * 2, 0) <= 0) //not available
                return new int[]{};
            ans[ind++] = n;
            map.put(n, map.get(n) - 1);
            map.put(n*2, map.get(n*2) - 1);
        }
        return ans;
    }
}
