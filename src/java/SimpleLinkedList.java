package src.java;

public class SimpleLinkedList implements SimpleList {
    private Node node;
    private int size;

    public SimpleLinkedList() {
        this.size = 0;
    }

    @Override
    public boolean add(String value) {
        if (isFirstNode()) {
            System.out.println("call");
            node = new Node(value);
            size++;
            return true;
        }

        if (!isFirstNode()) {
            System.out.println("call2");
            Node searchNode = node;

            for (int i = 0; i < size; i++) {
                if(isNextNodeExist(searchNode)) {
                    searchNode = searchNode.getNextNode();
                }
            }
            searchNode.setNextNode(new Node(value));
            size++;
            return true;
        }
        return false;
    }

    private boolean isNextNodeExist(Node searchNode) {
        return searchNode.getNextNode() != null;
    }

    private boolean isFirstNode() {
        return size == 0;
    }

    @Override
    public void add(int index, String value) {

    }

    @Override
    public String set(int index, String value) {
        return null;
    }

    @Override
    public String get(int index) {
        return node.getValue();
    }

    @Override
    public boolean contains(String value) {
        return false;
    }

    @Override
    public int indexOf(String value) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(String value) {
        return false;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    public int getSize() {
        return size;
    }
}

class Node {
    Node nextNode;
    String value;

    public Node(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public String getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
