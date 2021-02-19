package weekThree;

public class RangeSumBST {
    int total = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return total;
        }
        if(root.val>=low&&root.val<=high){
            total+=root.val;
        }

        total=rangeSumBST(root.left,low,high);
        total=rangeSumBST(root.right,low,high);


        return total;

    }
}
