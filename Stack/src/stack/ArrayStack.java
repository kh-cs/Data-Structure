package stack;

public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int capacity;
    private int t;

    public ArrayStack() {
        capacity = 10;
        arr = (E[]) new Object[capacity];
        t = -1;
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        arr = (E[]) new Object[capacity];
        t = -1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public void push(E data) {
        if (size() == arr.length) {
            System.out.println("The Stack is Full ...");
        } else {
            arr[++t] = data;
        }
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E deletedElement = arr[t];
        arr[t] = null;
        return deletedElement;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[t];
    }

}
