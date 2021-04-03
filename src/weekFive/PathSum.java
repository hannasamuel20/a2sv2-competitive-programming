package weekFive;

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return  doDfs(root,targetSum,0);

    }

    public boolean doDfs(TreeNode node, int targetSum, int actualSum){
        if (node==null){
            return false;
        }
        actualSum+=node.val;
        if(node.left==null && node.right==null){
            return targetSum == actualSum;
        }

        boolean left=  doDfs(node.left,targetSum,actualSum);
        boolean right =  doDfs(node.right,targetSum,actualSum);

        return left||right;

    }
}
