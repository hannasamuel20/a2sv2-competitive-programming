package weekNine_slidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    public int totalFruit(int[] tree) {
        int start = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<tree.length; i++){
            if(map.size()<2 && !map.containsKey(tree[i])){
                map.put(tree[i],1);
            }
            else if(map.containsKey(tree[i])){
                map.replace(tree[i],map.get(tree[i])+1);
            }
            else{
                while(true){
                    map.replace(tree[start], map.get(tree[start])-1);
                    if(map.get(tree[start])==0){
                        map.remove(tree[start]);
                        map.put(tree[i],1);
                        start++;
                        break;
                    }
                    start++;
                }
            }
            max = Math.max(max,i-start+1);
        }
        return max;

    }
}
