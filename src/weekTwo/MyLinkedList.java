package weekTwo;

public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtTail(10);
//        myLinkedList.addAtTail(20);
//        myLinkedList.addAtTail(30);
//        myLinkedList.addAtTail(40);

        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);


        myLinkedList.addAtIndex(2,0);



       System.out.println(myLinkedList.get(1)+":::::::");


        while(myLinkedList.head!=null){
            System.out.println(myLinkedList.head.data+"''''''''''''''");
            myLinkedList.head=myLinkedList.head.next;
        }
        //System.out.println(myLinkedList.get(0));


    }



    Node head;

    class Node{
        Node next;
        int data;
        Node(int data,Node next){this.next=next;
            this.data = data;}
        Node(int data){this.data=data;}
    }


    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int counter=0;
        Node node = this.head;
        while(node!=null){
            if(index==counter){
                return node.data;
            }
            node=node.next;
            counter++;

        }
        return -1;

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(this.head==null){
            this.head=new Node(val);
        }
        else{
            Node temp= this.head;
            this.head=new Node(val);
            this.head.next=temp;

        }

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        if(this.head==null){
            this.head=new Node(val);
        }
        else{
            Node node=this.head;
            while(node.next!=null){
                node=node.next;
            }
            node.next=new Node(val);
        }

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);

        }
        else{
            int counter = 0;
            Node prev=null;
            Node node = this.head;
            while(node!=null){
                if(counter==index){
                    prev.next=new Node(val,node);
                    return;
                }
                prev=node;
                node=node.next;
                counter++;
            }
            prev.next=new Node(val,node);

        }
        }


    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int counter = 0;
        Node prev = null;
        if(index==0){
            this.head=this.head.next;

        }
        else{
            Node node = this.head;
            while(node!=null){
                if(index==counter){
                    prev.next=node.next;
                }
                prev=node;
                node=node.next;
                counter++;
            }


        }
        }

}
