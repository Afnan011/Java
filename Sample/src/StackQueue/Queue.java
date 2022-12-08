package StackQueue;

public class Queue {
    class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    public Node front;            // delete
    public Node rear;             // insert

    public void enQueue(int data){
        Node newNode = new Node(data);

        if (rear == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void deQueue(){
        Node temp = front;

        if (front == null){
            System.out.println("Queue underflow!");
            return;
        }

        front = front.next;

        if (front == null){
            rear = null;
        }

        System.out.println("\n" + temp.data + " removed successfully.");

    }

    public void display() {
        Node currentPtr = front;

        if (front == null) {
            System.out.println("Queue is empty");
        }

        System.out.println("Queue elements are...");
        while (currentPtr != null) {
            if (currentPtr.next == null){
                System.out.print(currentPtr.data);
                return;
            }
            System.out.print(currentPtr.data + " <- ");
            currentPtr = currentPtr.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        queue.display();

        queue.deQueue();
        queue.display();

        queue.deQueue();
        queue.display();

    }
}
