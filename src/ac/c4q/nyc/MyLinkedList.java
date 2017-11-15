package ac.c4q.nyc;

public class MyLinkedList<E> {


    private Node head;
    private int size;

    private class Node {
        public E data;
        public Node next;
        public Node prev;
    }
    public Node getHead() {
        return head;
    }



    public void add(E e){
        if (head == null){
            head = new Node();
            head.data = e;

        }else {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = head;
            head = newNode;
        }
        ++size;
    }

    public void add(E... e){

        for (E n : e){
            add(n);
        }
    }

    public void print(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("*");
    }


    public int size(){
        return size;

    }

    public E get(int index){
        Node node = head;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                return node.data;
            } else {
                node = node.next;
                ++counter;
            }
        }
        return null;

    }

    public int indexOf(E data) {
        int counter = 0;
        Node node = head;
        while (node != null) {
            if (node.data.equals(data)) {
                return counter;
            } else {
                node = node.next;
                ++counter;
            }
        }
        return -1;
    }

    public void remove (E n){
        Node current = head;
        if (current.data.equals(n)){
            head = head.next;
        }

        while (current.next != null) {
            if (current.next.data.equals(n)) {
                current.next = current.next.next;


            } else {
                current = current.next;
            }
        }
        --size;

    }





}
