public class ReverseTheSLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            next = null;
            this.data = data;
        }
    }

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

    public void reverse() {
        Node curr = head;
        Node nextPointer = null;
        Node prevPointer = null;

        while (curr != null) {
            nextPointer = curr.next;
            curr.next = prevPointer;
            prevPointer = curr;
            curr = nextPointer;
        }
        head = prevPointer; // Update head to the new front of the list
    }

    // Reverse the SLL by groups of size K

    public Node rev(Node head, int k){
        Node curr = head;
        Node nextPtr = null;
        Node prevPtr = null;
        int count = 0;

        while(curr != null && count < k){
            nextPtr = curr.next;
            curr.next = prevPtr;
            prevPtr = curr;
            curr = nextPtr;
            count++;
        }

        if(nextPtr != null){
            head.next = rev(nextPtr, k);
        }

        return prevPtr;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseTheSLL list = new ReverseTheSLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original list:");
        list.printList();

        list.reverse();

         // Reverse in groups of size 3
        System.out.println("Reversed list:");
        list.printList();

        list.head = list.rev(list.head,3);

        System.out.println("List reversed in groups of 3:");
        list.printList();
    }
}
