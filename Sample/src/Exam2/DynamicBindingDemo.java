package Exam2;

class SumTwo
{
    int a;
    int b;

    SumTwo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    int sum()
    {
        return a+b;
    }
}

class SumThree extends SumTwo
{
    int c;

    SumThree(int a, int b, int c)
    {
        super(a, b);
        this.c = c;
    }

    int sum()
    {
        return  a+b+c;
    }
}


public class DynamicBindingDemo {

    public static void main(String[] args) {

        SumTwo ob;

        ob = new SumTwo(10, 20);
        System.out.println("sum = " + ob.sum());

        ob = new SumThree(10, 20, 30);
        System.out.println("sum = " + ob.sum());
    }
}
