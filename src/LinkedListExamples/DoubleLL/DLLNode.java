package LinkedListExamples.DoubleLL;

public class DLLNode {

    private int data;
    private DLLNode previous;
    private DLLNode next;

    public DLLNode(int value) {
        this.data = value;
        this.previous = null;
        this.next = null;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public int data() {
        return data;
    }

    public DLLNode previous() {
        return previous;
    }

    public DLLNode next() {
        return next;
    }

    @Override
    public String toString() {
        return "[" + data + "] ";
    }
}
