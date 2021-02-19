package contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    public static void main(String[] args) {

        for (int n:
                icecreamParlor(6, new int[]{6,5,3,2,1}) ) {
            System.out.println(n);

        }
    }
    // Complete the icecreamParlor function below.

    static int[] icecreamParlor(int m, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }

        Arrays.sort(arr);
        int first=0;
        int last=arr.length-1;
        Integer val1=0;
        Integer val2=0;
        while(first<last){
            if(arr[first]+arr[last]==m){
                val1= arr[first];
                val2= arr[last];
                break;
            }
            else if(arr[first]+arr[last]>m){
                last--;
            }
            else{
                first++;
            }

        }
        for (Map.Entry<Integer,Integer> entry:
             map.entrySet()) {
           if(entry.getValue().equals(val1)){
               map.remove(entry.getKey());
               first=entry.getKey();
               break;
           }
        }
        for (Map.Entry<Integer,Integer> entry:
                map.entrySet()) {

             if(entry.getValue().equals(val2)){
                map.remove(entry.getKey());
                last=entry.getKey();
                break;

            }
        }
        if(first<last) return new int[]{first,last};
        return new int[]{last+1,first};


    }
}
