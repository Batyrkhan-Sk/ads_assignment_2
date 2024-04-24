public class Main {
    public static void main(String[] args) {
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
        System.out.println("First element of the list: " + myList.getFirst());
        System.out.println("Last element of the list: " + myList.getLast());
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Get the last element of the list: " + myList.getLast());

    }
}
