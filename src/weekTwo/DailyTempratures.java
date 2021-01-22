package weekTwo;

public class DailyTempratures {
    public static void main(String[] args) {
        dailyTemperatures(new int[]{73,74,75,99,69,72,76,73});
    }

    public static int[] dailyTemperatures(int[] T) {
        int [] warmer = new int[T.length];

        int k = 0;
        boolean isFound = false;

        for(int i = 0; i<T.length-1;i++){
            for(int j =i+1; j<T.length;j++){
                if(T[j]>T[i]){
                    warmer[k]=j-i;
                    k++;
                    isFound = true;
                    break;
                }
            }
            System.out.println(isFound);
            if(!isFound){
                warmer[k]=0;
                k++;
            }
            isFound=false;
        }
        return warmer;

    }
}
