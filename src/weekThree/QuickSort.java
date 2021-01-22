package weekThree;

public class QuickSort {
    public static void main(String[] args) {
        for (int n:
                ( quickSort(new int[]{7,2,1,6,8,5,3,4},0,7))) {
            System.out.println(n);
        }
    }
    public static int[] quickSort(int [] array, int low, int high){

        int pivot = partition(array,low,high);
        if(low>=high){
            return array;
        }

        quickSort(array,low,pivot);
        quickSort(array,pivot+1,high);

        return array;
    }

    public static  int partition(int [] array,int low, int high){
        int i = low;
        int j = high;

        int pivot = array[low];

        while(i<=j){

            if(array[i]>pivot && array[j]<pivot){
                System.out.println("here");
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;
            }
            else if(array[i]<=pivot){
                System.out.println("here2");
                i++;
            }
            else if(array[i]>=pivot){
                System.out.println("here3");
                j--;
            }
            else{
                System.out.println("here4");
                i++;
                j--;
            }
        }


            array[low]=array[j];
            array[j]=pivot;

        for (int a:
                array) {
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("p"+j);

        return j;
    }

}
