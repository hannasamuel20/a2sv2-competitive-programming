package weekTwo;

public class BubbleSort {
    public static void main(String[] args) {
        for (int item:bubbleSort(new int[]{5,1,4,9,3,2})) {
            System.out.println(item);
        }

    }
    public static int[] bubbleSort(int []array){

        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

}
