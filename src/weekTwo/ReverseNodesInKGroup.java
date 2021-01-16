package weekTwo;

public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        //ListNode listNode =reverseNodesInKGroup. new ListNode(1);
        ListNode listNode0 =reverseNodesInKGroup.new ListNode(1);
        ListNode listNode =reverseNodesInKGroup.new ListNode(1,reverseNodesInKGroup. new ListNode(2, reverseNodesInKGroup.new ListNode(3, reverseNodesInKGroup.new ListNode(4, listNode0))));
        ListNode listNode2 =reverseNodesInKGroup.new ListNode(1,
                reverseNodesInKGroup.new ListNode(1,
                        reverseNodesInKGroup.new ListNode(3,
                                reverseNodesInKGroup.new ListNode(1,
                                        reverseNodesInKGroup.new ListNode(2,
                                                listNode0)))));
        ListNode node =reverseNodesInKGroup.reverseKGroup(listNode,2);
//        while (node!=null){
//            System.out.println(node.val+"ppp");
//            node=node.next;
//        }

//        System.out.println(reverseNodesInKGroup.hasCycle(listNode2));


//        ListNode list =listNode0;
        System.out.println(ReverseNodesInKGroup.findMergeNode(listNode2,listNode));



    }

    ListNode listNode;
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

   public  boolean hasCycle(ListNode head) {
       ListNode firstPointer = head;
        while(firstPointer!=null){
            System.out.println("first loop");
            ListNode  secondPointer = firstPointer.next;
            while(secondPointer!=null){
                System.out.println("second loop");
                if(firstPointer.val==secondPointer.val){
                    return true;
                }
                secondPointer=secondPointer.next;
            }


            firstPointer=firstPointer.next;
        }
        return false;


    }

    public static int findMergeNode(ListNode head1, ListNode head2) {
        while(head1!=null){
            System.out.println("h: "+head1);
            while(head2!=null){
                System.out.println("h2: "+head1);
                if(head1==head2){
                    System.out.println(head1+"head1");
                    System.out.println(head2+"head2");
                    return head1.val;
                }

                head2=head2.next;
            }
            head1=head1.next;

        }
        return 0;


    }




        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode reversedFinal = null;
            ListNode reversedFinalPointer = null;
            ListNode temp = head;
            int length=0;
            while(temp!=null){
                length++;
                temp=temp.next;
            }
            int perfectBatch = length/k;
            int i = 0;
            while(i<perfectBatch){
                i++;
                ListNode reversedBit = null;
                int counter = 0;
                while(counter<k){
                    if(head==null){
                        break;
                    }
                    ListNode node = new ListNode(head.val);
                    node.next= reversedBit;
                    reversedBit=node;
                    head=head.next;
                    counter++;
                }


                while(reversedBit!=null){
                    if(reversedFinal==null){
                        reversedFinal= new ListNode(reversedBit.val);
                        reversedFinalPointer=reversedFinal;
                        reversedBit=reversedBit.next;
                    }
                    else{
                        reversedFinalPointer.next=new ListNode(reversedBit.val);
                        reversedBit=reversedBit.next;
                        reversedFinalPointer=reversedFinalPointer.next;

                    }

                }

            }
            while(length%k>0){
                reversedFinalPointer.next= new ListNode(head.val);
                reversedFinalPointer=reversedFinalPointer.next;
                head=head.next;
                length--;

            }
            return reversedFinal;

    }
}
