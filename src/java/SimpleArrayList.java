package src.java;

public class SimpleArrayList implements SimpleList {
    private String[] array = new String[1];

    @Override
    public boolean add(String value) {
        if (isEmpty()) {
            array[0] = value;
            return true;
        }

        arraySizeUp();
        int size = array.length - 1;
        array[size] = value;
        return true;
    }

    private void arraySizeUp() {
        String[] changedArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            changedArray[i] = array[i];
        }

        array = changedArray;
    }

    @Override
    public void add(int index, String value) {
        arraySizeUp();

        String pre = array[index];
        array[index] = value;

        for (int j = index + 1; j < array.length; j++) {
            String post = array[j];
            array[j] = pre;
            pre = post;
        }
    }

    @Override
    public String set(int index, String value) {
        return array[index] = value;
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public boolean contains(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return array.length;
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
        array = new String[1];
    }

    public String[] getArray() {
        return array;
    }
}
