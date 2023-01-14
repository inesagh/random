package coursera.singleimpl;

public class SLinkedList<T> {
    private SLLNode<T> head;
    private int size;

    public SLinkedList() {
        head = new SLLNode<>(null);
        size = 0;
    }
}
