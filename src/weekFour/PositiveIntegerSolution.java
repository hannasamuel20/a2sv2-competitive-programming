package weekFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveIntegerSolution {
    class CustomFunction{
        public int f(int x,int y){
            return 0;
        }
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> mainList = new ArrayList<>();
        for(int x=1;x <= 1000;x++){
            int y = 1;
            int last = 1000;
            while(y<=last){
                int mid = (last+y)/2;
                // System.out.println(mid);
                if(customfunction.f(x,mid) == z){
                    mainList.add(new ArrayList<Integer>(Arrays.asList(x,mid)));
                    break;
                }
                else if(customfunction.f(x,mid) > z){
                    last=mid-1;

                }
                else{
                    y=mid+1;
                }
            }

        }
        return mainList;



    }
}
