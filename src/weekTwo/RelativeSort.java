package weekTwo;

import java.util.ArrayList;

public class RelativeSort {
    public static void main(String[] args) {
        for (int item: relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6})
             ) {
            System.out.print(item);
        }

    }

//    public class ValCount{
//        int val;
//        int count;
//
//    }



//    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        int [] sortedArray = new int[arr1.length];
//        ArrayList<Integer> itemsNotInArr1= new ArrayList<>();
//        int max=arr1[0];
//        for (int i = 0; i <arr1.length ; i++) {
//            if(arr1[i]>max){
//                max = arr1[i];
//            }
//            boolean isInArr1 = false;
//            for (int j = 0; j <arr2.length ; j++) {
//                if(arr2[j]==arr1[i]){
//                    isInArr1=true;
//                }
//            }
//            if(!isInArr1){
//                itemsNotInArr1.add(arr1[i]);
//            }
//        }
//        for (int i = 0; i <itemsNotInArr1.size()-1 ; i++) {
//            for (int j = i+1; j <itemsNotInArr1.size() ; j++) {
//                if(itemsNotInArr1.get(i)>itemsNotInArr1.get(j)){
//                    int temp=itemsNotInArr1.get(i);
//                    itemsNotInArr1.set(i,itemsNotInArr1.get(j));
//                    itemsNotInArr1.set(j,temp);
//                }
//            }
//        }
//
//        ValCount [] countArray= new ValCount[arr2.length+itemsNotInArr1.size()];
//
//        for (int i = 0; i < ; i++) {
//
//        }
//
//        return sortedArray;
//    }
//
//
//



    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] sortedArray = new int[arr1.length];
        ArrayList<Integer> itemsNotInArr1= new ArrayList<>();
        int index = 0;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                if(arr2[i]==arr1[j]){
                    sortedArray[index++]=arr2[i];
                }
            }
        }
        for (int i = 0; i <arr1.length ; i++) {
            boolean isInArr1 = false;
            for (int j = 0; j <arr2.length ; j++) {
                if(arr2[j]==arr1[i]){
                    isInArr1=true;
                }
            }
            if(!isInArr1){
                itemsNotInArr1.add(arr1[i]);
            }
        }
        for (int i = 0; i <itemsNotInArr1.size()-1 ; i++) {
            for (int j = i+1; j <itemsNotInArr1.size() ; j++) {
                if(itemsNotInArr1.get(i)>itemsNotInArr1.get(j)){
                    int temp=itemsNotInArr1.get(i);
                    itemsNotInArr1.set(i,itemsNotInArr1.get(j));
                    itemsNotInArr1.set(j,temp);
                }
            }
        }
        int itemsNotIndex=0;
        for (int i = index; i <sortedArray.length ; i++) {
            sortedArray[i]=(int) itemsNotInArr1.get(itemsNotIndex++);
        }
        return sortedArray;
    }
}
