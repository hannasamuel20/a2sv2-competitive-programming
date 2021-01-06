package weekTwo;

public class InsertionSort {
    public static void main(String[] args) {
        for (int item:insertionSort(new int[]{5,1,20,4,9,3,10})) {
            System.out.println(item);
        }

    }

    public static int[] insertionSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int index=i;
            for (int j = i-1; j >=0; j--) {
                int index2=j;
                //System.out.println(array[j]+"..."+array[index]);
                if(index>=0 && array[j]>array[index]){
                    int temp=array[j];
                    array[j]=array[index];
                    array[index]=temp;
                    index=index2;
                }

            }
            //  System.out.print(array[index]+"...");
            for (int item:array) {
                System.out.print(item);
            }
            System.out.println();
        }
        return array;
    }



}

