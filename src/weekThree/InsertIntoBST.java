package weekThree;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root=new TreeNode(val);
            return root;
        }


        if(val>=root.val){
            System.out.println(root.val);
            root.right = insertIntoBST(root.right,val);

        }
        else{
            System.out.println(root.val);
            root.left = insertIntoBST(root.left,val);
        }

        return root;

    }
}
