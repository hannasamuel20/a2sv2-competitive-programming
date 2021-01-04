package weekOne;

public class  AddTwoNumbers {
    public static void main(String[] args) {
       ListNode l1= new ListNode(2,new ListNode(8,new ListNode(4)));
        ListNode l2= new ListNode(5,new ListNode(4,new ListNode(8, new ListNode(9))));
            ListNode l = addTwoNumbers(l1,l2);
            while (l != null){
                System.out.println(l.val);
                l=l.next;
            }


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head = new ListNode();
        if(l1.val+l2.val+carry>9){
            head.val=(l1.val+l2.val+carry)%10;
            carry=1;
        }
        else{
            head.val=(l1.val+l2.val+carry);
            carry=0;
        }

        ListNode node= null;
        head.next=null;
        l1=l1.next;
        l2=l2.next;

        while(l1!=null || l2!=null){
            if(head.next==null){
                head.next=new ListNode();
                node=head.next;
            }
            else{
                node.next=new ListNode();
                node=node.next;

            }

            if(l1==null && l2!=null){
                if(l2.val+carry>9){
                    node.val=(l2.val+carry)%10;
                    carry=1;
                }
                else{
                    node.val=(l2.val+carry);
                    carry=0;
                }
                l2=l2.next;
            }
            else if(l2==null && l1!=null){
                if(l1.val+carry>9){
                    node.val=(l1.val+carry)%10;
                    carry=1;
                }
                else{
                    node.val=(l1.val+carry);
                    carry=0;
                }
                l1=l1.next;
            }
            else if(l1!=null && l2!=null){
                if(l1.val+l2.val+carry>9){
                    node.val=(l1.val+l2.val+carry)%10;
                    carry=1;
                }
                else{
                    node.val=(l1.val+l2.val+carry);
                    carry=0;
                }
                l1=l1.next;
                l2=l2.next;
            }


        }

        if(carry==1&&node!=null){
            node.next=new ListNode();
            node=node.next;
            node.val=1;
        }
        else if(carry==1&&node==null){
            head.next=new ListNode();
            head.next.val=1;
        }

        return head;

    }
}



