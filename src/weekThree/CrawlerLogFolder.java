package weekThree;

import java.util.Arrays;

public class CrawlerLogFolder {

    public static boolean findTriplets(int [] array, int sum){
        int first = 0;
        int last = array.length-1;

        Arrays.sort(array);

        for(int i=0;i<array.length;i++){
            first=i+1;
            while(first<last){
                if(array[i]+array[first]+array[last]>sum){
                    last--;
                }
                else if(array[i]+array[first]+array[last]<sum){
                    first++;
                }
                else{
                    System.out.println(array[i]);
                    System.out.println(array[first]);
                    System.out.println(array[last]);
                    return true;
                }

            }
        }

        return false;

    }
    public static void main(String[] args) {
        System.out.println(findTriplets(new int[]{12, 3, 9, 1, 6, 4},15));
    }

    public int minOperations(String[] logs) {
        int count = 0;
        for(int i=0; i<logs.length;i++){
            if(logs[i].equals("../")){
                if(count<=0){
                    count=0;
                }
                else{
                    count--;
                }
            }
            else if(logs[i].equals("./")){

            }
            else{
                count++;
            }
        }
        return count;

    }
}
