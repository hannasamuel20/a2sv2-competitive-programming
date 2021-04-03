package weekNine_prefixSum;

import java.util.ArrayList;
import java.util.Collections;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        ArrayList<Integer> productArray = new ArrayList<>();
        int [] result = new int[nums.length];
        int product = 1;

        for(int i = nums.length-1 ; i>0; i--){
            product*=nums[i];
            productArray.add(product);
        }

        Collections.reverse(productArray);
        productArray.add(1);
        int leftProduct = 1;

        for(int i=0;i<result.length;i++){

            result[i] = leftProduct*productArray.get(i);
            leftProduct*=nums[i];
        }

        return result;
    }
}
