public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("-----------Adding elements------------");
        LinkedList list = new LinkedList();
        list.insertNode(list, 10);
        list.insertNode(list, 20);
        list.insertNode(list, 30);
        list.insertNode(list, 40);
        list.insertNode(list, 50);
        System.out.println(list);

        System.out.println("-----------Adding element at position------------");
        list.insertByPosition(list, 32, 4);
        System.out.println(list);

        System.out.println("-----------Deleting Node------------");
        list.deleteNodeByKey(list, 30);
        System.out.println(list);
    }
}