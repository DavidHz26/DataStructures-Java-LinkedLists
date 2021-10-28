package LinkedListExamples.SingleLL;

import LinkedListExamples.SingleLL.CircularSingleLinkedList;

public class MainCSLL {

    public static void main(String[] args) {
        System.out.println("Initialize LL...");
        CircularSingleLinkedList csll = new CircularSingleLinkedList(10);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nInserting values...");
        csll.insertValue(1, 0);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nInserting values...");
        csll.insertValue(20, 10);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nInserting values...");
        csll.insertValue(15, 2);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nInserting values...");
        csll.insertValue(5, 1);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nInserting values...");
        csll.insertValue(25, 10);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nSearching values...");
        csll.searchValue(1);

        System.out.println("\nSearching values...");
        csll.searchValue(15);

        System.out.println("\nSearching values...");
        csll.searchValue(25);

        System.out.println("\nSearching values...");
        csll.searchValue(100);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nDeleting values...");
        csll.deleteNode(0);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nDeleting values...");
        csll.deleteNode(2);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nDeleting values...");
        csll.deleteNode(3);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nDeleting values...");
        csll.deleteNode(100);

        System.out.println("\nPrinting LL...");
        csll.traverse();

        System.out.println("\n\nDeleting Linked List...");
        csll.deleteList();

        System.out.println("\nPrinting LL...");
        csll.traverse();

    }
}
