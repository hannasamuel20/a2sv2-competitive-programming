package weekTen_greedy;

import java.util.Arrays;

public class MaximizeSumAfter {
    public int largestSumAfterKNegations(int[] A, int K) {
        int total = 0;
        Arrays.sort(A);
        int prev = A[0];
        for(int i=0; i<A.length; i++) {
            if (K > 0) {
                if (A[i] < 0) {
                    A[i] *= -1;
                    K--;
                } else if (K % 2 != 0) {
                    if (prev < A[i]) {
                        A[i - 1] *= -1;
                        total += 2 * A[i - 1];
                    } else {
                        A[i] *= -1;
                    }
                    K = 0;
                }
            }
            prev = A[i];
            total += A[i];
        }
        return total;
    }
}
