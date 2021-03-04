package weekTwo;

import java.util.ArrayList;

public class Minstack {
        ArrayList<Integer> array = new ArrayList<>();
        /** initialize your data structure here. */
        public Minstack() {

        }

        public void push(int x) {
            array.add(x);

        }

        public void pop() {
            array.remove(array.size()-1);
        }

        public int top() {
            return array.get(array.size()-1);
        }

        public int getMin() {
            int min = (int)array.get(0);
            for(int i=0; i<array.size();i++){
                if(array.get(i)<min){
                    min = array.get(i);
                }
            }

            return min;


        }


}
