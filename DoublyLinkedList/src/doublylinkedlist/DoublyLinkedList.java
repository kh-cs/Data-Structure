package doublylinkedlist;

public class DoublyLinkedList<E> {

    public Node<E> head;
    public Node<E> tail;
    public int size;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null); // data - previous - next
        tail = new Node<>(null, head, null); // data - previous - next
        head.setNext(tail);
        size = 0;
    }

    public boolean isEmrty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public E getFirst() {
        if (isEmrty()) {
            return null;
        }
        return head.getNext().getData();
    }
    public E getLast() {
        if (isEmrty()) {
            return null;
        }
        return tail.getPrevious().getData();
    }
    
    public void addBetween(E data , Node<E> prevNode , Node<E> nextNode){
        Node<E> newNode = new Node<>(data,prevNode,nextNode);
        prevNode.setNext(newNode);
        nextNode.setPrevious(newNode);
        size++;
    }
    
    public void addFirst(E data){
        addBetween(data, head, head.getNext());
    }
    
    public void addLast(E data){
        addBetween(data, tail.getPrevious(), tail);
    }
    
    public void display(){
        System.out.print("null <--- head <--->");
        Node<E> temp = head.getNext();
        while(temp.getData()!=null){
            System.out.print(temp.getData()+"<--->");
            temp = temp.getNext();
        }
        System.out.print("tail ---> null");
        System.out.println();
    }
    
    public class Node<E> {

        E data;
        Node<E> previous;
        Node<E> next;

        public Node(E data, Node<E> previous, Node<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
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
