package stack;

public class SinglyLinkedListStack<E> implements Stack<E> {

    private SinglyLinkedList1<E> s = new SinglyLinkedList1<>();

    public SinglyLinkedListStack() {
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public int size() {
        return s.size();
    }

    @Override
    public void push(E data) {
        s.add_First(data);
    }

    @Override
    public E pop() {
        return s.removeFirst();
    }

    @Override
    public E peek() {
        return s.getFirst();
    }

}
