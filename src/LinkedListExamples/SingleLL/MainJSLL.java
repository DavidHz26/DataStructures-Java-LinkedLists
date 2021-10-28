package LinkedListExamples.SingleLL;

public class MainJSLL {

    public static void main(String[] args) {

        System.out.println("Initialize LL...");
        SLLJava sll = new SLLJava(10);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.addValue(0, 1);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.addValue(10, 20);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.addValue(2, 15);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.addValue(1, 5);

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\n\nInserting values...");
        sll.addValue(10, 25);

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

        System.out.println("\nPrinting LL...");
        sll.traverse();

        System.out.println("\nDeleting Linked List...");
        sll.deleteList();

        System.out.println("\nPrinting LL...");
        sll.traverse();

    }
}
