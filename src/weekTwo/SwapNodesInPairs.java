package weekTwo;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode();
        ListNode temp = node;
        int i =1;
        while(head != null){
            if(i%2 != 0){
                int prev=  (head.val);
                ListNode nextNode = head.next;
                if(nextNode==null){
                    temp.val=prev;
                    return node;
                }
                temp.val=nextNode.val;
                temp.next=new ListNode(prev);
                temp=temp.next;
                if(nextNode.next==null){
                    return node;
                }
                temp.next = new ListNode();
                temp=temp.next;
            }

            i++;
            head=head.next;
        }

        return null;

    }
}
