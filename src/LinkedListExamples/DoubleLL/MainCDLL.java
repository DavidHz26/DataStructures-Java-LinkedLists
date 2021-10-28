package LinkedListExamples.DoubleLL;

public class MainCDLL {

    public static void main(String[] args) {
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList(10);

        cdll.traverse();

        cdll.insertAtBeginning(5);
        cdll.traverse();
        cdll.insertAtBeginning(0);
        cdll.traverse();
        cdll.insertAtTheEnd(15);
        cdll.traverse();
        cdll.insertAtTheEnd(20);
        cdll.traverse();
        cdll.insertWithIndex(1, 2);
        cdll.traverse();
        cdll.searchValue(10);
        cdll.searchValue(20);
        cdll.searchValue(0);
        cdll.traverse();
        cdll.deleteFirst();
        cdll.traverse();
        cdll.deleteLast();
        cdll.traverse();
        cdll.deleteWithIndex(1);
        cdll.traverse();
        cdll.deleteList();
        cdll.traverse();






        //End
    }
}
