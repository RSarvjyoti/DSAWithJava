// Linked List class
class LL1 {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        // Constructor to create new node
        Node(int d) {
            next = null;
            data = d;
        }
    }

    // ************************ Insertion ************************

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to insert e new node at the bignning of the linked list

    public void addBignningElm(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // Method to insert e new node at the before particular element of the linked
    // list
    public void insertBeforeParticular(int newData, int exitingData) {
        Node newNode = new Node(newData);
        // Case: List is empty
        if (head == null) {
            return;
        }

        // Insert before head
        if (head.data == exitingData) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to find the node before which the new node should be
        // inserted
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data != exitingData) {
            prev = curr;
            curr = curr.next;
        }

        // Case: Existing node not found
        if (curr == null) {
            return;
        }

        // Insert the new node before the existing node
        prev.next = newNode;
        newNode.next = curr;

    }

    // Method to insert e new node at the after particular element of the linked
    // list

    public void insertAfterParticular(int newData, int existingData) {
        Node newNode = new Node(newData);
        // Case: List is empty
        if (head == null) {
            return;
        }

        // Find the node with exiting data
        Node curr = head;
        while (curr != null && curr.data != existingData) {
            curr = curr.next;
        }

        // existingData not found in the list
        if (curr == null) {
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // *************************** DELETION ***************************

    // Delete at bignning SLL

    public void deleteNodeFromBignning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete at the end SLL

    public void deleteNodeFromEnd() {
        // The list is empty, nothing to delete
        if (head == null)
            return;

        if (head.next == null) {
            // The list has only one node, delete it
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // Delete at the particular SLL
    public void deleteParticularNode(int value) {
        // The list is empty, nothing to delete
        if (head == null)
            return;

        if (head.data == value) {
            // The node to be deleted is the head
            head = head.next;
            return;
        }

        // The list has more than one node
        Node curr = head;
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        // If we found the node to be deleted
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Delete at the before particular SLL
    public void deleteBeforeParticular(int value) {
        if (head == null || head.next == null) {
            // The list is empty or has only one node, nothing to delete
            return;
        }

        if (head.next.data == value) {
            // The head is the node before the one with the specified value
            head = head.next;
            return;
        }

        // Traverse the list to find the node before the node before the target value
        Node prev = head;
        Node current = head.next;
        while (current.next != null && current.next.data != value) {
            prev = current;
            current = current.next;
        }

        // If we found the node before the one with the specified value
        if (current.next != null) {
            prev.next = current.next;
        }
    }

    // Delete at the after particular SLL

    public void deleteAfterParticular(int value) {
        if (head == null || head.next == null) {
            // The list is empty or has only one node, nothing to delete
            return;
        }

        // Traverse the list to find the node with the specified value
        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }

        // If we found the node with the specified value and it has a next node
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to traverse the linked list and print the data
    public void traverseAndPrint() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL1 linkedList = new LL1();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.addBignningElm(10);

        linkedList.insertBeforeParticular(7, 3);

        linkedList.insertAfterParticular(20, 3);

        // Deleting the Node
        linkedList.deleteNodeFromBignning();

        linkedList.deleteNodeFromEnd();

        linkedList.deleteParticularNode(7);

        linkedList.deleteBeforeParticular(3);

        linkedList.deleteAfterParticular(3);

        linkedList.traverseAndPrint();
    }

}
