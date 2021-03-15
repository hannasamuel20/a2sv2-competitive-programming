package weekFour;

public class FirstBadVersion {
    public boolean isBadVersion(int n){
        return true;
    }
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(last>first){
            int mid = first+(last-first)/2;
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }else{
                    last=mid;
                }
            }else{
                if(isBadVersion(mid+1)){
                    return mid+1;
                }
                else{
                    first=mid;
                }
            }
        }
        return 1;


    }
}
