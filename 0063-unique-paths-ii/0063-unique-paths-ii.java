class Solution {

    int helper(int[][]dp, int[][] grid, int i, int j){
        if(i<0||j<0) return 0;
        if(grid[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        return dp[i][j]=helper(dp,grid,i-1,j) + helper(dp,grid,i,j-1);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length-1, n=obstacleGrid[0].length-1;
        int[][]dp = new int[m+1][n+1];
        for(int[] i: dp) Arrays.fill(i,-1);
        return helper(dp,obstacleGrid,m,n);
    }
}