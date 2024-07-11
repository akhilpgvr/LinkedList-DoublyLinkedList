public class LinkedList {

    //head
    Node head;

    public void insertNode(LinkedList list, int data) {

        //insert if head is empty
        if(list.head == null) {
            list.head = new Node(data);
            System.out.println("Added new node to head");
        }
        else{

            Node currentNode = list.head;
            while(currentNode.next!=null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
            System.out.println("Added new node to body");
        }
    }

    public void insertByPosition(int data, int pos) throws Exception {

        Node currentNode = head;
        Node previousNode  = head;
        int counter = 1;

        if(pos == 1) {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
            System.out.println("Added new node to head");
            return;
        }
        while(currentNode!=null && counter<=pos) {

            if(counter==pos) {
                Node newNode = new Node(data);
                newNode.next = currentNode;
                previousNode.next = newNode;
                System.out.println("Added new node to body");
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
            System.out.println("Removed head");
        }else{
            while(currentNode!=null && currentNode.data!=key){
                previousNode = currentNode;
                currentNode=currentNode.next;
                System.out.println("Traversing through linkedList");
            }
            if(currentNode != null) {
                previousNode.next = currentNode.next;
                System.out.println("Removed element");
                return;
            }
            throw new Exception("Invalid key: "+ key);
        }
    }

    public void deleteByPosition(int pos) throws Exception {


        Node currentNode = head;
        Node previousNode = head;
        int counter = 1;

        if(pos == 1) {

            head = currentNode.next;
            System.out.println("Removed head");
        }
        else {

            while (currentNode!=null && counter<=pos) {

                if(counter == pos){

                    previousNode.next = currentNode.next;
                    System.out.println("Removed element");
                    return;
                }
                else {

                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    counter+=1;
                    System.out.println("Traversing through linkedList");
                }
            }

            throw new Exception("Invalid pos: "+ pos);
        }
    }
}
