package src.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleLinkedListTest {

    @Test
    void add() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();
        //when
        String expected = "firstNode";
        list.add(expected);
        //then
        assertEquals(expected, list.get(0));
    }

    @Test
    void testAdd() {
    }

    @Test
    void set() {
    }

    @Test
    void get() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();
        //when
        String expected = "nodeGetTest";
        list.add(expected);
        //then
        assertEquals(expected, list.get(0));
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void clear() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("1");
        list.add("2");
        int expected = 0;
        list.clear();

        //then
        assertEquals(expected, list.getSize());
    }
}