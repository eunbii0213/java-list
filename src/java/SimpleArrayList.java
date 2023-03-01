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
        String[] changeStringArr = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            changeStringArr[i] = array[i];
        }

        array = changeStringArr;
    }

    @Override
    public void add(int index, String value) {
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
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value)){
                return true;
            }
        }
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
        array = new String[1];
    }

    public String[] getArray() {
        return array;
    }
}
