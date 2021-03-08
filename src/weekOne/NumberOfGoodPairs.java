package weekOne;

import java.util.Arrays;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int val = nums[0];
        int count = 1;
        int total = 0;
        for(int i=1;i<nums.length;i++){

            if(val==nums[i]){
                count++;
            }
            else{
                System.out.println(findSum(count-1));
                total=total+findSum(count-1);
                count = 1;
                val = nums[i];
            }
            System.out.println(nums[i]+", "+total+", "+count);

        }
        total=total+findSum(count-1);
        return total;


    }
    public int findSum(int n){
        int total = 0;
        while(n>0){
            total = total+n;
            n--;
        }
        return total;
    }

    public int numIdenticalPairs2(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;

    }
}
