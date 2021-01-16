package weekTwo;

public class ReversedLinkedList {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode reverseList(ListNode head) {
            ListNode reversedList = null;
            while(head!=null){
                ListNode node = new ListNode(head.val);
                node.next=reversedList;
                reversedList=node;
                head=head.next;
            }
            return reversedList;

        }

}
