public class LinkedList {

    Node head;

    public void insertNode(LinkedList list, int data) {

        //insert if head is empty
        if(list.head == null) {
            list.head = new Node(data);
        }
        else{

            Node currentNode = list.head;
            while(currentNode.next!=null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    public void insertByPosition(LinkedList list, int data, int pos) throws Exception {

        Node currentNode = head;
        Node previousNode  = head;
        int counter = 1;

        if(pos == 1) {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
            return;
        }
        while(currentNode!=null && counter<=pos) {

            if(counter==pos) {
                Node newNode = new Node(data);
                newNode.next = currentNode;
                previousNode.next = newNode;
                return;
            }
            else{
                previousNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
        throw new Exception("Invalid Position: "+pos);
    }

    public void deleteNodeByKey(LinkedList list, int key) throws Exception {

        Node previousNode = head;
        Node currentNode = list.head;
        if(list.head.data == key) {
            head = head.next;
        }else{
            while(currentNode!=null && currentNode.data != key){
                previousNode = currentNode;
                currentNode=currentNode.next;
            }
            if(currentNode!=null) {
                previousNode.next = currentNode.next;
                return;
            }
            throw new Exception("Invalid key: "+ key);
        }
    }

    public void deleteByPosition(int pos) {

    }
}
