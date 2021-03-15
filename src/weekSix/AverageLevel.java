package weekSix;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class AverageLevel {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list  = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int length = 1;
        double average = 0;
        while(!deque.isEmpty()){
            int size = deque.size();
            average = 0;
            length = 1;
            for(int i=0;i<size;i++){
                TreeNode node = deque.remove();
                average += (node.val - average) / length;
                ++length;
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }

            }
            list.add(average);

        }

        return list;





    }
}
