package weekTwo;

import java.util.ArrayList;

public class RecentCounter {
    ArrayList<Integer> requests = new ArrayList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        requests.add(t);
        for (int i = 0; i <requests.size() ; i++) {
            if(requests.get(i)>=t-3000&&requests.get(i)<=t){
                return requests.size()-i;
            }
        }
        return 0;

    }
}
