package coursera.singleimpl;

public class Main {
    public static void main(String[] args) {
        SLLNode<Integer> n0 = new SLLNode<>();
        SLLNode<Integer> n1 = new SLLNode<>(n0, 1);
        SLLNode<Integer> n2 = new SLLNode<>(n0, 2);
    }
}
