package weekFive;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean [][] isVisited =new boolean [isConnected.length][isConnected.length];
        int count = 0;

        for(int i=0;i<isConnected.length;i++){
            if(!isVisited[i][0]){
                doDfs(isConnected,isVisited,i);
                count++;
            }

        }
        return count;

    }
    public void doDfs(int [][] isConnected, boolean[][] isVisited,int goTo){
        for(int i=0;i<isConnected.length;i++){
            isVisited[goTo][i] = true;
            if(!isVisited[i][goTo] && isConnected[goTo][i]==1 && goTo!=i){
                doDfs(isConnected,isVisited,i);
            }
        }

    }
}
