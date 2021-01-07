package weekTwo;

import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int [] {2,1,2}));
    }

    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int last = A.length-1;
        while(last>=2){
            int lastVal = A[last];
            int secondVal = A[last-1];
            int thirdVal = A[last-2];
            if(lastVal<secondVal+thirdVal && secondVal<lastVal+thirdVal && thirdVal<secondVal+lastVal){
                return lastVal+secondVal+thirdVal;
            }
            last--;

        }
        return 0;
    }
}
