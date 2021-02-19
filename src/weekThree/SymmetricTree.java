package weekThree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameTree(root.left,root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q==null) return false;

        return p.val == q.val && isSameTree(p.right, q.left) && isSameTree(p.left, q.right);
    }

}
