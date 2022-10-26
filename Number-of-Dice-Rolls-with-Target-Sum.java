class Solution {
    int mod = (int)(1e9+7);
    public int numRollsToTarget(int d, int f, int target) {
        if(target >  f*d)
            return 0;
        int[][] dp = new int[d+1][target+1];
        dp[0][0] = 1;
        for(int i=1;i<=d;i++){
            for(int j=1;j<=target;j++){
                int curr_target = j;
                int count = 0;
                for(int face=1;face<=f;face++){
                    if(curr_target-face < 0)
                        break;
                    count = (count+dp[i-1][curr_target-face])%mod;
                }
                dp[i][j] = count;
            }
        }
        return dp[d][target];
    }
}
