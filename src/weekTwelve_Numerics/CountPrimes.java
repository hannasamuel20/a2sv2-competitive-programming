package weekTwelve_Numerics;

public class CountPrimes {
    public int countPrimes(int n) {
        if(n==0||n==1)return 0;
        boolean[] isNotPrime = new boolean[n+1];
        isNotPrime[0]=true;
        isNotPrime[1]=true;
        int trueCount = 2;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(!isNotPrime[i]){
                for(int j=i*i; j<n; j+=i){
                    if(!isNotPrime[j]){
                        trueCount++;
                        isNotPrime[j]=true;
                    }

                }
            }
        }
        return n-trueCount;
    }
}
