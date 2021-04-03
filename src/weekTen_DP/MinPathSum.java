package weekTen_DP;

import java.util.Arrays;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int [][] memo = new int[grid.length][grid[0].length];
        for(int[] array: memo){
            Arrays.fill(array,-1);
        }
        return dfs(grid,memo,0,0);

    }
    public int dfs(int[][] grid, int[][]memo , int i, int j){
        if(i>=grid.length || j>=grid[0].length) return 0;

        if(memo[i][j]!=-1)  return memo[i][j];

        else if(i == grid.length-1){
            memo[i][j] =grid[i][j] + dfs(grid,memo,i,j+1);
        }
        else if(j == grid[0].length-1){
            memo[i][j]= grid[i][j] + dfs(grid,memo,i+1,j);
        }
        else{
            int down = grid[i][j] + dfs(grid,memo,i+1,j);
            int right = grid[i][j] + dfs(grid,memo,i,j+1);
            memo[i][j]=Math.min(right,down);
        }
        return memo[i][j];
    }
}
