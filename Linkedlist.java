public class Linkedlist {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(5);
        list.insertLast(0);
        list.insertAt(0, 3);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }

}

class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public LL() {
        this.size = 0;
    }

    // Inserting a node at the 0th index
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Inserting a node at last index
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
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
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
        return;
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

    // retriving the node containing the value
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

    // displaying the entire list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.value + "]" + "-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
}