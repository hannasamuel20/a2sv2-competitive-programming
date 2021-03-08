package weekTwo;

import java.util.Stack;

public class RemoveDuplicatesInAString {
    public String removeDuplicates(String S) {
        Stack<Character> myStack = new Stack<>();

        for (int i=0;i<S.length();i++){
            if(myStack.isEmpty()){
                myStack.add(S.charAt(i));
            }
            else{
                if((myStack.peek()).equals(S.charAt(i))){
                    myStack.pop();
                }
                else{
                    myStack.add(S.charAt(i));
                }
            }
        }
        String ans = "";
        while(!myStack.isEmpty()){
            ans=myStack.pop()+ans;
        }

        return ans;


    }
}
