package weekThree;

public class MaximumBinaryTree {

    public static TreeNode leftRight(int[] array, int start, int end) {
        if(start==end){
            return null;
        }
        int maxx = array[start];
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i] > maxx) {
                maxx = array[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(maxx);
        node.left = leftRight(array,start,index);
        node.right = leftRight(array,index+1,end);

        return node;
    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return leftRight(nums,0,nums.length);

    }
}
