class MinimumPathSum {
    public int minPathSum(int[][] grid) {
         int m=grid.length;
         int n=grid[0].length;
         int[][] dp=new int[m][n];
         for(int[] row:dp){
            Arrays.fill(row,-1);
         }
         return recursiveCode(m-1,n-1,grid,dp);


    }
    static int recursiveCode(int i,int j,int[][] grid,int[][] dp){
          if(i<0||j<0){
            return Integer.MAX_VALUE;
          }
          if(i==0&&j==0){
              return grid[0][0];
          }
          if(dp[i][j]!=-1){
            return dp[i][j];
          }
          int x=recursiveCode(i-1,j,grid,dp);
          int y=recursiveCode(i,j-1,grid,dp);

          int val=Math.min(x,y);
          dp[i][j]=val+grid[i][j];
          return dp[i][j];

    }
}