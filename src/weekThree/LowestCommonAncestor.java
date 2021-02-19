package weekThree;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if (p.val < q.val){
            return helper(root,p,q);
        }
        return helper(root,q,p);

    }

    public TreeNode helper(TreeNode node, TreeNode p, TreeNode q){
        if (p.val<=node.val && q.val>=node.val){
            return node;
        }
        else if(p.val<=node.val && q.val<=node.val){
            return helper(node.left,p,q);
        }
        else if(p.val>=node.val && q.val>=node.val){
            return helper(node.right,p,q);
        }

        return null;




    }
}
