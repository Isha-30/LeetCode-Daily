class Solution {
    private static final int MOD=1000000007;
    public int findPaths(int m, int n, int N, int i, int j) {
        if(m<0||n<0||N<0||i<0||i>=m||j<0||j>=n){
            return 0;
        }
        Long[][][] dp=new Long[m][n][N+1];
        return (int)dfs(m,n,N,i,j,dp);
    }
    
    public long dfs(int m,int n,int N,int i,int j,Long[][][] dp){
        if(i<0||j<0||i>=m||j>=n){
            return 1;
        }
        if(N<1){
            return 0;
        }
        if(dp[i][j][N]!=null){
            return dp[i][j][N];
        }
        long down=dfs(m,n,N-1,i+1,j,dp);
        long up=dfs(m,n,N-1,i-1,j,dp);
        long left=dfs(m,n,N-1,i,j-1,dp);
        long right=dfs(m,n,N-1,i,j+1,dp);
        dp[i][j][N]=(down+up+left+right)%MOD;
        return dp[i][j][N];
    }
}
