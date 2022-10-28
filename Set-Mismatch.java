class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int max = 0;
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
            if(map.get(n) == 2)
                ans[0] = n;
            max = Math.max(max, n);
        }
        for(int i = 1; i<=max+1; i++){
            if(!map.containsKey(i)){
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
