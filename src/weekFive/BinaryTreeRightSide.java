package weekFive;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSide {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        list.add(root.val);
        doDfs(root,list,1);
        return list;
    }

    public void doDfs(TreeNode node, List<Integer> list,int left){


        if(node.right==null && node.left==null){
            return;
        }
        left++;
        if(node.right!=null){
            if(left>list.size()){
                list.add(node.right.val);
            }
            doDfs(node.right,list,left);
        }
        if(node.left!=null){

            if(left>list.size()){
                list.add(node.left.val);
            }

            doDfs(node.left,list,left);
        }

    }

}
