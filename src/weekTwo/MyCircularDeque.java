package weekTwo;

import java.util.ArrayList;

public class MyCircularDeque {
    int size;
    ArrayList<Integer> myDeque = new ArrayList<>();
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.size = k;

    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(myDeque.isEmpty()){
            myDeque.add(value);
            return true;
        }
        if(size==myDeque.size()){
            return false;
        }
        int lastVal = myDeque.get(myDeque.size()-1);
        int prev=myDeque.get(0);
        myDeque.set(0,value);
        for(int i=1;i<myDeque.size();i++){
            int temp = myDeque.get(i);
            myDeque.set(i,prev);
            prev=temp;
        }

        myDeque.add(lastVal);
        return true;

    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size==myDeque.size()){
            return false;
        }
        myDeque.add(value);
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(myDeque.isEmpty()){
            return false;
        }
        myDeque.remove(0);
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(myDeque.isEmpty()){
            return false;
        }
        myDeque.remove(myDeque.size()-1);
        return true;

    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(myDeque.isEmpty()){
            return -1;
        }
        return myDeque.get(0);

    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(myDeque.isEmpty()){
            return -1;
        }
        return myDeque.get(myDeque.size()-1);

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return myDeque.isEmpty();

    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == myDeque.size();
    }
}
