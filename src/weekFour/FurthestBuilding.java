package weekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FurthestBuilding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<heights.length-1;i++){
            int height= (heights[i+1]-heights[i]);

            if(height>0){

                if(bricks>=height){
                    heap.add(height);
                    bricks=bricks-height;
                }
                else if(ladders>0){
                    if(!heap.isEmpty()&&height<=heap.peek()){
                        bricks+=heap.remove()-height;
                        heap.add(height);
                    }
                    ladders--;

                }
                else{
                    return i;
                }
            }

        }
        return heights.length-1;

    }

}
