package weekTwo;

public class SelectionSort {
    public static void main(String[] args) {
        for (int item:selectionSort(new int[]{5,1,4,9,3,2})) {
            System.out.println(item);
        }

    }

    public static int[] selectionSort(int[]array){
        for (int i = 0; i <array.length ; i++) {
            int min=array[i];
            int index=i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<min){
                    min = array[j];
                    index= j;
                }

            }
            int temp=array[i];
            array[i]=min;
            array[index]=temp;
        }
        return array;
    }
}
