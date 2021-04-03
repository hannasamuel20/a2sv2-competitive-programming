package weekTwelve_Numerics;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i==0) sum+=i + (num/i);
        }
        return (sum==num && num!=1);
    }
}
