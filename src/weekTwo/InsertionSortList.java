package weekTwo;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode node = new ListNode(head.val);
        ListNode temp = node;
        head=head.next;

        while(head!=null){
            while(temp!=null){
                if(temp.val>head.val){
                    ListNode newNode = new ListNode(head.val);
                    newNode.next=node;
                    node=newNode;
                    break;
                }
                else if(temp.next==null){
                    temp.next=new ListNode(head.val);
                    temp=temp.next;
                    break;
                }
                else if(temp.val <= head.val && temp.next.val>=head.val){
                    ListNode last = temp.next;
                    temp.next= new ListNode(head.val);
                    temp=temp.next;
                    temp.next=last;
                    break;
                }

                temp=temp.next;
            }
            temp=node;
            head = head.next;

        }
        return node;

    }
}
