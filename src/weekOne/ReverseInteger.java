package weekOne;

public class ReverseInteger {
    public static void main(String[] args) {
      System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long reversedNum=0;
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x*=-1;
        }
        while(x>0){
            int temp= x%10;
            x/=10;
            reversedNum=(reversedNum*10)+temp;
        }
        if(Math.pow(-2,31)<= reversedNum&&reversedNum >= Math.pow(2,31)){
            return 0;
        }
        return isNegative?(int)reversedNum*-1:(int)reversedNum;
    }
}
