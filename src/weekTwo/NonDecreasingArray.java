package weekTwo;

public class NonDecreasingArray {
    public static void main(String[] args) {
        System.out.println("Ans "+checkPossibility(new int[]{3,2,3,2,4}));
    }


    public static boolean checkPossibility(int[] nums) {
        boolean modified=false;
        for (int i = 0; i <nums.length-2 ; i++) {
            int first=nums[i];
            int second=nums[i+1];
            int third=nums[i+2];
            if(first>second&&second>third){
                return false;
            }
            if(!modified){
                 if((first>second&&second<third&&first>third)||(first>second&&second==third)){
                    nums[i]=second;
                    modified=true;
                }
                else if((first<second&&second>third&&first<third)||(first==third&&first!=second)||(first>second&&second<third&&first<third)){
                    nums[i+1]=first;
                    modified=true;
                }
                else if((first<second&&second>third&&first>third)||(first==second&&first>third)){
                    nums[i+2]=second;
                    modified=true;
                }

            }
            else{
                if(first>second||second>third){
                    return false;
                }
            }


        }
        return true;

    }
}
