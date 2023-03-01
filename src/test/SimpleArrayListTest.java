package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGenerator;
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
        Assertions.assertArrayEquals(expected,actual.getArray());
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        SimpleArrayList list = new SimpleArrayList();
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
    }
}