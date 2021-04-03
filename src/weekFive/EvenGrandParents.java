package weekFive;

public class EvenGrandParents {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root);

    }
    public int dfs(TreeNode grandParent){

        if(grandParent==null){
            return 0;
        }

        int total = 0;
        TreeNode leftParent = grandParent.left;
        TreeNode rightParent = grandParent.right;

        if(grandParent.val%2==0){
            if(leftParent != null){
                if(leftParent.left != null){
                    total+=leftParent.left.val;
                }
                if(leftParent.right != null){
                    total+=leftParent.right.val;
                }
            }
            if(rightParent != null){
                if(rightParent.left != null){
                    total+=rightParent.left.val;

                }
                if(rightParent.right != null){
                    total+=rightParent.right.val;
                }

            }
        }

        total+=dfs(grandParent.left)+dfs(grandParent.right);
        return total;
    }

}
