package coursera.doubleimpl;

public class MyLinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public MyLinkedList() {
        this.head = new ListNode<>(null);
        this.tail = new ListNode<>(null);
        this.size = 0;
        this.head.setNext(this.tail);
        this.tail.setPrev(this.head);
    }
}
