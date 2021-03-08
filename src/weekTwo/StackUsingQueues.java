package weekTwo;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> first = new LinkedList<>();
    Queue<Integer> second = new LinkedList<>();

    /** Initialize your data structure here. */
    public StackUsingQueues() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        first.add(x);

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(!first.isEmpty()){
            int val = first.poll();
            if(first.isEmpty()){
                while(!second.isEmpty()){
                    first.add(second.poll());
                }
                return val;
            }
            second.add(val);
        }

        return 0;
    }

    /** Get the top element. */
    public int top() {
        while(!first.isEmpty()){
            int val = first.poll();
            second.add(val);
            if(first.isEmpty()){
                while(!second.isEmpty()){
                    first.add(second.poll());
                }
                return val;
            }
        }


        return 0;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return first.isEmpty();
    }
}
