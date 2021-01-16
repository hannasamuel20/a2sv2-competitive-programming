package contest;

import java.util.Arrays;

public class ActivityNotification {
    public static void main(String[] args) {
        System.out.println(activityNotifications(new int[]{2,3,4,2,3,6,8,4,5},5));


    }
    static int activityNotifications(int[] expenditure, int d) {
        int notifications = 0;
        int lastIndex = d-1;
        int firstIndex= 0;
        while(lastIndex<expenditure.length-1){
            int [] tempArray = new int[d];
            int i=firstIndex;
            int counter = 0;


            while(counter<tempArray.length){
                tempArray[counter]=expenditure[i];
                i++;
                counter++;
            }
            Arrays.sort(tempArray);
//            for (int a:
//                 tempArray) {
//                System.out.print(a);
//            }
//            System.out.println();


            int median = 0;
            if(d%2!=0){
                median=tempArray[tempArray.length/2]*2;
                System.out.println("mid"+median);
            }
            else{
                median=(tempArray[tempArray.length/2]+expenditure[(tempArray.length/2)-1]);
            }

//            System.out.println(expenditure[lastIndex+1]);
//            System.out.println(median+"dskj");

            if(expenditure[lastIndex+1]>=median) {
                notifications++;
            }

            lastIndex++;
            firstIndex++;
        }

return notifications;
    }
}
