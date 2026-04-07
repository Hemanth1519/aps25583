class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class MyLinkedList {
    private Node head; // Pointer to the first node

    public MyLinkedList() {
        head = null;
    }

    // Get value at a specific index
    public int get(int index) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (count == index)
                return temp.data;
            temp = temp.next;
            count++;
        }
        return -1; // Index out of range
    }

    // Add at head
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific index
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        int count = 0;
        Node temp = head;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return; // Invalid index

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at specific index
    public void deleteAtIndex(int index) {
        if (head == null)
            return;

        if (index == 0) {
            Node temp = head;
            head = head.next;
            return;
        }

        int count = 0;
        Node temp = head;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null)
            return; // Invalid index

        temp.next = temp.next.next;
    }
}