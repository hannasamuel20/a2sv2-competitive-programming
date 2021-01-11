package weekTwo;

public class LinkedListNode {
    int value;
    LinkedListNode next;
    LinkedListNode(){

    }
    LinkedListNode(int value){
        this.value=value;
    }
    LinkedListNode(int value,LinkedListNode next){
        this.value=value;
        this.next=next;
    }
}
