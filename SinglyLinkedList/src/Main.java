public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> s_linkedlist = new SinglyLinkedList<>();
        s_linkedlist.add_First(1);
        s_linkedlist.add_First(2);
        s_linkedlist.add_First(3);
        s_linkedlist.add_First(4);
        s_linkedlist.add_First(5);
        s_linkedlist.display();
        s_linkedlist.addOnPosition(100, 3);
        System.out.println("============");
        s_linkedlist.display();
    }
}
