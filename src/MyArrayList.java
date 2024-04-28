import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] arr;
    private int size;

    // Initializing an array and size
    public MyArrayList(){
        arr =  new Object[7];
        size = 0;
    }

    // Adding an item to the end of the list
    public void add(T item){
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    // Setting the item at a specific index
    public void set(int index, T item){
        checkIndex(index);
        arr[index] = item;
    }

    // Adding an item at a specific index
    public void add(int index, T item){
        // Checking if the index is valid
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size >= arr.length){
            increaseBuffer();
        }
        // Moving elements to the right to make space for the new item
        for (int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }
        // Inserting the new item at the specified index
        arr[index] = item;
        size++;
    }

    // Adding an item to the beginning of the list
    public void addFirst(T item){
        add(0, item);
    }

    // Adding an item to the end of the list
    public void addLast(T item){
        add(size, item);
    }

    // Getting the item at a specified index
    @Override
    public T get(int index) {
        checkIndex(index); // Making sure that the index is valid
        return (T) arr[index]; // Return the item at the specified index
    }

    // Getting the first item in the list
    public T getFirst(){
        return get(0);
    }

    // Getting the last item in the list
    public T getLast(){
        return get(size-1);
    }

    // Removing the item at a specified index
    public void remove(int index){
        checkIndex(index);
        for (int i = index; i < size; i++){
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null; // Setting the last element to the null
        size--;

    }

    // Removing the first item in the list
    public void removeFirst(){
        remove(0);
    }

    // Removing the last item in the list
    public void removeLast(){
        remove(size - 1);
    }

    // Getting the index of the first occurrence of an element
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++){
            if (object.equals(arr[i])){
                return i;
            }
        }
        return -1; // Element not found
    }

    // Getting the index of the last occurrence of an element
    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--){
            if (arr[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    // Checking if an element exists in the list
    @Override
    public boolean exists(Object object) {
        return indexOf(object) >= 0;
    }

    public Object[] toArray(){
        Object[] newArr = new Object[size];
        System.arraycopy(arr,0, newArr, 0, size);
        return newArr;
    }

    // Clear the list
    public void clear(){
        arr = new Object[7];
        size = 0;
    }

    // Getting the size of the list
    public int size(){
        return size;
    }

    // Increasing the size
    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = (T) arr[i];
        }
        arr = newArr;
    }

    // Checking if the index is valid
    private void checkIndex(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index not correct");
    }

    // Iterating over the elements of the list
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int currentIndex = 0; // Current index in the iteration

            // Checking if there are more elements to iterate over
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            // Getting the next element in the iteration
            @Override
            public T next() {
                if (!hasNext()) {
                    return null;
                }
                return get(currentIndex++); // Returning the current element and moving to the next index
            }
        };
    }
}
