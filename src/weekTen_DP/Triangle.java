package weekTen_DP;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <  triangle.get(triangle.size()-1).size(); i++){
            result.add(triangle.get(triangle.size()-1).get(i));
        }
        int size = result.size();
        for(int i=triangle.size()-1; i>0; i--){
            for(int j=0; j<size-1; j++){
                if(result.get(j)<result.get(j+1)){
                    result.set(j,triangle.get(i-1).get(j)+result.get(j));
                }
                else{
                    result.set(j,triangle.get(i-1).get(j)+result.get(j+1));
                }
            }
            size--;
        }
        return result.get(0);


        // Manipulating the input

//         for(int i=triangle.size()-1; i>0; i--){
//             for(int j=0; j<triangle.get(i).size()-1;j++){
//                 if(triangle.get(i).get(j)<triangle.get(i).get(j+1)){
//                     triangle.get(i-1).set(j,triangle.get(i-1).get(j)+triangle.get(i).get(j));
//                 }
//                 else{
//                      triangle.get(i-1).set(j,triangle.get(i-1).get(j)+triangle.get(i).get(j+1));
//                 }
//             }

//         }
//         return triangle.get(0).get(0);

    }
}
