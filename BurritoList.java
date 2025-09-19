public class BurritoList {
    public static void main(String[] args) {
        Burrito burrito1 = new Burrito();
        Burrito burrito2 = new Burrito("large", "chicken", "white", "black", "lettuce", true);
        Burrito burrito3 = new Burrito("large", "steak", "brown", "brown", "cheese", false);
        Burrito burrito4 = new Burrito("small", "steak", "no", "no", "salsa", true);

        System.out.println("Burrito Class linkedlist method test begins below:");
        DoublyLinkedList<Burrito> burritoList = new DoublyLinkedList<>();
        System.out.println(burritoList);
        burritoList.addToFront(burrito1);
        System.out.println(burritoList);
        burritoList.addToFront(burrito2);
        System.out.println(burritoList);
        burritoList.addToEnd(burrito3);
        System.out.println(burritoList);
        burritoList.addToEnd(burrito4);
        System.out.println(burritoList);
        burritoList.removeFromFront();
        System.out.println(burritoList);
        burritoList.removeFromEnd();
        System.out.println(burritoList);
        burritoList.clear();
        System.out.println(burritoList);
    }
}
