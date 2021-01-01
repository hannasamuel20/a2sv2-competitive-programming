import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int list[]=new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    list[0]=i;
                    list[1]=j;
                    return list;
                }
            }
        }
        return list;
    }

//    public static int[] twoSum2 (int[]nums,int target){
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        for (int num:nums) {
//         list1.add((Integer) num);
//        }
//
//       Arrays.sort(nums);
//       int index1=0;
//       int index2=nums.length-1;
//            while(true){
//                if(nums[index1]+nums[index2]==target){
//                    return new int[]{list1.indexOf(nums[index1]),list1.indexOf(nums[index2])};
//                }
//                else if(nums[index1]+nums[index2]>target){
//                    index2--;
//                    continue;
//                }
//                else if(nums[index1]+nums[index2]<target){
//                    index1++;
//                    continue;
//                }
//
//            }
//    }
}
