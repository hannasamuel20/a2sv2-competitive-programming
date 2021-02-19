package weekThree;

public class BinarySearch {

    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length);


    }

    public int helper(int[] nums, int target, int start,int end){
        if(start==end)return -1;
        int mid = (start+end)/2;


        if(target==nums[mid]) return mid;
        if (target>nums[mid]){
            return helper(nums,target,mid+1,end);
        }
        if (target<nums[mid]){
            return helper(nums,target,start,mid);
        }

        return -1;

    }

}
