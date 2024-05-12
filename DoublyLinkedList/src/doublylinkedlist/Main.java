package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        System.out.println(d.getFirst());
        d.display();
    }
}
