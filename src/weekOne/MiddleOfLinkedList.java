package weekOne;

import weekOne.ListNode;

public class MiddleOfLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow= head;
        while(fast.next!=null){
            if(fast.next.next==null){
                slow=slow.next;
                break;

            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }



}
