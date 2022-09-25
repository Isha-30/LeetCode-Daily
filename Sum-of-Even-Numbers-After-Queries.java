class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        int[] ans = new int[queries.length];
        
        for(int n : nums){
            if(n%2 == 0)
                sum += n;
        }
        int i = 0;
        for(int[] query : queries){
            int val = query[0];
            int idx = query[1];
            
            if(nums[idx] % 2 == 0){
                sum -= nums[idx];
            }
            
            nums[idx] += val;
            if(nums[idx] %2 == 0)
                sum += nums[idx];
            
            ans[i] = sum;
            i++;
        }
        return ans;
    }
}
