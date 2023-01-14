package coursera.doubleimpl;

public class ListNode<T> {
    private ListNode<T> next;
    private ListNode<T> prev;
    private T data;

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setPrev(ListNode<T> prev) {
        this.prev = prev;
    }

    public void setData(T data) {
        this.data = data;
    }
}
