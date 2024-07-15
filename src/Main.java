public class Main {
    public static void main(String[] args) throws Exception {

        // Singly LinkedList
        System.out.println(".......................................");
        System.out.println("-----------Adding elements------------");
        LinkedList sinList = new LinkedList();
        sinList.insertNode(sinList, 10);
        sinList.insertNode(sinList, 20);
        sinList.insertNode(sinList, 30);
        sinList.insertNode(sinList, 40);
        sinList.insertNode(sinList, 50);
        System.out.println(sinList);

        System.out.println("-----------Adding element at position------------");
        sinList.insertByPosition(32, 4);
        System.out.println(sinList);

        System.out.println("-----------Deleting Node------------");
        sinList.deleteNodeByKey(sinList, 30);
        System.out.println(sinList);

        System.out.println("-----------Deleting Node by Pos------------");
        sinList.deleteByPosition(3);
        System.out.println(sinList);
        System.out.println(".......................................");

        //Doubly LinkedList
        System.out.println(".......................................");
        DoublyLinkedList doubList = new DoublyLinkedList();
        doubList.addElement(12);
        doubList.addElement(22);
        doubList.addElement(32);
        doubList.printList();
        System.out.println(".......................................");
        doubList.deleteElement(22);
        doubList.printList();
        System.out.println(".......................................");

        /*

        Output:
        .......................................
        12
        22
        32
        .......................................
        12
        32
        .......................................
         */
    }
}