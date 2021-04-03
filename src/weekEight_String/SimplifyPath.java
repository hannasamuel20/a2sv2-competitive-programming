package weekEight_String;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {

        String [] list = path.split("/");
        Stack<String> stack = new Stack<>();
        String ans = "";

        for(String s: list){
            if(!s.equals("")){
                if(s.equals("..")&&!stack.isEmpty()){
                    stack.pop();
                }
                if(!(s.equals(".") || s.equals(".."))){
                    stack.push(s);
                }
            }
        }

        while(!stack.isEmpty()){
            ans="/"+stack.pop()+ans;
        }

        return ans.equals("")?"/":ans;

    }
}
