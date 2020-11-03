import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList {
    public class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int size;

    public LinkedList() {
        this.first = null;
        this.last=null;
        this.size=0;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void addLast(int item){
        Node node = new Node(item);
        System.out.println("adding an item: " + item);
        if(isEmpty()){
            first=last=node;
        }else {
            last.next=node;
            last=node;

        }
        size++;
    }
    public void deleteLast(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
            System.out.println("adding an item from the last");
        if(first==last){
            first=last=null;
        }else{
            Node previous = first;
            Node current = first;
            while(current.next!=null){
                    previous = current;
                    current=current.next;
            }
            previous.next=null;
            last=previous;
        }
        size--;
    }
    public void printLinkedList(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node current=first;
        while(current!=null){
            System.out.println("value: " + current.value);
            current=current.next;
        }
    }
}
