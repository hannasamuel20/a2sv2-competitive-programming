package weekThree;

public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        return helper(root)[0];


    }

    public int[] helper(TreeNode node){

        if (node==null){
            return new int[]{0,-1};
        }

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        if(left[1]>=right[1]){
            left[1]=left[1]+1;
            if(node.right==null && node.left==null) left[0] = node.val;
            return left;
        }

        right[1]=right[1]+1;
        if(node.right==null && node.left==null) right[0] = node.val;
        return right;






    }
}
