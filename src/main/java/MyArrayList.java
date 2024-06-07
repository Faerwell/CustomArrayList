import java.util.Iterator;

public class MyArrayList<E> implements CustomArrayList<E> {

    private E[] values;

    MyArrayList() {
        values = (E[]) new Object[0];
    }
    @Override
    public boolean add(E e) {
        try {
            E[] t = values;
            values = (E[]) new Object[t.length + 1]; //downcasting
            System.arraycopy(t, 0, values, 0, t.length);
            values[values.length - 1] = e;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] t = values;
            values = (E[]) new Object[t.length - 1]; //downcasting
            System.arraycopy(t, 0, values, 0, index);
            int countElemAfterIndx = t.length - index - 1;
            System.arraycopy(t, index + 1,
                    values, index,
                    countElemAfterIndx);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
