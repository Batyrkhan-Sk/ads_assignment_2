import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {

    private class MyNode {
        T data; // Data stored in the node
        MyNode next;
        MyNode prev;

        MyNode(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode head; // Reference to the head of the linked list
    private MyNode tail; // Reference to the tail of the linked list
    private int size;

    // Initializing an empty linked list
    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // Adding an item to the end
    public void add(T item){
        addLast(item);
    }

    // Setting the item at a specific index
    public void set(int index, T item){
        checkIndex(index);
        MyNode current = getNode(index);
        current.data = item;
    }

    // Adding an item at a specific index
    public void add(int index, T item){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index not correct");
        }
        if (index == 0){
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode newNode = new MyNode(item);
            MyNode prevNode = getNode(index - 1);
            MyNode nextNode = prevNode.next;

            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;

            size++;
        }
    }

    // Adding an item to the beginning
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void  addLast(T item){
        MyNode newNode = new MyNode(item);
        if (isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    // Getting the item at a specific index
    public T get(int index){
        checkIndex(index);
        MyNode current = getNode(index);
        return current.data;
    }

    // Getting the first item
    public T getFirst() {
        if (isEmpty()){
            return null;
        }
        return head.data;
    }

    // Getting the last item
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }


    // Removing the item at a specific index
    public void remove(int index){
        checkIndex(index);
        if (index == 0){
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            MyNode nodeRemove = getNode(index);
            MyNode prevNode = nodeRemove.prev;
            MyNode nextNode = nodeRemove.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            size--;
        }
    }

    // Removing the first item
    public void removeFirst(){
        if (isEmpty()){
            return;
        }
        if (size == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Removing the last item
    public void removeLast(){
        if (isEmpty()){
            return;
        }
        if (size == 1){
            head= null;
            tail= null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // Getting the index of the first occurrence of an element
    public int indexOf(Object object){
        int index = 0;
        MyNode current = head;
        while (current != null){
            if (current.data.equals(object)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // Getting the index of the last occurrence of an element
    public int lastIndexOf(Object object){
        int index = size - 1;
        MyNode current = tail;
        while (current != null){
            if (current.data.equals(object)){
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    // Checking if an element exists
    public boolean exists(Object object){
        return indexOf(object) >= 0;
    }

    // Converting the linked list to an array
    public Object[] toArray(){
        Object[] array = new Object[size];
        MyNode  current = head;
        int index = 0;
        while (current != null){
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    // Clearing the linked list
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    // Getting the size of the linked list
    public int size(){
        return size;
    }

    // Getting the node at a specific index
    private MyNode getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Checking if the index is valid
    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index not correct");
        }
    }

    // Checking if the linked list is empty
    private boolean isEmpty(){
        return size == 0;
    }

    // Traversing the linked list
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            public T next(){
                if (!hasNext()){
                    return null;
                }
                T data = current.data;
                current = current.next;
                return data;
            }

        };
    }
}
