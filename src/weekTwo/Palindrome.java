package weekTwo;

public class Palindrome {
    ListNode listNode;
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head){
        ListNode reversedList = null;
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            ListNode node = new ListNode(temp.val);
            node.next=reversedList;
            reversedList=node;
            temp=temp.next;
        }
        int halfLength=length/2;
        while(halfLength>0){
            if(head.val!=reversedList.val){
                return false;
            }
            head=head.next;
            reversedList=reversedList.next;
            halfLength--;
        }
        return true;


    }
}
