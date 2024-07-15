public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {

            this.data = data;
            this.prev = this.next = null;
        }
    }

    public void addElement(int data) {

        Node currentNode = head;
        if(head == null){
            head = new Node(data);
        }
        else{
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(data);
            currentNode.next = newNode;
            newNode.prev = currentNode;

        }
    }

    public void printList() throws Exception {

        Node currentNode = head;
        if(currentNode == null) throw new Exception("Doubly Linked List is empty");
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
