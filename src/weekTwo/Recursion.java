package weekTwo;

public class Recursion {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(fibbonacci(10));
         //fibbo(10);
       // System.out.println(rep("?1???2???3???1?"));
       // System.out.println(rep("??1"));
        System.out.println(solution(0,new int[]{}));
    }

    public static int factorial(int num){
        if(num<0){
            return 0;
        }
        if(num==0){
            return 1;
        }

        return(num*factorial(num-1));
    }
    public static int fibbonacci(int n){
        if(n<=1){
            return n;
        }
        return fibbonacci(n-2)+fibbonacci(n-1);
    }
    public static void fibbo(int n){
        int initial=0;
        int second=1;
        int total=0;
        while(n-2>0){
            total=initial+second;
            System.out.println(total);
            initial=second;
            second=total;
            n--;
        }
    }

    public static String rep(String str){
        char [] strArray = str.toCharArray();
        char left='3';
        char right=' ';
        for (int i = 0; i <strArray.length ; i++) {
            if(i==strArray.length-1){
                right='3';
            }
            else{
                right=strArray[i+1];
            }
            if(strArray[i]=='?'){
                if(left=='1'){
                    if(right=='2'){
                        strArray[i]='3';
                    }
                    else{
                        strArray[i]='2';
                    }

                }
                else if(left=='2'){
                    if(right=='1'){
                        strArray[i]='3';
                    }
                    else{
                        strArray[i]='1';
                    }

                }
                else if(left=='3'){
                    if(right=='1'){
                        strArray[i]='2';
                    }
                    else{
                        strArray[i]='1';
                    }

                }

            }
            left=strArray[i];
        }
        str="";
        for (char charac:strArray) {
            str=str+charac;
        }

        return str;
    }

    public static String solution(int N, int[] A) {
        char [] chars = new char[N];
        for (int i = 0; i <chars.length ; i++) {
            chars[i]='-';
        }

        for (int i = 0; i <A.length ; i++) {
                chars[A[i]]='+';


        }

        String str="";
        for (char c:chars) {
            str=str+c;
        }
        return  str;
    }
}
