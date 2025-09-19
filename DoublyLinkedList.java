public class DoublyLinkedList<E> {
    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    Node<E> head;
    Node<E> tail;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getLength()
    {
        return size;
    }

    public void addToFront(E val){
        Node<E> newNode = new Node<>(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        size++;
    }

    public E removeFromFront()
    {
        if (head == null)
        {
            return null;
        }
        Node<E> toRemove = head;
        E value = toRemove.getValue();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }

        size--;
        return value;
    }

    public void addToEnd(E val)
    {
        Node<E> newNode = new Node<>(val);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public E removeFromEnd()
    {
        if (tail == null)
        {
            return null;
        }
        Node<E> toRemove = tail;
        E value = toRemove.getValue();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }

        size--;
        return value;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public String toString()
    {
        String result = "[";
        Node<E> cur = head;
        if(cur != null)
        {
            while(cur.getNext() != null)
            {
                result += cur.getValue() + ", ";
                cur = cur.getNext();
            }
        }
        else {
            result += "]";
            return result;
        }
        result += cur.getValue() + "]";
        return  result;
    }
}
