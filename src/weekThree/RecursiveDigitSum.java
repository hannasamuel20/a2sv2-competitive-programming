package weekThree;

public class RecursiveDigitSum {

    public static void main(String[] args) {
       System.out.println("Ans"+superDigitRecur("148",3));

    }

    static int superDigitRecur(String n, int k) {
        int total = (int)helper(n,0);
        return (int)helper(((total*k)+""),0);

    }
    static long helper(String n, int index){
        long val = 0;
        while(index<n.length()){
            val+=Character.getNumericValue(n.charAt(index));
            index++;
        }
        if (val>9){
            n=val+"";
            val= helper(n,0);

        }
        return val;
    }


    static int superDigitIter(String n, int k) {
        int index = 0;
        int total = 0;
        boolean multi = false;
        while(n.length()>1){
            System.out.println(total);
            if(index==n.length()&&!multi&&total<=9){
                n=(total*k)+"";
                total=0;
                index=0;
                multi=true;
            }


            if(index==n.length()){
                n=total+"";
                total=0;
                index=0;
            }
            total+=Character.getNumericValue(n.charAt(index));
            index++;

        }

        return total;


    }
}
