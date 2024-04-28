public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        MyStack<Integer> stack = new MyStack<>();

        // Testing MyStack
        stack.push(12);
        stack.push(23);
        stack.push(34);

        // Print the top item of the stack
        System.out.println("Top item of the stack: " + stack.peek());

        // Pop items from the stack
        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

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
        System.out.println("45 exists in the list? " + myList.exists(45));
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

