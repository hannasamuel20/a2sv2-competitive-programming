import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9,new int[]{10,20,20,10,10,30,50,10,20}));
    }
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> values= new HashMap<>();
        int sockCount=0;
        for(int i=0;i<n;i++){
            int val = ar[i];
            if(!values.containsKey(val)){
                values.put(val,1);
            }
            else{
                Integer oldCount = values.get(val);
                oldCount++;
                values.replace(val,oldCount);
            }
        }
        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            int socksNum = entry.getValue();
            sockCount+=socksNum/2;


        }
      return sockCount;

    }

}
