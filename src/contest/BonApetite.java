package contest;

import java.util.List;

public class BonApetite {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        Integer totalPrice=0;
        Integer totalPriceWithout=0;
        for (int i = 0; i <bill.size() ; i++) {
            if(i!=k){
                totalPriceWithout+=bill.get(i);
            }
            totalPrice+=bill.get(i);
        }
        if((totalPriceWithout/2)==b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println((totalPrice/2)-(totalPriceWithout/2));
        }

    }
}
