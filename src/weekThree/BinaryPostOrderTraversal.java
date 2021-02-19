package weekThree;

import java.util.ArrayList;
import java.util.List;

public class BinaryPostOrderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        list = postorderTraversal(root.left);
        list = postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
