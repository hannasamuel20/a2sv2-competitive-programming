package weekTwo;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> firstStack = new Stack<Integer>();
    Stack<Integer>secondStack = new Stack<Integer>();

    /** Initialize your data structure here. */
    public QueueUsingStack() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        firstStack.add(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!firstStack.isEmpty()){
            secondStack.add(firstStack.pop());
        }
        int val = secondStack.pop();

        while(!secondStack.isEmpty()){
            firstStack.add(secondStack.pop());
        }
        return val;

    }

    /** Get the front element. */
    public int peek() {
        while(!firstStack.isEmpty()){
            secondStack.add(firstStack.pop());
        }
        int val = secondStack.peek();

        while(!secondStack.isEmpty()){
            firstStack.add(secondStack.pop());
        }
        return val;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return firstStack.isEmpty();

    }
}
