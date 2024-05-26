package stack;

public interface Stack<E> {
    public boolean isEmpty();
    public int size();
    public void push(E data);
    public E pop();
    public E peek();
}
