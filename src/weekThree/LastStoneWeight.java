package weekThree;

import java.util.PriorityQueue;

public class LastStoneWeight {


    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }


    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i<stones.length; i++){
            heap.add((-1)*stones[i]);
        }

        while(heap.size()>1){
            int first = heap.remove();
            int second = heap.remove();
            if(first!=second){
                heap.add(-1*Math.abs(first-second));
            }


        }
        if(heap.isEmpty()){
            return 0;
        }
        return (-1)*heap.remove();
    }
}
