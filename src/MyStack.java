public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack(){
        list = new MyArrayList<>();
    }

    // Pushing an item onto the stack
    public void push(T item){
        list.add(item);
    }

    // Removes the top item from the stack and returns it
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T removedItem = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return removedItem;
    }


    // Returning the top item without removing it
    public T peek(){
        // Checking if the stack is empty
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        // Returning the top item from the stack
        return list.get(list.size() - 1);
    }

    // Checking if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
