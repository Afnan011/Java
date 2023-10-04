package Practice.lab9;

import java.util.Scanner;

class QueueException extends Exception
{
    public QueueException(String msg)
    {
        super(msg);
    }
}

public class QueueDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch = 0;
        System.out.println("Enter the size of the queue");
        int n = sc.nextInt();

        Queue q = new Queue(n);

        do{
            try{

                System.out.println("\n1.Insert \n2.Delete \n3.Display \n4.Exit");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();

                switch (ch)
                {
                    case 1:
                        System.out.print("Enter item to be inserted: ");
                        int item = sc.nextInt();
                        q.insert(item);
                        break;

                    case 2:
                        q.delete();
                        break;

                    case 3:
                        q.display();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;
                }

            }
            catch (QueueException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("Please enter a valid input");
                return;
            }


        }
        while (ch != 4);

    }
}



class Queue
{
    int n;
    int[] queue;
    int front;
    int rear;

    public Queue(int n)
    {
        this.n = n;
        queue = new int[n];
        front = -1;
        rear = -1;
    }


    public boolean isEmpty()
    {
        return front == -1 || front > rear;
    }

    public boolean isFull()
    {
        return rear == n-1;
    }

    public void display() throws QueueException
    {
        if(isEmpty())
        {
            throw new QueueException("Queue is Empty");
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


    public void insert(int item) throws QueueException
    {
        if(isFull())
        {
            throw new QueueException("Queue is Full");
        }

        if(front == -1)
        {
            front = 0;
        }

        queue[++rear] = item;
        System.out.println(item + " added to the queue");
    }

    public void delete() throws QueueException
    {
        if(isEmpty())
        {
            throw new QueueException("Queue is Empty");
        }

       int item = queue[front++];
        System.out.println(item + " removed from the queue");
    }

}

