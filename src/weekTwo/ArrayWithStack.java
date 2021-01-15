package weekTwo;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithStack {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},5));

    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> array = new ArrayList<>();
        int realIndex = 0;
        int fakeIndex = 0;
        while(realIndex<target.length){
            if(fakeIndex+1==target[realIndex]){
                array.add("Push");


            }
            else if(fakeIndex+1<target[realIndex]){
                array.add("Push");
                array.add("Pop");
                realIndex--;

            }
            fakeIndex++;
            realIndex++;


        }
        return array;

    }
}
