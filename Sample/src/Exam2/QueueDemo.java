package Exam2;

import java.util.Scanner;

class QueueException extends  Exception
{
    public QueueException(String msg)
    {
        super(msg);
    }
}


public class QueueDemo {
    public static void main(String[] args) {

        int ch = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the queue");
        int n = sc.nextInt();

        Queue q = new Queue(n);

        do {
            try{

                System.out.printf("1.Insert \n2.Delete\n3.Display\n4.Exit");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();

                switch (ch)
                {
                    case 1:
                        System.out.print("Enter item to be inserted: ");
                        int item = sc.nextInt();
                        q.insert(item);
                        break;

                    case 2: q.delete();
                            break;

                    case 3: q.display();
                            break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Enter a valid choice");
                }

            }
            catch (QueueException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }

            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("Enter a valid input");
                return;
            }


        }while (ch != 4);

    }

}

class Queue
{
    int n;
    int[] queue;
    int front;
    int rear;

    Queue(int n)
    {
        this.n = n;
        queue = new int[n];
        front = -1;
        rear = -1;
    }

    boolean isFull()
    {
        return rear == n-1;
    }

    boolean isEmpty()
    {
        return  front == -1 || front > rear;
    }

    void display() throws QueueException
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

    void insert(int item)
    {
        if(isFull())
        {
            throw new ArrayIndexOutOfBoundsException("Queue is Full");
        }

        if(front == -1)
        {
            front = 0;
        }

        queue[++rear] = item;
        System.out.println(item + " added to the queue");
    }


    void delete() throws  QueueException
    {
        if(isEmpty())
        {
            throw new QueueException("Queue is Empty");
        }

        int item = queue[front++];

        System.out.println(item + " removed from the queue");

    }



}
