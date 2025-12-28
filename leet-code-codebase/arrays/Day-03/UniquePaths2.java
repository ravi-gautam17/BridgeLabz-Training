class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
             Arrays.fill(row,-1);
        }
        return uniqueHelper(m-1,n-1,dp,obstacleGrid);
    }
    static int uniqueHelper(int i,int j,int[][] dp,int[][] matrix){
        if(i<0||j<0){
            return 0;
        }
         if(matrix[i][j]==1){
            return 0;
        }
        if(i==0&&j==0){
            return 1;
        }
       
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int x=uniqueHelper(i-1,j,dp,matrix);
        int y=uniqueHelper(i,j-1,dp,matrix);
        dp[i][j]=x+y;
        return x+y;
    }
}