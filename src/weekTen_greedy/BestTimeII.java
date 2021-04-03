package weekTen_greedy;

public class BestTimeII {
    public int maxProfit(int[] prices) {
        int first=0;
        int second=1;
        int total=0;
        while(second<prices.length && first<prices.length){
            if(prices[first]<prices[second]){
                total+=prices[second]-prices[first];
            }
            first++;
            second++;
        }
        return total;

    }
}
