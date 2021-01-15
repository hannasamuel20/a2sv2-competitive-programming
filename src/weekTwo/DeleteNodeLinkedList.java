package weekTwo;

public class DeleteNodeLinkedList {
    public static void main(String[] args) {
        //traverse( deleteNode(7,createLinkedList(new int[]{5,7,8,2,34})));

    }

//    public static LinkedListNode createLinkedList(int [] array){
//        LinkedListNode head = new LinkedListNode(array[0]);
//        LinkedListNode node = new LinkedListNode(array[1]);
//        head.next=node;
//
//        for (int i = 2; i <array.length ; i++) {
//            node.next=new LinkedListNode(array[i]);
//            node=node.next;
//        }
//
//        return head;
//    }
//    public static void traverse(LinkedListNode node){
//        while(node!=null){
//            System.out.println(node.value);
//            node=node.next;
//        }
//    }
//
//    public static void deleteNode(int value, LinkedListNode node){
//        LinkedListNode previousNode=null;
//        LinkedListNode nextNode=null;
//
//        while(node!=null){
//            nextNode=node.next;
//            if(previousNode==null){
//                if(node.value==value){
//                    node=node.next;
//                    break;
//                }
//                previousNode=node;
//                node=node.next;
//                continue;
//            }
//            else{
//                if(node.value==value){
//                    previousNode.next=nextNode;
//                    break;
//                }
//
//            }
//            node=node.next;
//
//        }
//    }
}
