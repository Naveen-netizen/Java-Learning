package mar26;

public class CircularLinkedList {
   public static void main(String[] args) {
    CLL list=new CLL();
    list.insertFirst(1);
    list.insertFirst(1);
    list.display();
   }
}
class CLL{
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int value;
        Node next;
        private Node(int val){
            this.value=val;
        }
        private Node(int val,Node next){
            this.value=val;
            this.next=next;
        }
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=head;
            tail.next=head;
            return;
        }
        tail.next=node;
        node.next=head;
        head=node;
        size++;
    }
    // constructor
    public CLL(){
        this.size=0;
    }
    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print("["+node.value+"]");
                if(node.next!=head){
                    System.out.print("->");
                }
                node=node.next;
            }while(node!=head);
        }
    }
}
