package weekThree;

public class MergeSort {
    public static void main(String[] args) {
        for (int n:mergeSort(new int[]{300,8,7,15,12,41,2,31,100},0,8)
             ) {
            System.out.println(n);

        }


    }


    public static int[] mergeSort(int [] array, int start, int end){
        if(start==end){
            return array;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        array=sort(array,start,mid,end);
        return array;
    }

    public static int[] sort(int[]array,int start,int middle,int end){
        int left = start;
        int right = middle+1;
        int [] tempLeft = new int[middle+1-start];
        int [] tempRight = new int[end-middle];
        int i=0;
        while(i<tempLeft.length){
            tempLeft[i]=array[left];
            left++;
            i++;
        }
        i=0;
        while(i<tempRight.length){
            tempRight[i]=array[right];
            right++;
            i++;
        }
        i=start;
        int j=0;
        int k=0;
        while(i<end+1){
            if(j>=tempLeft.length){
                array[i] = tempRight[k];
                k++;
            }
            else if(k>=tempRight.length){
                array[i] = tempLeft[j];
                j++;
            }
            else if(tempLeft[j]<=tempRight[k]){
                array[i] = tempLeft[j];
                j++;
            }
            else if(tempLeft[j]>tempRight[k]){
                array[i] = tempRight[k];
                k++;
            }
            i++;
        }



        return array;

    }
}
