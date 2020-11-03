
public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList myLinkedList =  new LinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        System.out.println("******************");

        myLinkedList.printLinkedList();
        System.out.println("******************");
        myLinkedList.deleteLast();
        System.out.println("******************");
        myLinkedList.printLinkedList();
        System.out.println("******************");

    }
}
