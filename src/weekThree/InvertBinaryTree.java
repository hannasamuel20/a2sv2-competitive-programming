package weekThree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return  new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }
}
