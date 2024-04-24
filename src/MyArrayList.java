import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private T[] arr;
    private int size;

    public MyArrayList(){
        arr = (T[]) new Object[7];
        size = 0;
    }

    public void add(T item){
        if (size > arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    public void set(int index, T item){
        checkIndex(index);
        arr[index] = item;
    }

    public void add(int index, T item){
        if (size >= arr.length){
            increaseBuffer();
        }
        checkIndex(index);
        shiftRight(index);
        arr[index] = item;
        size++;
    }

    public void addFirst(T item){
        add(0, item);
    }

    public void addLast(T item){
        add(size, item);
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public T getFirst(){
        return get(0);
    }

    public T getLast(){
        return get(size-1);
    }

    public void remove(int index){
        checkIndex(index);
        shiftLeft(index);
        size--;
    }

    public void removeFirst(){
        remove(0);
    }

    public void removeLast(){
        remove(size - 1);
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public void clear(){
        arr = (T[]) new Object[7];
        size = 0;
    }

    public int size(){
        return size;
    }

    private void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void shiftRight(int index){
        for (int i = size; i > index; i--){
            arr[i] = arr[i-1];
        }
    }

    private void shiftLeft(int index){
        for (int i = index; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
    }

    private void checkIndex(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index not correct");
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException("There is no elements in the list");
                }
                return null;
            }
        };
    }
}
