package LinkedListExamples.SingleLL;

import java.util.NoSuchElementException;

public class CircularSingleLinkedList {
    private SLLNode head = null;
    private SLLNode tail = null;

    public CircularSingleLinkedList(int value){
        //Create a new node
        SLLNode newNode = new SLLNode(value);
        newNode.setNext(newNode);

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

        do {
            System.out.print("[" + currentNode.data() + "] ");
            currentNode = currentNode.next();
        } while(currentNode != head);
    }

    public int listSize() {
        int count = 0;

        if(head == null) {
            System.out.println("Linked list is empty");
            return -1;
        }

        SLLNode currentNode = head;

        do {
            count++;
            currentNode = currentNode.next();
        } while(currentNode != head);

        return count;
    }

    public void insertValue(int value, int position) {

        System.out.println("Inserting " + value + " in position " + position);
        try {
            //Create a new node
            SLLNode newNode = new SLLNode(value);

            //If list is empty
            if(head == null) {
                System.out.println("Linked List doesn't exists!");
            }

            //At the beginning of the list
            if(position == 0) {
                //New node is now pointing to the previous head
                newNode.setNext(head);
                //We update head
                head = newNode;
                tail.setNext(head);

                System.out.println("Successfully added at the beginning of the list");
                return;
            }

            //At the end of the list
            if(position >= listSize()) {
                //Point th new node to the previous tail.next (head)
                newNode.setNext(tail.next());
                //Previous tail next is now pointing to the new node
                tail.setNext(newNode);
                //Lastly we update tail
                tail = newNode;
                System.out.println("Successfully added at the end of the list");
                return;
            }

            //Between nodes
            SLLNode currentNode = head;
            int currentPosition = 0;

            do {
                if(currentPosition == position - 1) {
                    newNode.setNext(currentNode.next());
                    currentNode.setNext(newNode);

                    System.out.println("Success!");
                    return;
                }

                currentNode = currentNode.next();
                currentPosition++;
            } while (currentNode != head);

        } catch (NoSuchElementException e) {
            System.out.println("Something went wrong!");
        }
    }

    public void searchValue(int value) {
        System.out.println("Searching value: " + value);
        SLLNode currentNode = head;
        int position = 0;

        do {
            if(currentNode.data() == value) {
                System.out.println("Found in position: <" + position + ">");
                return;
            }

            position++;
            currentNode = currentNode.next();
        } while(currentNode != head);

       System.out.println("Not found in linked list!");
    }

    public void deleteNode(int position) {
        System.out.println("Deleting node in position: " + position + "...");

        try {
            if(head == null) {
                System.out.println("Linked List doesn't exists!");
            }

            if (position == 0) {
                //if head is pointing himself, then the list is empty,
                //so we delete the list
                if(head.next() == head){
                    head = null;
                    tail = null;
                    return;
                }

                head = head.next();
                tail.setNext(head);

                System.out.println("First Node successfully deleted!");
                return;
            }

            if(position >= listSize() - 1) {
                SLLNode node = head;

                if(listSize() == 1) {
                    head = null;
                    tail = null;
                    node.setNext(null);
                    return;
                }

                while(node != tail) {
                    if(node.next() == tail) {
                        tail = node;
                        node.setNext(head);
                        return;
                    }

                    node = node.next();
                }
            }

            else {
                SLLNode currentNode = head;
                int currentPosition = 0;
                int destinyPosition = position - 1;

                while (currentPosition <= destinyPosition) {
                    if (currentPosition == destinyPosition) {
                        System.out.println("Node to delete: " + currentNode.next());
                        currentNode.setNext(currentNode.next().next());
                        System.out.println("Node successfully deleted!");
                        return;
                    }

                    currentNode = currentNode.next();
                    currentPosition++;
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    public void deleteList() {
        head = null;
        tail.setNext(null);
        tail = null;
        System.out.println("Linked list successfully deleted!");
    }

}
