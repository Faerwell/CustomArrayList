import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
