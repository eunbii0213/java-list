package src.test;

import org.junit.jupiter.api.Assertions;
import src.java.SimpleArrayList;

class SimpleArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        //given
        SimpleArrayList actual = new SimpleArrayList();
        String value = "1";

        //when
        actual.add(value);
        String[] expected = {value};

        //then
        Assertions.assertArrayEquals(expected, actual.getArray());
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void set() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.set(0,"2");
        String expected = "2";
        String actual = list.get(0);

        //then
        Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void get() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        String expected = "1";
        String actual = list.get(0);

        //then
        Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.add("2");
        list.add("a");

        //then
        Assertions.assertTrue(list.contains("2"));
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when,then
        Assertions.assertTrue(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.clear();

        //then
        Assertions.assertTrue(list.isEmpty());
    }
}