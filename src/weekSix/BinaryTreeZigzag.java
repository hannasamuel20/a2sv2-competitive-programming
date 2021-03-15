package weekSix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =  new ArrayList<>();

        if(root== null) return result;

        deque.add(root);
        list.add(root.val);
        result.add(list);

        while(!deque.isEmpty()){
            list =  new ArrayList<>();
            int size= deque.size();

            for(int i=0;i<size;i++){
                TreeNode node = deque.remove();

                if(node.right!=null){
                    list.add(node.right.val);
                    deque.add(node.right);

                }
                if(node.left!=null){
                    list.add(node.left.val);
                    deque.add(node.left);
                }

            }

            if(!list.isEmpty()){
                if(result.size()%2==0){
                    Collections.reverse(list);
                    result.add(list);
                }
                else{
                    result.add(list);
                }

            }
        }
        return result;

    }
}
