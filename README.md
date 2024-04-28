**Assignment 2** 

**MyArrayList**
This class provides methods for adding, getting, setting and removing elements. 

Usage:
```
MyArrayList<Integer> myList = new MyArrayList<>();
myList.add(25);
myList.add(30);
myList.add(35);
myList.add(40);
myList.add(45);
myList.add(50);
myList.add(55);

    
System.out.println("Size of the list before adding the first element: " + myList.size());
myList.addFirst(20);
System.out.println("Size of the list after adding the first element: " + myList.size());
System.out.println("Size of the list before adding the last element: " + myList.size());
myList.addLast(60);
System.out.println("Size of the list after adding the last element: " + myList.size());
     
System.out.println("Index of 4th element: " + myList.indexOf(35));
System.out.println("First element of the list: " + myList.getFirst());
System.out.println("Last element of the list: " + myList.getLast());

        System.out.println("Size of the list before removing the 4th element: " + myList.size());
        myList.remove(3);
        System.out.println("Size of the list after removing the 4th element: " + myList.size());
        System.out.println("Size of the list before removing the first element: " + myList.size());
        myList.removeFirst();
        System.out.println("Size of the list after removing the first element: " + myList.size());
        System.out.println("Size of the list before removing the last element: " + myList.size());
        myList.removeLast();
        System.out.println("Size of the list after removing the last element: " + myList.size());

       
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
```

**MyLinkedList(Doubly)**
This class also includes methods for adding, getting, setting, removing elements.

Usage:
```
MyLinkedList<Integer> linkedList = new MyLinkedList<>();
linkedList.add(11);
linkedList.addFirst(1);
linkedList.addLast(22);        
System.out.println("First element: " + linkedList.getFirst());
System.out.println("Last element: " + linkedList.getLast());
linkedList.removeFirst();
System.out.println("Size of the linked list: " + linkedList.size());
Iterator<Integer> iterator = linkedList.iterator();
System.out.println("Elements of the linked list:");
while (iterator.hasNext()) {
  System.out.println(iterator.next());
}
```

**MyQueue**
'MyQueue' class is linked list implementation, follows the FIFO(First In, First Out) principle.
Class includes methods for enqueueing, dequeueing, and peeking at elements.

Usage:
```
MyQueue<Integer> queue = new MyQueue<>();
queue.enqueue(43);
queue.enqueue(21);
queue.enqueue(38);
System.out.println("Peeked element: " + queue.peek());
while (!queue.isEmpty()) {
  System.out.println("Dequeued element: " + queue.dequeue());
}
System.out.println("The queue is empty: " + queue.isEmpty());

**MyStack**
Implementation of stack data structure. It includes methods for pushing, popping, peeking elements by LIFO(Last In, First Out) principle.
Usage: 
MyStack<Integer> stack = new MyStack<>();
stack.push(12);
stack.push(23);
stack.push(34);
System.out.println("Top item of the stack: " + stack.peek());
System.out.println("Popped item: " + stack.pop());
System.out.println("Popped item: " + stack.pop());
System.out.println("The stack is empty: " + stack.isEmpty());
```
**MyMinHeap**
'MyMinHeap' class is an implementation of a min-heap, it maintains the minimum element at the root of the heap. The class provides methods for inserting elements, extracting the minimum element, returning the minimum element.

Usage:
```
MyMinHeap<Integer> minHeap = new MyMinHeap<>();
minHeap.insert(10);
minHeap.insert(5);
minHeap.insert(15);
minHeap.insert(3);
minHeap.insert(8);
System.out.println("Minimum element: " + minHeap.peekMin());
System.out.println("Extracted minimum element: " + minHeap.extractMin());
System.out.println("Minimum element after extraction: " + minHeap.peekMin());
System.out.println("The heap is empty: " + minHeap.isEmpty());
```
