package StackQueue;

public class Stack {

    class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    public Node top;

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        Node temp = top;

        if (top == null) {
            System.out.println("stack underflow!");
            return;
        }

        top = top.next;
        System.out.println("\n" + temp.data + " removed successfully.");

    }

    public void display() {
        Node currentPtr = top;

        if (top == null) {
            System.out.println("Stack is empty");
        }

        while (currentPtr != null) {
            System.out.print(currentPtr.data + " <- ");
            currentPtr = currentPtr.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();

        stack.pop();
        stack.display();

    }
}
