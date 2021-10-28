package LinkedListExamples.DoubleLL;

public class DoubleLinkedList {
    private DLLNode head = null;
    private DLLNode tail = null;

    public DoubleLinkedList(int value) {
        //Create a new node
        DLLNode newNode = new DLLNode(value);

        //Update head and tail
        head = newNode;
        tail = newNode;

        System.out.println("Initialized!");
    }

    public void traverse() {
        if(head == null) {
            System.out.println("Failed! List does no exist..");
            return;
        }

        DLLNode currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.next();
        }

        System.out.println();
    }

    public void reverseTraverse() {
        if(head == null) {
            System.out.println("Failed! List does not exist.");
            return;
        }

        DLLNode currentNode = tail;

        while(currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.previous();
        }

        System.out.println();
    }

    public void traverseWithInfo() {
        if(head == null) {
            System.out.println("Failed! List is empty.");
        }

        DLLNode currentNode = head;

        while(currentNode != null) {
            System.out.println(currentNode.previous() + " <- " + currentNode + " -> " + currentNode.next());
            currentNode = currentNode.next();
        }

        System.out.println("Head : " + head);
        System.out.println("Tail : " + tail);
    }

    private int listSize() {
        int position = 0;

        DLLNode currentNode = head;

        while(currentNode != null) {
            position++;

            currentNode = currentNode.next();
        }

        return position;
    }

    public void insertAtBeginning(int value) {
        System.out.println("Inserting " + value + " at the beginning of the list...");
        DLLNode newNode = new DLLNode(value);

        try {
            if (head == null) {
                System.out.println("Failed! Linked list does not exist.");
                return;
            }

            newNode.setNext(head);
            newNode.setPrevious(null);
            head.setPrevious(newNode);
            head = newNode;

            System.out.println("Success! Insertion completed.");

        } catch (Exception e) {
            System.out.println("Failed! Something went wrong.");
        }
    }

    public void insertAtTheEnd(int value) {
        System.out.println("Inserting " + value + " at the end of the list...");
        DLLNode newNode = new DLLNode(value);

        try {
            if(tail == null) {
                System.out.println("Failed! Linked list does not exist.");
                return;
            }

            newNode.setNext(null);
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;

            System.out.println("Success! Insertion completed.");

        } catch (Exception e) {
            System.out.println("Failed! Something went wrong.");
        }
    }

    public void insertWithIndex(int index, int value) {
        System.out.println("Inserting " + value + " at the position " + index + " of the list...");
        DLLNode node = new DLLNode(value);

        try {
            if(head == null) {
                System.out.println("Failed! List does not exist.");
            }

            if(index <= 0) {
                System.out.println("Failed! To insert a node in the first position " +
                        "please use insertAtBeginning.");
                return;
            }

            if(index >= listSize()) {
                System.out.println("Failed! To insert a node in the last position " +
                        "please use insertAtTheEnd");
                return;
            }

            DLLNode currentNode = head;
            int currentPosition = 0;
            int destinyPosition = index - 1;

            while (currentNode != tail) {
                if (currentPosition == destinyPosition) {
                    node.setNext(currentNode.next());
                    node.setPrevious(currentNode);

                    currentNode.next().setPrevious(node);
                    currentNode.setNext(node);

                    System.out.println("Success! Insertion completed.");
                }

                currentNode = currentNode.next();
                currentPosition++;
            }

        } catch (Exception e) {
            System.out.println("Failed! Something went wrong.");
        }
    }

    public void searchValue(int value) {
        System.out.println("Searching value " + value + " on list...");
        DLLNode currentNode = head;
        int currentPosition = 0;

        while(currentNode != null) {

            if(currentNode.data() == value) {
                System.out.println("Success! Value found on position: " + (currentPosition + 1) + " node: " + currentNode);
                return;
            }

            currentNode = currentNode.next();
            currentPosition++;
        }

        System.out.println("Failed! Value not found on list.");
    }

    public void deleteFirst() {
        System.out.println("Attempting to delete first node from list...");

        if(head == null) {
            System.out.println("Failed! List does not exist.");
            return;
        }

        if(head == tail) {
            System.out.println("Only one node on list...");
            head = null;
            tail = null;
            System.out.println("Success! First node deleted." +
                    "List will be deleted now.");
            return;
        }

        head.next().setPrevious(null);
        head = head.next();

        System.out.println("Success! First node deleted.");
    }

    public void deleteLast() {
        System.out.println("Attempting to delete last node from list...");

        if(head == null) {
            System.out.println("Failed! List does not exist.");
            return;
        }

        if(head == tail) {
            System.out.println("Only one node on list...");
            head = null;
            tail = null;
            System.out.println("Success! First node deleted." +
                    "List will be deleted now.");
            return;
        }

        tail.previous().setNext(null);
        tail = tail.previous();

        System.out.println("Success! Last node deleted.");
    }

    public void deleteWithIndex(int index) {

        System.out.println("Attempting to delete node on position " + index + " from list...");

        if(index <= 0) {
            System.out.println("Failed! Please use deleteFirst instead.");
            return;
        }

        if(index >= listSize() - 1) {
            System.out.println("Failed! Please use deleteLast instead.");
            return;
        }

        DLLNode currentNode = head;
        int currentPosition = 0;

        while(currentNode != null) {

            if(currentPosition == index) {
                currentNode.previous().setNext(currentNode.next());
                currentNode.next().setPrevious(currentNode.previous());

                System.out.println("Success! Node deleted.");
            }

            currentNode = currentNode.next();
            currentPosition++;
        }
    }

    public void deleteList(){
        System.out.println("Attempting to delete list...");

        DLLNode currentNode = head;

        while(currentNode != null) {
            currentNode.setPrevious(null);
            currentNode = currentNode.next();
        }

        head = null;
        tail = null;

        System.out.println("Success! List deleted.");
    }

    //End
}
