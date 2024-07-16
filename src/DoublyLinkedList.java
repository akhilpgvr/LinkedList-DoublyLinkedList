public class DoublyLinkedList {

    Node head;
    Node tail;

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
            head = tail = new Node(data);
        }
        else{
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(data);
            currentNode.next = newNode;
            newNode.prev = currentNode;
            tail = newNode;

        }
    }

    public void deleteElement(int data) {

        if(head.data == data) {
            head = head.next;
            if(head == null) tail =null;
            System.out.println("Deleted Element");
        }
        Node currentNode = head;
        Node previousNode = head;
        while(currentNode!=null) {
            if(currentNode.data == data) {
                Node nextNode = currentNode.next;
                previousNode.next = currentNode.next;
                if(nextNode == null) tail=nextNode;
                else nextNode.prev = previousNode;
                return;
            }
            else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
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
