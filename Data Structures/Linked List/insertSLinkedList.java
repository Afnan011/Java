public class insertSLinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertNode(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public void display() {

        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteNode(int data) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;

    }

    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while(temp != null && temp.data == nextTo){
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        if(temp == tail){
            tail.next = newNode;
            tail = newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }


    public static void main(String[] args) {

        insertSLinkedList list = new insertSLinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(50);
        list.insertNode(80);
        list.insertNode(90);
        list.display();

        list.deleteNode(90);
        System.out.println("\nNode deleted successfully.");
        list.display();
        
        list.insertAfter(10, 40);
        System.out.println("\nNode after insertion successfully.");
        list.display();
        
    }
}