package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.display();
        d.RemoveFirst();
        d.display();
    }
}
