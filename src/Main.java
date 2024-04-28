import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyStack<Integer> stack = new MyStack<>();
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        MyQueue<Integer> queue = new MyQueue<>();


        // Testing MyQueue
        // Enqueue elements into the queue
        queue.enqueue(43);
        queue.enqueue(21);
        queue.enqueue(38);

        // Peek at the front element without removing it
        System.out.println("Peeked element: " + queue.peek());

        // Dequeue and print elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        // Check if the queue is empty
        System.out.println("The queue is empty: " + queue.isEmpty());

        // Testing MyMinHeap
        // Insert elements into the heap
        minHeap.insert(10);
        minHeap.insert(5);
        minHeap.insert(15);
        minHeap.insert(3);
        minHeap.insert(8);

        // Print the minimum element (peek)
        System.out.println("Minimum element: " + minHeap.peekMin());

        // Extract and print the minimum element
        System.out.println("Extracted minimum element: " + minHeap.extractMin());

        // Print the minimum element after extraction
        System.out.println("Minimum element after extraction: " + minHeap.peekMin());

        // Check if the heap is empty
        System.out.println("The heap is empty: " + minHeap.isEmpty());

        // Testing MyStack
        stack.push(12);
        stack.push(23);
        stack.push(34);

        // Print the top item of the stack
        System.out.println("Top item of the stack: " + stack.peek());

        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());

        // Checking if the stack is empty
        System.out.println("The stack is empty: " + stack.isEmpty());

        // Testing MyLinkedList
        // Adding elements to the linked list
        linkedList.add(11);
        linkedList.addFirst(1);
        linkedList.addLast(22);

        // Printing the first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Removing the first element
        linkedList.removeFirst();

        System.out.println("Size of the linked list: " + linkedList.size());

        // Iterating over the elements
        Iterator<Integer> iterator = linkedList.iterator();
        System.out.println("Elements of the linked list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Testing MyArrayList
        // Adding elements
        myList.add(25);
        myList.add(30);
        myList.add(35);
        myList.add(40);
        myList.add(45);
        myList.add(50);
        myList.add(55);

        // Test addFirst and addLast
        System.out.println("Size of the list before adding the first element: " + myList.size());
        myList.addFirst(20);
        System.out.println("Size of the list after adding the first element: " + myList.size());
        System.out.println("Size of the list before adding the last element: " + myList.size());
        myList.addLast(60);
        System.out.println("Size of the list after adding the last element: " + myList.size());

        // Test indexOf, getFirst, getLast
        System.out.println("Index of 4th element: " + myList.indexOf(35));
        System.out.println("First element of the list: " + myList.getFirst());
        System.out.println("Last element of the list: " + myList.getLast());

        // Test remove, removeFirst, removeLast
        System.out.println("Size of the list before removing the 4th element: " + myList.size());
        myList.remove(3);
        System.out.println("Size of the list after removing the 4th element: " + myList.size());
        System.out.println("Size of the list before removing the first element: " + myList.size());
        myList.removeFirst();
        System.out.println("Size of the list after removing the first element: " + myList.size());
        System.out.println("Size of the list before removing the last element: " + myList.size());
        myList.removeLast();
        System.out.println("Size of the list after removing the last element: " + myList.size());

        // Test lastIndexOf, exists, toArray, clear
        System.out.println("Last index of 50: " + myList.lastIndexOf(50));
        System.out.println("45 exists in the list: " + myList.exists(45));
        Object[] array = myList.toArray();
        System.out.println("Array representation of the list: ");
        for (Object item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        myList.clear();
        System.out.println("Size of the list after clearing: " + myList.size());
    }
}

