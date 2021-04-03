package weekNine_prefixSum;

import java.util.HashMap;

public class SubArraySumK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int total = 0;
        int count = 0;
        for(int n:nums){
            total+=n;
            int complement = total - k;
            if(map.containsKey(complement)){
                count+=map.get(complement);
            }

            if(map.containsKey(total)){
                int val = map.get(total);
                map.replace(total,++val);
            }
            else{
                map.put(total,1);
            }

        }
        return count;



    }
}
