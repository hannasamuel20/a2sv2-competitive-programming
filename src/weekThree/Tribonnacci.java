package weekThree;

public class Tribonnacci {

    public static void main(String[] args) {
        System.out.println(trib(25));
    }

    public static int trib(int n){
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int total = 0;
        if(n==t0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        while(n>2){
            total = t0+t1+t2;
            t0 = t1;
            t1 = t2;
            t2 = total;
            n--;
        }
        return total;

    }
    public static int tribRecur(int n){
        return 0;

    }
}
