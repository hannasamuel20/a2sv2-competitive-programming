package weekSix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {

        ArrayDeque<Integer[]> queue = new ArrayDeque<>();
        int innerSize = grid[0].length;
        int outerSize = grid.length;
        boolean [][] visited = new boolean[outerSize][innerSize];

        int zeros = 0;
        int ones = 0;
        int [][] directions = new int[][]{new int[]{0,1},new int[]{1,0}, new int[]{-1,0}, new int[]{0,-1}};

        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    visited[i][j]=true;
                    queue.add(new Integer [] {i,j});
                }
                else if(grid[i][j]==0){
                    zeros++;
                }
                else{
                    ones++;
                }
            }
        }
        int count = -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0; k<size; k++){
                Integer[] orange = queue.remove();
                for(int[] direction: directions){
                    int i = orange[0]+direction[0];
                    int j = orange[1]+direction[1];
                    if(i>=0 && i<outerSize && j>=0 && j<innerSize && !visited[i][j]&&grid[i][j] == 1){
                        ones--;
                        queue.add(new Integer[]{i,j});
                        visited[i][j]=true;
                    }

                }
            }
            count++;
        }
        return zeros==outerSize*innerSize?0:ones>0?-1:count;


    }
}
