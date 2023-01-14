package coursera.singleimpl;

public class SLLNode<T> {
    private SLLNode<T> next;
    private T data;

    public SLLNode() {
        next =  null;
        data = null;
    }

    public SLLNode(T data) {
        this.data = data;
    }

    public SLLNode(SLLNode<T> prevNode, T data) {
        this(data);
        this.next = prevNode.next;
        prevNode.next = this;
    }
}
