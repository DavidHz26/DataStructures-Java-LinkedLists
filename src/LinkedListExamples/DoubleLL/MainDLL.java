package LinkedListExamples.DoubleLL;

public class MainDLL {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList(10);
        dll.traverse();
//        dll.reverseTraverse();
        dll.insertAtBeginning(5);
        dll.traverse();
//        dll.reverseTraverse();
        dll.insertAtTheEnd(20);
        dll.traverse();
//        dll.reverseTraverse();
        dll.insertWithIndex(2, 15);
        dll.traverse();
//        dll.reverseTraverse();
        dll.searchValue(10);
        dll.searchValue(20);
//        dll.deleteFirst();
//        dll.deleteLast();
        dll.deleteWithIndex(2);
        dll.traverse();
        dll.deleteList();
        dll.traverse();



    }
}
