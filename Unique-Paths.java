class Solution {
    public int uniquePaths(int A, int B) {
        int[][] dp= new int[A][B];
        for(int i = 0; i<A; i++){
            for(int j = 0; j<B; j++){
                dp[i][j] = -1;
            }
        }
        return helper(0, 0, A, B, dp);
    }
    private int helper(int stX, int stY, int eX, int eY, int[][] dp){
        //out of bounds
        if(stX>=eX || stY >= eY)
            return 0;
        if(stX==eX-1 && stY == eY-1)
            return 1;
        
        //value already exits
        if(dp[stX][stY] != -1)
            return dp[stX][stY];
        else
            dp[stX][stY] = helper(stX+1, stY, eX, eY, dp) + helper(stX, stY+1, eX, eY, dp);
        
        return dp[stX][stY];
    }
}
