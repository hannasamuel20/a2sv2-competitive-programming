package weekTwo;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root=new ListNode();
        ListNode node=root;
        while(l1!=null || l2!=null){
            if(l1==null){
                node.val=l2.val;
                l2=l2.next;
            }
            else if(l2==null){
                node.val=l1.val;
                l1=l1.next;
            }
            else if(l1.val<l2.val){
                node.val=l1.val;
                l1=l1.next;
            }
            else{
                node.val=l2.val;
                l2=l2.next;
            }

            if(l1==null&&l2==null){
                return root;
            }
            node.next= new ListNode();
            node=node.next;


        }
        return null;


    }
}
