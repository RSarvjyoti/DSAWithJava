public class PrintSLLinReverse {
    Node head;

    class Node{
        int data;
        Node next;

        Node (int data){
            next = null;
            this.data = data;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void traverseAndPrint() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printReverse(Node head){
        if(head == null) return;
        else{
            printReverse(head.next);
            System.out.print(head.data + " ");
        }
    }

    public static void main(String[] args) {
        PrintSLLinReverse linkedList = new PrintSLLinReverse();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        
        linkedList.printReverse(linkedList.head);


    }
}
