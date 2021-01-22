package weekThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencySort {
    public static void main(String[] args) {
        for (int n: frequencySort(new int[]{2,3,1,3,2})) {
            System.out.println("n= "+n);
        }
    }

    public static int[] frequencySort(int[] nums) {
        int [] newArray = new int[nums.length];
        int max = nums[0];
        int min = nums[0];
        for (int n:
                nums) {
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        int arrayLength = min<0 ? max+1+(-1*min) : max+1;
        int increment = min<0 ? min*-1 : 0;
        int [] sortArray = new int[arrayLength];
        for (int i = 0; i <nums.length ; i++) {
            sortArray[nums[i]+increment]=++ sortArray[nums[i]+increment];
        }

        int counter = 0;
        int i=0;
        while(i<sortArray.length){
            int maximum =sortArray[0];
            int index=0;
            for (int j = 1; j < sortArray.length ; j++) {
                if(sortArray[j]>maximum){
                    maximum = sortArray[j];
                    index= j;
                }
            }
            counter+=maximum;
            for (int j = newArray.length-1-(counter-maximum); j >=newArray.length-counter; j--) {
                newArray[j]=index-increment;

            }
            sortArray[index]=0;
            i++;
        }
        return newArray;
    }
}
