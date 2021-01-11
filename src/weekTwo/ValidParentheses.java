package weekTwo;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));

    }
    public static boolean isValid(String s){
        int brackets=0;
        Stack<Character> openingBrackets = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                openingBrackets.push(s.charAt(i));
                brackets++;
            }
            else{
                if(openingBrackets.empty()){
                    return false;
                }
                if(s.charAt(i)==')'&&openingBrackets.pop()=='('){
                    brackets--;

                }
                else if(s.charAt(i)=='}'&&openingBrackets.pop()=='{'){
                    brackets--;
                }
                else if(s.charAt(i)==']'&&openingBrackets.pop()=='['){
                    brackets--;
                }
                else{
                    return false;
                }
            }
        }
        return (brackets==0);


    }
}
