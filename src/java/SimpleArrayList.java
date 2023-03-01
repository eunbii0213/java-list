package src.java;

public class SimpleArrayList implements SimpleList {
    private String[] array = new String[1];

    @Override
    public boolean add(String value) {
        if (isEmpty()) {
            array[0] = value;
            return true;
        }

        String[] changeStringArr = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            changeStringArr[i] = array[i];
        }

        int size = changeStringArr.length - 1;
        changeStringArr[size] = value;

        array = changeStringArr;
        return true;
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
        return array[0] == null;
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
