package weekFour;

public class NegativeNumsInAMatrix {
    public int countNegatives(int[][] grid) {

        int negativeCount = 0;

        for(int [] array : grid){
            int first = 0;
            int last = grid[0].length-1;
            while(first<=last){
                int mid =(first+last)/2;
                if(array[mid]<0){
                    if(mid==0 || array[mid-1]>=0){
                        negativeCount+= grid[0].length - mid;
                        break;
                    }
                    else{
                        last = mid-1;
                    }
                }
                else{
                    first = mid+1;
                }

            }

        }
        return negativeCount;



    }
}
