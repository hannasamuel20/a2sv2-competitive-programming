package weekThree;

import java.util.ArrayList;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
//          if(root == null) return true;
//         boolean left = isValidBST(root.left);
//         boolean right = isValidBST(root.right);


//         return left && right && check(root);

        ArrayList<Integer> list = inOrder(root,new ArrayList<Integer>());
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;

    }

//     public boolean check(TreeNode node){
//         if(node==null) return true;
//         if(node.left!=null && node.right!=null){
//             if(node.val>node.left.val && node.val<node.right.val){
//                 return true;
//             }
//             return false;
//         }
//         if(node.left!=null){
//             if(node.val>node.left.val){
//                 return true;
//             }
//             return false;

//         }
//         if(node.right!=null){
//              if(node.val<node.right.val){
//                 return true;
//             }
//             return false;

//         }
//         return true;

//     }


    public ArrayList<Integer> inOrder(TreeNode node, ArrayList<Integer> list){
        if(node==null){
            return list;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);

        return list;


    }
}
