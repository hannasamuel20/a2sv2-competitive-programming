package weekFive;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class MaximumDepth {
    public int maxDepth(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return 0;
        doDfs(root,list,1);
        int max = list.get(0);
        for(int n: list){
            if(n>max){
                max=n;
            }
        }

        return max;
    }

    public void doDfs(Node node, ArrayList<Integer> list,int count){

        if(node.children.size()==0){
            list.add(count);
        }

        for(int i=0;i<node.children.size();i++){
            count++;
            doDfs(node.children.get(i),list,count);
            count--;
        }

    }
}
