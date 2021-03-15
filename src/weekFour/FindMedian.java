package weekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedian {
    PriorityQueue<Integer> maxHeap =  new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minHeap =  new PriorityQueue<>();

    /** initialize your data structure here. */
    public FindMedian() {

    }

    public void addNum(int num) {

        if(minHeap.size()==maxHeap.size()){
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
            maxHeap.add(minHeap.remove());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(num);
        }
        else{
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
        }

    }

    public double findMedian() {
        if(minHeap.size()==maxHeap.size()){
            return ((double)minHeap.peek()+(double)maxHeap.peek())/2;
        }
        else{
            return maxHeap.peek();
        }

    }
}
