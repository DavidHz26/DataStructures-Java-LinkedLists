package LinkedListExamples.SingleLL;

public class MainSLL {
    public static void main(String[] args) {
        System.out.println("Initialize LL...");
        SingleLinkedList sll = new SingleLinkedList(10);
        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.insertValue(1, 0);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.insertValue(20, 10);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.insertValue(15, 2);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.insertValue(5, 1);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.insertValue(25, 10);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nSearching values...");
        sll.searchValue(1);

        System.out.println("\nSearching values...");
        sll.searchValue(15);

        System.out.println("\nSearching values...");
        sll.searchValue(100);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nDeleting values...");
        sll.deleteNode(0);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nDeleting values...");
        sll.deleteNode(2);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nDeleting values...");
        sll.deleteNode(3);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nDeleting values...");
        sll.deleteNode(100);

        System.out.println("\nDeleting Linked List...");
        sll.deleteList();

        System.out.println("\nPrinting LL...");
        sll.traverse();


    }
}
