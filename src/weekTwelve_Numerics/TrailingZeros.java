package weekTwelve_Numerics;

public class TrailingZeros {
    public int trailingZeroes(int n) {
        int total = 0;
        for(int i = 5; i<=n;i*=5){
            total+=n/i;
        }
        return total;
    }
}
