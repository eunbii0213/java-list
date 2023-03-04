package src.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleLinkedListTest {

    @Test
    void add() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("firstNode");
        String expected = "firstNode";
        String actual = list.get(0);

        //then
        assertEquals(expected, actual);
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
        list.add("nodeGetTest");
        String expected = "nodeGetTest";
        String actual = list.get(0);

        //then
        assertEquals(expected, actual);
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
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        int expected = 0;
        int actual = list.getSize();

        //then
        assertEquals(expected, actual);
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
        list.clear();

        int expected = 0;
        int actual = list.getSize();

        //then
        assertEquals(expected, actual);
    }
}