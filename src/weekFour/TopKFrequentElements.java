package weekFour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    class Freq{
        int frequency;
        int value;
        public Freq(int frequency,int value){
            this.frequency=frequency;
            this.value=value;
        }
    }
    class FreqComparator implements Comparator<Freq> {
        public int compare(Freq s1, Freq s2) {
            if (s1.frequency < s2.frequency)
                return 1;
            else if (s1.frequency > s2.frequency)
                return -1;
            return 0;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int [] array =  new int[k];
        PriorityQueue<Freq> heap =  new PriorityQueue<>(new FreqComparator());
        Arrays.sort(nums);
        int count=1;
        if(nums.length==1){
            heap.add(new Freq(count,nums[0]));
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(i+1==nums.length-1){
                    heap.add(new Freq(count,nums[i+1]));

                }
            }
            else{
                heap.add(new Freq(count,nums[i]));
                count=1;
                if(i+1==nums.length-1){
                    heap.add(new Freq(count,nums[i+1]));

                }

            }

        }

        int j=0;
        while(j<k && !heap.isEmpty()){
            array[j]=heap.remove().value;
            j++;
        }
        return array;

    }
}
