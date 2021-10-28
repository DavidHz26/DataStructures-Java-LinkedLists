package LinkedListExamples.DoubleLL;

public class CircularDoubleLinkedList {

    DLLNode head;
    DLLNode tail;

    public CircularDoubleLinkedList (int value) {
        DLLNode node = new DLLNode(value);

        node.setPrevious(node);
        node.setNext(node);

        head = node;
        tail = node;
        System.out.println("Success! List created.");
    }

    public void traverse() {

        if(!listExists()) {
            return;
        }

        DLLNode currentNode = head;

        do {
            System.out.print(currentNode.toString());
            currentNode = currentNode.next();

        } while (currentNode != head);

        System.out.println();
    }

    public void reverseTraverse() {

        if(!listExists()) {
            return;
        }

        DLLNode currentNode = tail;

        do {
            System.out.print(currentNode.toString());
            currentNode = currentNode.previous();

        } while (currentNode != tail);

        System.out.println();
    }

    public void traverseWithInfo() {
        if(head == null) {
            System.out.println("Failed! List does not exists.");
            return;
        }

        DLLNode currentNode = head;

        do {
            System.out.println(currentNode.previous() + " <- " + currentNode + " -> " + currentNode.next());
            currentNode = currentNode.next();

        } while(currentNode != head);

        System.out.println("Head: " + head);
        System.out.println("Tail: " + tail);
    }

    public int listSize(){
        DLLNode currentNode = head;
        int currentPosition = 0;

        do{
            currentPosition++;
            currentNode = currentNode.next();
        } while(currentNode != head);

        return currentPosition;
    }

    public void insertAtBeginning(int value) {
        System.out.println("Attempting to insert " + value + " at the beginning of the list...");
        DLLNode node = new DLLNode(value);

        if(!listExists()) {
            return;
        }

        node.setNext(head);
        node.setPrevious(tail);
        head.setPrevious(node);
        head = node;
        tail.setNext(node);

        System.out.println("Success! Node added.");
    }

    public void insertAtTheEnd(int value) {
        System.out.println("Attempting to insert " + value + " at the end of the list...");
        DLLNode node = new DLLNode(value);

        if(!listExists()) {
            return;
        }

        node.setNext(head);
        node.setPrevious(tail);
        head.setPrevious(node);
        tail.setNext(node);
        tail = node;

        System.out.println("Success! Node added.");
    }

    public void insertWithIndex(int index, int value) {
        System.out.println("Attempting to insert " + value + " at position " + index);
        DLLNode node = new DLLNode(value);

        if(!listExists()) {
            return;
        }

        if(index <= 0) {
            System.out.println("Failed! Please use insertAtBeginning instead.");
            return;
        }

        if(index >= listSize()){
            System.out.println("Failed! Please use insertAtTheEnd instead.");
            return;
        }

        DLLNode currentNode = head;
        int currentPosition = 0;

        do{
            if(currentPosition == index - 1) {
                node.setNext(currentNode.next());
                node.setPrevious(currentNode);
                currentNode.setNext(node);
                currentNode.next().setPrevious(node);

                System.out.println("Success! Node inserted.");
                return;
            }

            currentNode = currentNode.next();
            currentPosition++;
        } while (currentNode != head);

        System.out.println("Failed! Something went wrong!");

    }

    public void searchValue(int value) {
        System.out.println("Searching " + value + " on list...");

        if(!listExists()) {
            return;
        }

        DLLNode currentNode = head;
        int currentPosition = 0;

        do{
            if(currentNode.data() == value) {
                System.out.println("Success! Value found in node: " + currentNode + " at position: " + currentPosition);
                return;
            }

            currentNode = currentNode.next();
            currentPosition++;
        } while (currentNode != head);

        System.out.println("Failed! Value not found on list.");
    }

    public void deleteFirst() {
        System.out.println("Attempting to delete first node...");

        if(!listExists()) {
            return;
        }

        if(head == tail) {
            head.setNext(null);
            head.setPrevious(null);
            head = null;
            tail = null;
            return;
        }

        head = head.next();
        head.setPrevious(tail);
        tail.setNext(head);

        System.out.println("Success! Node deleted.");
    }

    public void deleteLast() {
        System.out.println("Attempting to delete last node...");

        if(!listExists()) {
            return;
        }

        if(head == tail) {
            head.setNext(null);
            head.setPrevious(null);
            head = null;
            tail = null;
            return;
        }

        tail = tail.previous();
        tail.setNext(head);
        head.setPrevious(tail);

        System.out.println("Success! Node deleted.");
    }

    public void deleteWithIndex(int index) {
        System.out.println("Attempting to delete node on position " + index);

        if(!listExists()) {
            return;
        }

        if(index <= 0) {
            System.out.println("Failed! Please use deleteFirst instead");
            return;
        }

        if(index >= listSize() - 1) {
            System.out.println("Failed! Please use deleteLast instead.");
            return;
        }

        DLLNode currentNode = head;
        int currentPosition = 0;

        do{
            if(currentPosition == index - 1) {
                currentNode.setNext(currentNode.next().next());
                currentNode.next().setPrevious(currentNode);
                System.out.println("Success! Node deleted.");
                return;
            }

            currentNode = currentNode.next();
            currentPosition++;
        } while (currentNode != head);

        System.out.println("Failed! Something went wrong.");
    }

    public void deleteList() {
        System.out.println("Attempting to delete list...");
        DLLNode currentNode = head;

        tail.setNext(null);

        do{
            currentNode.setPrevious(null);
            currentNode = currentNode.next();
        } while (currentNode != null);

        head = null;
        tail = null;

        System.out.println("Success! List deleted.");
    }

    public boolean listExists() {
        if(head == null) {
            System.out.println("Failed! List does not exist.");
            return false;
        }

        return true;
    }

//End
}
