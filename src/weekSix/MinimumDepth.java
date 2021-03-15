package weekSix;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
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

public class MinimumDepth {
    public int minDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        if(root==null) return 0;
        int count = 0;
        deque.add(root);
        while(!deque.isEmpty()){
            count++;
            int size = deque.size();
            for(int i=0; i<size;i++){
                TreeNode node = deque.remove();
                if(node.left==null && node.right==null){
                    return count;
                }
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }

            }


        }
        return count;

    }
}
