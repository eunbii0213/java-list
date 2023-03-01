package src.test;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import src.java.SimpleArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SimpleArrayListTest {

    @Test
    void add() {
        //given
        SimpleArrayList actual = new SimpleArrayList();
        String value = "1";

        //when
        actual.add(value);
        String[] expected = {value};

        //then
        assertArrayEquals(expected, actual.getArray());
    }

    @Test
    void testAdd() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add(2, "a");
        String[] expected = {"1", "2", "a", "3", "4", "5"};

        //then
        assertArrayEquals(expected, list.getArray());
    }

    @Test
    void set() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.set(0, "2");
        String expected = "2";
        String actual = list.get(0);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void get() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        String expected = "1";
        String actual = list.get(0);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void contains() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.add("2");
        list.add("a");

        //then
        assertTrue(list.contains("2"));
    }

    @Test
    void indexOf() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.add("2");
        list.add("a");
        int expected = 1;
        int actual = list.indexOf("2");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void size() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.add("2");
        list.add("a");

        int expected = 3;
        int actual = list.size();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        //given
        SimpleArrayList list = new SimpleArrayList();

        //when,then
        assertTrue(list.isEmpty());
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
        SimpleArrayList list = new SimpleArrayList();

        //when
        list.add("1");
        list.clear();

        //then
        assertTrue(list.isEmpty());
    }
}