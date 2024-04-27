public class MyLinkedList<T> implements MyList<T> {

    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T item){
        addLast(item);
    }

    public void set(int index, T item){
        checkIndex(index);
        MyNode current = getNode(index);
        current.data = item;
    }

    public void addFirst(T item){
        MyNode newNode = new MyNode(item);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }



}
