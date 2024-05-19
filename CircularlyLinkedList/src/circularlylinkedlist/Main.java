package circularlylinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> c = new CircularlyLinkedList<>();
        c.addFirst(1);
        c.addFirst(2);
        c.addFirst(3);
        c.display();
    }
}
