package src.test;

import org.junit.jupiter.api.Test;
import src.java.SimpleLinkedList;

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
    void testAddWithIndex() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("0");
        list.add("1");
        list.add(1,"a");
        String expected = "0a1";
        String actual = list.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void set() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("nodeSetTest");
        list.set(0, "changed");
        String expected = "changed";
        String actual = list.get(0);

        //then
        assertEquals(expected, actual);
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
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("1");
        list.add("2");
        list.add("3");
        boolean expected = false;
        boolean actual = list.contains("a");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void indexOf() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("1");
        list.add("2");
        list.add("3");
        int expected = 1;
        int actual = list.indexOf("2");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void size() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        list.add("1");
        list.add("2");
        list.add("3");
        int expected = 3;
        int actual = list.size();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        //given
        SimpleLinkedList list = new SimpleLinkedList();

        //when
        int expected = 0;
        int actual = list.size();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        //given
        SimpleLinkedList actualList = new SimpleLinkedList();
        SimpleLinkedList expectedList = new SimpleLinkedList();

        //when
        actualList.add("1");
        actualList.add("2");
        actualList.add("3");
        actualList.remove("2");

        expectedList.add("1");
        expectedList.add("3");

        String expected = expectedList.toString();
        String actual = actualList.toString();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void testRemove() {
        //given
        SimpleLinkedList actualList = new SimpleLinkedList();
        SimpleLinkedList expectedList = new SimpleLinkedList();

        //when
        actualList.add("1");
        actualList.add("2");
        actualList.add("3");
        actualList.remove(1);

        expectedList.add("1");
        expectedList.add("3");

        String expected = expectedList.toString();
        String actual = actualList.toString();

        //then
        assertEquals(expected, actual);
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
        int actual = list.size();

        //then
        assertEquals(expected, actual);
    }
}