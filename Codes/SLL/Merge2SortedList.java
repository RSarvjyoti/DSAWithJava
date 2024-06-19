public class Merge2SortedList {

    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node merge(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.data < list2.data) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Merge2SortedList list1 = new Merge2SortedList();
        Merge2SortedList list2 = new Merge2SortedList();

        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        // Merging the lists
        list1.head = list1.merge(list1.head, list2.head);

        // Printing the merged list
        list1.printList();
    }
}
