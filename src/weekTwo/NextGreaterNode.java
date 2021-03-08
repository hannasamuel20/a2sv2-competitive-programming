package weekTwo;

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int [] array = new int[count];
        temp= head;
        int i=0;
        while(temp.next!=null){
            int highest = 0;
            ListNode compare = temp.next;
            while(compare!=null){
                if(compare.val>temp.val){
                    highest=compare.val;
                    break;
                }
                compare=compare.next;
            }
            array[i]=highest;
            i++;
            temp=temp.next;
        }
        return array;
    }
}
