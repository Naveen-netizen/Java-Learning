package mar26;

public class DoublyLinedList {
    public static void main(String[] args) {
        DBLL list = new DBLL();
        list.insertFirst(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertAt(3, 3);
        list.insertAt(4, 4);
        list.insertAfter(4, 5);
        list.insertAfter(0, 1);
        list.display();
    }
}

class DBLL {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public DBLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.prev = tail;
        if (tail != null) {
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
        size += 1;
    }

    // Inserting a node at a particular index
    public void insertAt(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp, temp.next);
        temp.next = node;
        size++;
        return;
    }

    public void insertAfter(int after, int val) {
        Node node = new Node(val);
        Node p = find(after);
        if(p==null){
            System.out.println("Value doesn't exist");
            return;
        }
        node.next = p.next;
        if (p.next != null) {
            p.next.prev = node;
        }
        p.next = node;
        node.prev=p;

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
     // retriving a node at a particular index
     private Node get(int index) {
        if (index == 0) {
            return head;
        }
        if (index == size - 1) {
            return tail;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
     // deleting 1st node
     public int deleteFirst() {
        int val = head.value;
        head = head.next;
        return val;
    }

    // deleting last node
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node previousNode = get(size - 2);
        previousNode.next = null;
        tail = previousNode;
        return val;
    }

    // deleting a node at aparticular index
    public int deleteNode(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prevNode = get(index - 1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        return val;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print("[" + node.value + "]");
            if (node.next != null) {
                System.out.print("<->");
            }
            node = node.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print("[" + node.value + "]");
            if (node.prev != null) {
                System.out.print("<->");
            }
            node = node.prev;
        }
        System.out.println();

    }
}
