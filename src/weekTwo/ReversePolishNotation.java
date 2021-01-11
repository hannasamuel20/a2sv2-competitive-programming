package weekTwo;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        Integer top=0;
        Integer secondTop=0;
        for (int i = 0; i <tokens.length ; i++) {
            String token = tokens[i];
            if(token.equals("+")){
                nums.push(nums.pop()+nums.pop());
            }
            else if(token.equals("*")){
                nums.push(nums.pop()*nums.pop());
            }
            else if(token.equals("/")){
                top=nums.pop();
                secondTop=nums.pop();
                nums.push(secondTop/top);
            }
            else if(token.equals("-")){
                top=nums.pop();
                secondTop=nums.pop();
                nums.push(secondTop-top);
            }
            else{
                nums.push(Integer.parseInt(token));
            }
        }
        return nums.pop();
    }
}
