package weekThree;

public class Try {

    public static void main(String[] args) {
        leftRight(new int[]{1,3,2,9,4,5,6},0,7);
    }

    public static void leftRight(int[] array, int start, int end) {
        if(start==end){
            return;
        }
        int maxx = array[start];
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i] > maxx) {
                maxx = array[i];
                index = i;
            }
        }
        System.out.println("max: "+maxx);
        leftRight(array,start,index);
        leftRight(array,index+1,end);
    }


    public void constructMaximumBinaryTree(int[] nums) {

    }


}
