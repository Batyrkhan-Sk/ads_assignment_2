public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue(){
        list = new MyLinkedList<>();
    }

    // Adds an item from the back of the queue
    public void enqueue(T item){
        list.addLast(item);
    }

    // Removing an item from the front of the queue
    public T dequeue() {
        if (isEmpty()){
            throw new IllegalStateException("Cannot dequeue from an empty queue");
        }
        T removedItem = list.getFirst();
        list.removeFirst();
        return removedItem;
    }

    // Returning the value of the item at the front of the queue, without removing it
    public T peek(){
        if (isEmpty()){
            throw new IllegalStateException("Cannot peek from an empty queue");
        }
        return list.getFirst();
    }

    // Checking if the queue is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
