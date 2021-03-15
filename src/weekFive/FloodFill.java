package weekFive;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean [][] visited = new boolean [image.length][image[0].length];
        int original = image[sr][sc];
        return dfs(image,sr,sc,newColor,original,visited);
    }

    public int[][] dfs(int[][] image, int sr, int sc, int newColor,int original, boolean [][] visited){

        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length){
            return image;
        }

        if(image[sr][sc]==original && !visited[sr][sc]){
            image[sr][sc] = newColor;
            visited[sr][sc] = true;
            dfs(image,sr+1,sc,newColor,original,visited);
            dfs(image,sr-1,sc,newColor,original,visited);
            dfs(image,sr,sc-1,newColor,original,visited);
            dfs(image,sr,sc+1,newColor,original,visited);

        }



        return image;


    }
}
