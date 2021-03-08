package dailyQuestions;

import java.util.*;

public class FindKPairs {
    public static void main(String[] args) {

    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();


        PriorityQueue<Num1Num2> heap = new PriorityQueue<>(new Num1Num2Comparator());
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                heap.add(new Num1Num2(nums1[i],nums2[j]));
            }
        }
        int i = 0;
        while((!heap.isEmpty())&&i<k){
           Num1Num2 n= heap.remove();
            ArrayList<Integer> arr = new ArrayList<Integer>();
             arr.add(n.num1);
             arr.add(n.num2);
            list.add(arr);
            i++;
        }
        return list;
    }


}
class Num1Num2{
    int num1;
    int num2;
    int sum;
    public Num1Num2(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.sum=num1+num2;
    }

}

class Num1Num2Comparator implements Comparator<Num1Num2> {
    public int compare(Num1Num2 s1, Num1Num2 s2) {
        if (s1.sum < s2.sum)
            return 1;
        else if (s1.sum > s2.sum)
            return -1;
        return 0;
    }
}
