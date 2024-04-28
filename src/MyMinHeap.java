public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    // Initializing the heap
    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    // Inserting an element into the heap
    public void insert(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    // Removing the minimum element from the heap
    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = heap.get(0);
        if (heap.size() == 1) {
            heap.removeLast();
        } else {
            T last = heap.get(heap.size() - 1);
            heap.removeLast();
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    // Finding the minimum element without removing it
    public T peekMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0); // Returning the min element at the root
    }

    // Checking if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        T temp = heap.get(index);
        while (index > 0) {
            int parentIndex = parent(index);
            T parentValue = heap.get(parentIndex);
            if (temp.compareTo(parentValue) < 0) {
                heap.set(index, parentValue);
                index = parentIndex;
            } else {
                break;
            }
        }
        heap.set(index, temp);
    }

    private void heapifyDown(int index) {
        T temp = heap.get(index);
        while (leftChild(index) < heap.size()) {
            int childIndex = leftChild(index);
            if (childIndex + 1 < heap.size() && heap.get(childIndex + 1).compareTo(heap.get(childIndex)) < 0) {
                childIndex++;
            }
            if (heap.get(childIndex).compareTo(temp) < 0) {
                heap.set(index, heap.get(childIndex));
                index = childIndex;
            } else {
                break;
            }
        }
        heap.set(index, temp);
    }

    // Calculating the parent index
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Calculating the left child index
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Calculating the right child index
    private int rightChild(int i) {
        return 2 * i + 2;
    }
}
