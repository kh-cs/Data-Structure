package stack;


public class SinglyLinkedList1<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add_First(E element) {
        head = new Node<>(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
//       Node<E> newNode = new Node<E>(element , head);
//       head = newNode;
    }

    public void add_Last(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (size == 0) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void addOnPosition(E element, int position) {
        Node<E> newNode = new Node<>(element, null);
        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.getNext();
                count++;
            }
            Node<E> current = temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(current);
        }
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        }
        return head.getElement();
    }

    public E getLast() {
        if (size == 0) {
            return null;
        }
        return tail.getElement();
    }

    public void display() {
        Node<E> i = head;
        while (i != null) {
            System.out.print(i.getElement()+" ---> ");
            i = i.getNext();
        }
        System.out.print("null");
        System.out.println();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E deleted = head.getElement();
        head = head.getNext();
        size--;
        if(size==0){
            tail = null;
        }
        return deleted;
    }

    private static class Node<E> {

        private E element;
        private Node<E> next; //link - pointer

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
