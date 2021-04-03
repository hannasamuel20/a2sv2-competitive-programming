package weekFive;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    area = dfs(grid,visited,i,j);
                    if(area>maxArea){
                        maxArea=area;
                    }
                }
            }

        }

        return maxArea;
    }

    public int dfs(int[][] grid,boolean[][] visited, int row, int column){
        if(row >= grid.length || row < 0 || column >= grid[0].length || column < 0){
            return 0;
        }

        int found = 0;
        if(grid[row][column] == 1 && !visited[row][column]){
            found = 1;
            visited[row][column] = true;
            found+=dfs(grid,visited,row+1,column);
            found+=dfs(grid,visited,row-1,column);
            found+=dfs(grid,visited,row,column-1);
            found+=dfs(grid,visited,row,column+1);
        }

        return found;
    }
}
