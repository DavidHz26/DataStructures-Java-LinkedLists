package LinkedListExamples.SingleLL;

public class SLLNode {
    private int data;
    private SLLNode next;

    public SLLNode(int data) {
        this.data = data;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public int data(){
        return data;
    }

    public SLLNode next(){
        return next;
    }

    @Override
    public String toString() {
        return "[" + data + "] ";
    }
}
