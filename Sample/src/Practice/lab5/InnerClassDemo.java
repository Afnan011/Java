package Practice.lab5;

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer out = new Outer(10, 20);
        out.display();

        out.in.getSum();

//        Outer.Inner in = out. new Inner(10);
//        in.getSum();

    }
}

class Outer
{
    int a;
    Inner in;

    public Outer(int a)
    {
        this.a = a;
        in = new Inner(a);
    }

    public Outer(int a, int x)
    {
        this.a = a;
        in = new Inner(x);
    }

    class Inner
    {
        int b;

        Inner(int b)
        {
            this.b = b;
        }

        public void getSum()
        {
            System.out.println("Sum = " + (a+b));
        }

    }


    public void display()
    {
        System.out.println("A = " + a + ",  B = " + in.b);
    }

}
