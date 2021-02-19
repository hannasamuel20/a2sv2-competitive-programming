package weekTwo;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {
        System.out.print( maximumToys(new int[]{5},5));

    }
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int total=0;
        for (int i = 0; i < prices.length ; i++) {
            if(total+prices[i]>k){
                return i;
            }
            total+=prices[i];
        }
        return total;
    }

}
