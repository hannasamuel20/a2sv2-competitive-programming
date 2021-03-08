package dailyQuestions;

import java.util.ArrayList;

public class KPairsWithSmallestPairs {
    public int kthSmallest(TreeNode root, int k) {
        return traverse(root,new ArrayList<>()).get(k-1).val;
    }
    public ArrayList<TreeNode> traverse (TreeNode node, ArrayList<TreeNode> array){
        if(node==null){
            return array;
        }
        traverse(node.left,array);
        System.out.println(node.val);
        array.add(node);
        traverse(node.right,array);

        return array;




    }

}

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
