package weekOne;

public class Division {

    public static void main(String[] args) {
divide("864045","45");

    }
    public static void divide(String num1,String num2){
        String finalValue = "";

        int divider=Integer.parseInt(num2);

        int j=1;
        int c=0;
        while(true){
            int cutOut =Integer.parseInt(num1.substring(0,j)) ;
            if(cutOut>=divider){
               // System.out.println("cutout"+cutOut+"  divider"+divider);
                int val= cutOut/divider;
                finalValue=finalValue+val;
               // System.out.println("val"+val+"  finalval"+finalValue);
                int diff= cutOut-(val*divider);
              //  System.out.println(diff+"diffff");
                cutOut= Integer.parseInt(diff+num1.substring(j,j+1));
              //  System.out.println(j+"///////////j");
                c=cutOut;
             //   System.out.println(c+"cutout");
                break;
            }
            j++;

        }
        int counter=1;

        while(j+counter<num1.length()){

            System.out.println(c+"this c");
            while (c<divider) {

                finalValue = finalValue + "0";
                c = Integer.parseInt(c + num1.substring(j+1, j + counter));
                System.out.println(c+".................................");
                counter++;
             //   System.out.println("finalSValue: "+finalValue);


            }
            System.out.println("Here is c "+c+"here id divider "+divider);

            int val= c/divider;
            System.out.println(val+":hval");
            finalValue=finalValue+val;
            int diff= c-(val*divider);
            System.out.println(diff+":hdiff");
            System.out.println(num1.substring(j,j+1));
            c= Integer.parseInt(diff+num1.substring(j,j+1));
            //System.out.println(c+":ccccc");

            j=counter+j;
            counter=1;
        }
        System.out.println(finalValue);

        }
       // System.out.println(finalValue);
    }

