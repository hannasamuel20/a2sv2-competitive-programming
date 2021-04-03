package weekTen_DP;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        int max = 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,dfs(nums,i,memo));
        }
        return  max;
    }

    public int dfs(int[]nums, int index, int[] memo){
        int max = 0;
        int val =nums[index];
        if(memo[index]==-1) {
            for(int i = index+2; i<nums.length; i++){
                max = Math.max(dfs(nums,i,memo),max);
            }
            memo[index] = val+max;
        }
        return memo[index];
    }
}
