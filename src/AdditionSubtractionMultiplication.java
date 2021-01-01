import java.util.ArrayList;

public class AdditionSubtractionMultiplication {
    public static void main(String[] args) {
        //System.out.println(addition("999","1"));
        //System.out.println(multiplication("199","99"));
        //System.out.println(negativeAddition("-10005","9"));
    }

    public static String multiplication(String num1,String num2){
        String longNum="";
        String shortNum="";
        if(num1.length()>num2.length()){
            longNum=num1;
            shortNum=num2;
        }
        else{
            longNum=num2;
            shortNum=num1;
        }
        int carry=0;
        ArrayList<String> multipliedList = new ArrayList<>();
        String finalVal="0";
        for (int i = 0; i < shortNum.length(); i++) {
            String total="";
            int x=Integer.parseInt(String.valueOf(shortNum.charAt(shortNum.length()-i-1)));
            for (int j = 0; j <longNum.length() ; j++) {
                int y=Integer.parseInt(String.valueOf(longNum.charAt(longNum.length()-j-1)));
                int multiplied = (x*y)+carry;
                if(multiplied>9 && !(j==longNum.length()-1)){
                    carry = multiplied/10;
                    multiplied = multiplied%10;
                }
                else{
                    carry=0;
                }
                total=(multiplied+total);
                multipliedList.add(total);
            }
            total=String.valueOf(Integer.parseInt(total)* (int)Math.pow(10,i));
            finalVal=addition(finalVal,total);
        }
        return finalVal;
    }
    public static String addition(String num1,String num2){
        String longest = num1.length()>num2.length()?num1:num2;
        String total="";
        int carry=0;
        for (int i = 0; i <longest.length(); i++) {
            int x=0;
            int y=0;
            int indexNum1=num1.length()-i-1;
            int indexNum2=num2.length()-i-1;
            if(indexNum1<0&&indexNum2>=0){
                x=0;
                y = Integer.parseInt(String.valueOf(num2.charAt(indexNum2)));
            }
            else if(indexNum2<0&&indexNum1>=0){
                x = Integer.parseInt(String.valueOf(num1.charAt(indexNum1)));
                y=0;
            }

            else if(indexNum1>=0&&indexNum2>=0) {
                x = Integer.parseInt(String.valueOf(num1.charAt(indexNum1))) ;
                y = Integer.parseInt(String.valueOf(num2.charAt(indexNum2)));
            }
            int sum=x+y+carry;
            if(sum>9 && !(i==longest.length()-1)){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            total=sum+total;


        }

        return total;
    }

    public static String biggestInteger(String num1,String num2){
        String [] results = {"SAME","NUM1","NUM2"};
        if(num1.length()>num2.length()) {
            return results[1];
        }
        else if(num1.length()<num2.length()){
            return results[2];
        }
        else{
            for (int i = 0; i <num1.length() ; i++) {
                int x = Integer.parseInt(String.valueOf(num1.charAt(i))) ;
                int y = Integer.parseInt(String.valueOf(num2.charAt(i)));
                if(x>y){
                    return results[1];
                }
                else if(x<y){
                    return results[2];
                }
                else{
                    continue;
                }
            }
            return results[0];
        }
    }

    public static String negativeAddition(String num1,String num2){
        boolean isNum1Negative=false;
        boolean isNum2Negative=false;
        String [] bigger=new String[]{"",""};
        String [] smaller=new String[]{"",""};
        int x;
        int y;
        String finalValue="";

        if(num1.charAt(0)=='-'&& num2.charAt(0)=='-'){
            return "-"+addition(num1.substring(1,num1.length()),num2.substring(1,num2.length()));
        }
        else if(num1.charAt(0)!='-'&& num2.charAt(0)!='-'){
            return addition(num1,num2);
        }
        else{
            if(num1.charAt(0)=='-'){
                num1=num1.substring(1,num1.length());
                isNum1Negative=true;
            }
            else if(num2.charAt(0)=='-'){
                num2=num2.substring(1,num2.length());
                isNum2Negative=true;
            }
            String biggestInt=biggestInteger(num1,num2);

            if(biggestInt.equals("NUM1")){
                bigger[1]=num1;
                if(isNum1Negative){
                    bigger[0] = "-";
                }
                if(isNum2Negative){
                    smaller[0]="-";
                }
                smaller[1]=num2;
            }
            else if(biggestInt.equals("NUM2")){
                bigger[1]=num2;
                smaller[1]=num1;
                if(isNum2Negative){
                    bigger[0] = "-";
                }
                if(isNum1Negative){
                    smaller[0]="-";
                }
            }
            for (int i = 0; i <bigger[1].length() ; i++) {
                int indexBigger = bigger[1].length()-i-1;
                int indexSmaller = smaller[1].length()-i-1;
                x = Integer.parseInt(String.valueOf(bigger[1].charAt(indexBigger)));
                if(indexSmaller<0){
                    finalValue = x+finalValue;
                }
                else{
                    y = Integer.parseInt(String.valueOf(smaller[1].charAt(indexSmaller)));
                    if(x<y){
                        int borrow= Integer.parseInt(String.valueOf(bigger[1].charAt(indexBigger-1)));
                        if(borrow==0){
                            int counter=1;
                            while( Integer.parseInt(String.valueOf(bigger[1].charAt(indexBigger-counter)))==0){
                                bigger[1] = bigger[1].substring(0,indexBigger-counter)+9+ bigger[1].substring(indexBigger-counter+1,bigger[1].length());
                                counter++;

                            }
                            int replacement=(Integer.parseInt(String.valueOf(bigger[1].charAt(indexBigger-counter)))-1);
                            bigger[1] = bigger[1].substring(0,indexBigger-counter)+replacement+ bigger[1].substring(indexBigger-counter+1,bigger[1].length());

                        }
                        else{
                            borrow--;
                            bigger[1] = bigger[1].substring(0,indexBigger-1)+borrow+ bigger[1].substring(indexBigger,bigger[1].length());

                        }
                        x+=10;

                    }
                    int temp = x-y;
                    finalValue = temp+finalValue;

                }

            }

        }
        for (int i = 0; i <finalValue.length() ; i++) {
            if(finalValue.charAt(i)=='0'){
                finalValue=finalValue.replaceFirst("0","");
            }
            else{
                break;
            }
        }
        return bigger[0]+finalValue;
    }
}
