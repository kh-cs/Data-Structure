package doublylinkedlist;

public class DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(head, null, null);
        head.setNext(tail);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public E getFirstElement() {
        if (isEmpty()) {
            return null;
        }
        return head.getNext().getData();
    }

    public E getLastElement() {
        if (isEmpty()) {
            return null;
        }
        return tail.getPrev().getData();
    }

    private void addBetween(Node<E> prev, E data, Node<E> next) {
        Node<E> newNode = new Node<>(prev, data, next);
        prev.setNext(newNode); // head
        next.setPrev(newNode); // head.getNext()
        size++;
    }

    public void AddFirst(E data) {
        addBetween(head, data, head.getNext());
    }

    public void addLast(E data) {
        addBetween(tail.getPrev(), data, tail);
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "<---->");
            temp = temp.getNext();
        }
        System.out.println("");
    }

    private E Remove(Node<E> deletedNode) {
        Node<E> prev = deletedNode.getPrev();
        Node<E> next = deletedNode.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return deletedNode.getData();
    }

    public E RemoveFirst() {
        if (isEmpty()) {
            return null;
        }
        return Remove(head.getNext());
    }

    public E RemoveLast() {
        if (isEmpty()) {
            return null;
        }
        return Remove(tail.getPrev());
    }

    private class Node<E> {

        private Node<E> prev;
        private E data;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
