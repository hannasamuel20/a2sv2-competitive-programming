package weekFour;

public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        int [] arr = new int[]{-1,-1};

        while(first<=last){
            int mid = (first+last)/2;
            if(nums[mid]==target){
                if(mid==0||nums[mid-1]!=target){
                    arr[0]=mid;
                    break;
                }
                else{
                    last=mid-1;
                }

            }else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                first=mid+1;
            }

        }
        first = 0;
        last = nums.length-1;

        while(first<=last){
            int mid = (first+last)/2;
            if(nums[mid]==target){
                if(mid==last||nums[mid+1]!=target){
                    arr[1]=mid;
                    break;
                }
                else{
                    first=mid+1;
                }

            }else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                first=mid+1;
            }

        }


        return arr;

    }
}
