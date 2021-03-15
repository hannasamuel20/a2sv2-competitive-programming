package weekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



    class ListNodeComparator implements Comparator<ListNode> {
        public int compare(ListNode s1, ListNode s2) {
            if (s1.val < s2.val)
                return 1;
            else if (s1.val > s2.val)
                return -1;
            return 0;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode finalNode=null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());
        for(ListNode node : lists){
            while(node!=null){
                heap.add(new ListNode(node.val));
                node=node.next;
            }
        }

        while(!heap.isEmpty()){
            if(finalNode==null){
                finalNode=new ListNode(heap.remove().val);
            }
            else{
                ListNode temp = new ListNode(heap.remove().val);
                temp.next = finalNode;
                finalNode=temp;
            }

        }
        return finalNode;
    }
}
