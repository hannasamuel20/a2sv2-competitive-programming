package contest;

import java.util.Stack;

public class MergePoint {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }


    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Stack<SinglyLinkedListNode> first = new Stack<>();
        Stack<SinglyLinkedListNode> second = new Stack<>();

        SinglyLinkedListNode tempHead1=head1;
        SinglyLinkedListNode tempHead2=head2;

        while(tempHead1!=null){
            first.push(tempHead1);
            tempHead1=tempHead1.next;
        }
        while(tempHead2!=null){
            second.push(tempHead2);
            tempHead2=tempHead2.next;
        }
        SinglyLinkedListNode mergingPoint=null;
        while(true){

            if(first.peek()==second.peek()){
                second.pop();
                mergingPoint=first.pop();
            }
            else{
                return mergingPoint.data;
            }
        }



//        while(tempHead1!=null){
//            tempHead2=head2;
//            while(tempHead2!=null){
//                if(tempHead1==tempHead2){
//                    return tempHead1.data;
//                }
//
//                tempHead2=tempHead2.next;
//            }
//            tempHead1=tempHead1.next;
//
//        }
//        return 0;


    }
}
