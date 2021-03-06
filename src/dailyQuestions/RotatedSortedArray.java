package dailyQuestions;

public class RotatedSortedArray {

    public boolean search(int[] nums, int target) {
        for(int n:nums){
            if(n==target){
                return true;
            }
        }
        return false;

    }
}
