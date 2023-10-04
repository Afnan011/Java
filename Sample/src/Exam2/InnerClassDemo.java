package Exam2;

class Outer
{
    int a;
    Outer(int a)
    {
        this.a = a;
    }

    Inner in = new Inner(5);

    void display()
    {
        System.out.println("a = " + a + ", b = " + in.b);
    }

    class Inner
    {
        int b;
        Inner(int b)
        {
            this.b = b;
        }

        void sum()
        {
            System.out.println("sum = " + (a+b));
        }

    }

}

public class InnerClassDemo {

    public static void main(String[] args) {

        Outer out = new Outer(10);
        out.display();
        out.in.sum();

        Outer.Inner in = out. new Inner(20);
        in.sum();
    }
}
