package weekTen_DP;

import java.util.Arrays;

public class ClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int [] memo = new int[cost.length];
        Arrays.fill(memo,-1);
        int step1 = dfs(cost,0,memo);
        int step2 = dfs(cost,1,memo);
        return Math.min(step1,step2);

    }
    public int dfs(int [] cost, int index,int[] memo){
        if(index>=cost.length){
            return 0;
        }
        else{
            if (memo[index] == -1) {
                int step1 = cost[index] + dfs(cost, index + 1, memo);
                int step2 = cost[index] + dfs(cost, index + 2, memo);
                memo[index] = Math.min(step1, step2);

            }
            return memo[index];

        }
    }
}
