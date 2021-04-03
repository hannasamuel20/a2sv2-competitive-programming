package weekFive;

public class SurroundedRegions {
    public void solve(char[][] board) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1){
                    exploreEdges(board,visited,i,j);
                }
            }
        }

        for(int i = 1; i<board.length-1; i++){
            for(int j = 1; j<board[0].length-1;j++){
                if(board[i][j]=='O' && !visited[i][j]){
                    board[i][j]='X';
                }
            }
        }

    }

    public void exploreEdges(char[][] board,boolean[][] visited,int row ,int column){
        int[][] directions = new int[][]{new int[]{0,1},new int[]{1,0}, new int[]{-1,0},new int[]{0,-1},};
        if(row<0 || column<0 || row>=board.length || column>=board[0].length || visited[row][column] ){
            return;
        }
        visited[row][column] = true;
        if(board[row][column] =='O'){
            for(int[] direction: directions){
                exploreEdges(board,visited,row+direction[0],column+direction[1]);
            }
        }

    }
}
