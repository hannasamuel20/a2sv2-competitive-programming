package weekThree;

import java.util.ArrayList;

public class MinimumDistanceBST {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int min = list.get(1)-list.get(0);
        for(int i=1;i<list.size()-1;i++){
            min = Math.min(min,list.get(i+1)-list.get(i));
        }
        return min;

    }
    public void inOrder(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);

    }
}
