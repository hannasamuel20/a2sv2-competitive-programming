package weekSix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {

        ArrayDeque<ArrayList<Integer>> queue = new ArrayDeque<>();
        int innerSize = grid[0].length;
        int outerSize = grid.length;
        boolean [][] visited = new boolean[outerSize][innerSize];

        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    visited[i][j]=true;
                    queue.add(new ArrayList<Integer>(Arrays.asList(i,j)));

                }
            }
        }

        int count = -1;
        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i=0; i<size; i++){
                ArrayList<Integer> orange = queue.remove();
                ArrayList<Integer> left = new ArrayList<>(Arrays.asList(orange.get(0),orange.get(1)-1));
                ArrayList<Integer> right =new ArrayList<>(Arrays.asList(orange.get(0),orange.get(1)+1));
                ArrayList<Integer> top = new ArrayList<>(Arrays.asList(orange.get(0)-1,orange.get(1)));
                ArrayList<Integer> bottom =new ArrayList<>(Arrays.asList(orange.get(0)+1,orange.get(1)));

                if(left.get(1)>=0 && !visited[left.get(0)][left.get(1)]){
                    if(grid[left.get(0)][left.get(1)] == 1){
                        grid[left.get(0)][left.get(1)]=2;
                        queue.add(left);
                    }
                    visited[left.get(0)][left.get(1)]=true;


                }
                if(right.get(1)<innerSize && !visited[right.get(0)][right.get(1)]){
                    if(grid[right.get(0)][right.get(1)] == 1){
                        grid[right.get(0)][right.get(1)]=2;
                        queue.add(right);
                    }
                    visited[right.get(0)][right.get(1)]=true;

                }

                if(top.get(0)>=0 && !visited[top.get(0)][top.get(1)]){
                    if(grid[top.get(0)][top.get(1)] == 1){
                        grid[top.get(0)][top.get(1)]=2;
                        queue.add(top);
                    }
                    visited[top.get(0)][top.get(1)]=true;
                }


                if(bottom.get(0)<outerSize && !visited[bottom.get(0)][bottom.get(1)]){
                    if(grid[bottom.get(0)][bottom.get(1)] == 1){
                        queue.add(bottom);
                        grid[bottom.get(0)][bottom.get(1)]=2;
                    }
                    visited[bottom.get(0)][bottom.get(1)]=true;

                }


            }
            count++;

        }
        boolean allZero =true;
        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){
                    return -1;
                }
                else if(grid[i][j]!=0){
                    allZero = false;
                }
            }
        }

        return allZero?0:count;


    }
}
