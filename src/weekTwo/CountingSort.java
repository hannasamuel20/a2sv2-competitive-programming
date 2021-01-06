package weekTwo;

public class CountingSort {
    public static void main(String[] args) {
        for (int num: countingSort(new int [] {2,2,0,0,5,1})) {
            System.out.print(num);
        }

    }
    public static int[] countingSort(int[] array){

        int max = array[0];
        for (int num: array) {
            if(num>max){
                max=num;
            }
        }
       int [] countArray = new int [max+1];
        for (int i = 0; i <array.length ; i++) {
            int initalValue=countArray[array[i]];
            countArray[array[i]] =++initalValue;
        }
        int index = 0;
        for (int i = 0; i <countArray.length ; i++) {
            for (int j = 0; j <countArray[i] ; j++) {
                array[index]=i;
                index++;
            }
        }

        return array;
    }
}
