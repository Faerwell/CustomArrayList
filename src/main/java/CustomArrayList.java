public interface CustomArrayList<E> extends Iterable<E> {
    boolean add(E e);
    public void addAll(E[] elements);
    void remove(int index);
    E get(int index);
    int size();
    void update(int index, E e);
    void show();
}
