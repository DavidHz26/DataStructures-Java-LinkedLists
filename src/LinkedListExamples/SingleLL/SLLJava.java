package LinkedListExamples.SingleLL;

import java.util.LinkedList;

public class SLLJava {
    public LinkedList<SLLNode> myList;

    public SLLJava(int value) {
        myList = new LinkedList<SLLNode>();

        SLLNode newNode = new SLLNode(value);
        myList.add(newNode);

        System.out.println("Linked List successfully created");
    }

    public void traverse() {
        if(myList.isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }

        for(SLLNode node : myList) {
            System.out.print(node);
        }

        System.out.println("\n");
    }

    public void addValue(int index, int value) {
        SLLNode node = new SLLNode(value);

        if(index == 0) {
            myList.addFirst(node);
            System.out.println("Value successfully inserted!");
            return;
        }

        if(index >= myList.size()) {
            myList.addLast(node);
            System.out.println("Value successfully inserted!");
            return;
        }

        myList.add(index, node);
        System.out.println("Value successfully inserted!");
    }

    public void searchValue(int value) {

        for(SLLNode currentNode : myList) {
            if(currentNode.data() == value) {
                System.out.println("Found in position: <" + myList.indexOf(currentNode) + ">");
                return;
            }
        }

        System.out.println("Not found in linked list!");
    }

    public void deleteNode(int position) {

        if(position > myList.size()) {
            System.out.println("Position greater than list size");
            System.out.println("Converting position to last node index");
            myList.removeLast();
            return;
        }

        if(position == 0) {
            myList.remove(myList.getFirst());
            return;
        }

        if(position == myList.size()) {
            myList.remove(myList.getLast());
            return;
        }

        for(SLLNode node : myList) {
            if(myList.indexOf(node) == position) {
                myList.remove(node);
                return;
            }
        }
    }

    public void deleteList(){
        myList.clear();
        System.out.println("Linked List successfully deleted");
    }
}
