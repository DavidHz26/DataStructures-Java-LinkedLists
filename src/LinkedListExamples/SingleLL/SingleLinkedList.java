package LinkedListExamples.SingleLL;

import java.util.NoSuchElementException;

public class SingleLinkedList {
    private SLLNode head = null;
    private SLLNode tail = null;

    public SingleLinkedList(int value){
        //Create a new node
        SLLNode newNode = new SLLNode(value);

        //Update head and tail
        head = newNode;
        tail = newNode;

        System.out.println("Linked List successfully created");
    }

    public void traverse() {
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        SLLNode currentNode = head;

        while(currentNode != null) {
            System.out.print("[" + currentNode.data() + "] ");
            currentNode = currentNode.next();
        }
    }

    public int listSize() {
        int count = 0;

        if(head == null) {
            System.out.println("Linked list is empty");
            return -1;
        }

        SLLNode currentNode = head;

        while(currentNode != null) {
            count++;
            currentNode = currentNode.next();
        }

        return count;
    }

    public void insertValue(int value, int position) {
        try {
            //Create a new node
            SLLNode newNode = new SLLNode(value);
            newNode.setNext(null);

            if(head == null) {
                head = newNode;
                return;
            }

            if(position == 0) {
                //New node is now pointing to direction of head
                newNode.setNext(head);
                //Head is now the new node
                head = newNode;

                System.out.println("Value successfully inserted!");
                return;
            }

            if(position >= listSize()) {
                //tail next set to new node
                tail.setNext(newNode);
                //new node is now the tail
                tail = newNode;
                System.out.println("Value successfully inserted!");
                return;
            }

            SLLNode currentNode = head;
            int index = 0;

            while(currentNode.next() != null) {

                if(index == position - 1) {
                    newNode.setNext(currentNode.next());
                    currentNode.setNext(newNode);
                    break;
                }

                currentNode = currentNode.next();
                index++;
            }

            System.out.println("Value successfully inserted!");

        } catch (NoSuchElementException e) {
            System.out.println("Something went wrong!");
        }
    }

    public void searchValue(int value) {
        System.out.println("Searchin value: " + value);
        SLLNode currentNode = head;
        int position = 0;

        while(currentNode.next() != null) {

            if(currentNode.data() == value) {
                System.out.println("Found in position: <" + position + ">");
                return;
            }

            position++;
            currentNode = currentNode.next();
        }

        System.out.println("Not found in linked list!");
    }

    public void deleteNode(int position) {
        System.out.println("Deleting node in position: " + position + "...");

        try {

            if(position > listSize()) {
                System.out.println("Invalid position!");
                return;
            }

            if (position == 0) {
                SLLNode nextNode = head.next();

                head = nextNode;
                System.out.println("Node successfully deleted!");
                return;
            }

            SLLNode currentNode = head;
            int currentPosition = 0;

            while (currentNode.next() != null) {

                if(position > listSize()) {
                    position = listSize();
                }

                if (currentPosition == position - 1) {
                    SLLNode tempNode = currentNode.next().next();
                    currentNode.setNext(tempNode);
                    System.out.println("Node successfully deleted!");
                    break;
                }

                currentNode = currentNode.next();
                currentPosition++;
            }

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    public void deleteList() {
        head = null;
        tail = null;
        System.out.println("Linked list successfully deleted!");
    }
}
