public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays a = new Arrays();
        a.insert(arr, 0, 1);
        a.insert(arr, 1, 2);
        a.insert(arr, 2, 3);
        a.insert(arr, 3, 4);
        a.insert(arr, 4, 5);
        a.traversal(arr);
        a.update(arr , 2 , 948);
        System.out.println("");
        a.traversal(arr);
    }
}
