public class ListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>  list = new DoublyLinkedList<>();
        System.out.println(list);
        list.addToFront(1);
        System.out.println(list);
        list.addToFront(2);
        System.out.println(list);
        list.addToEnd(3);
        System.out.println(list);
        list.addToEnd(4);
        System.out.println(list);
        list.removeFromFront();
        System.out.println(list);
        list.removeFromEnd();
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.removeFromEnd();
        System.out.println(list);
    }
}
