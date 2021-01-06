package weekTwo;

public class CountingSort2 {
    static int[] countingSort(int[] arr) {
        int max = arr[0];
        for (int num: arr) {
            if(num>max){
                max=num;
            }
        }
        int [] countArray = new int [max+1];
        for (int i = 0; i <arr.length ; i++) {
            int initalValue=countArray[arr[i]];
            countArray[arr[i]] =++initalValue;
        }
        int index = 0;
        for (int i = 0; i <countArray.length ; i++) {
            for (int j = 0; j <countArray[i] ; j++) {
                arr[index]=i;
                index++;
            }
        }
        for(int item:arr){
            System.out.print(item+" ");
        }

        return arr;

    }
}
