package src.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList implements SimpleList{
    //Node는 nextNode를 알고있다
    private Node node;
    private int size;

    public SimpleLinkedList(String value){
        this.node = new Node(value);
    }

    @Override
    public boolean add(String value) {

        return false;
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
        return null;
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
}

class Node{
    Node nextNode;
    String value;

    public Node(String value){
        this.value = value;
    }
}
