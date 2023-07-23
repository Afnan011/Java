public class Main {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node temp = head;

        if (head == null) {
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverse() {
        Node ptr1, ptr2;
        ptr1 = ptr2 = null;


        if (head == null) {
            System.out.println("list is empty!");
            return;
        }



    }



    public static void main(String[] args) {

        Main list1 = new Main();
//        list1.addNode(10);
//        list1.addNode(20);
//        list1.addNode(30);
//        list1.addNode(40);
//        list1.addNode(50);

        list1.reverse();
        list1.display();
    }

}