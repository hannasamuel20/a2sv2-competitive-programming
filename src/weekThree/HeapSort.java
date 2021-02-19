package weekThree;

import java.util.ArrayList;

public class HeapSort {

    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        heap.insert(1);
        heap.insert(9);
        heap.insert(3);
        heap.insert(5);
        heap.insert(4);
        heap.insert(7);
      //  heap.insert(-1);

        System.out.println(heap.array);
        heap.pop();
       // System.out.println(heap.array);


    }


}

class MyHeap{
    ArrayList<Integer> array = new ArrayList<>();

    public void insert(int val){
        array.add(val);
        int childIndex = array.size()-1;
        int parentIndex = (childIndex-1)/2;
        int childVal = val;
        int parentVal = array.get(parentIndex);
        while(parentVal>childVal){
            array.set(parentIndex,val);
            array.set(childIndex,parentVal);
            childIndex=parentIndex;
            childVal=array.get(childIndex);
            parentIndex=(childIndex-1)/2;
            parentVal=array.get(parentIndex);

        }

    }
    public int pop(){
        int val = array.get(0);
        int last = array.get(array.size()-1);
        System.out.println("last"+last);
        array.set(0,last);
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i=0;i<array.size()-1;i++){
            newArray.add(array.get(i));
        }
        array=newArray;


        return val;
    }

    public void reOrder(){
        int moveIndex =0;
        int move = array.get(moveIndex);

        while(move>array.get((2*moveIndex)+1)||move>array.get((2*moveIndex)+2)){
            if(move>array.get((2*moveIndex)+1)&&move>array.get((2*moveIndex)+2)){
                if(array.get((2*moveIndex)+1)>array.get((2*moveIndex)+2)){

                }
                else{

                }
            }
        }
    }


}
