package Practice.lab6;


public class OverloadingOverridingDemo {
    public static void main(String[] args) {

        MathOperation op1 = new MathOperation(5, 4);
        MathOperation op2 = new MathOperation(.4, 4);

    }
}

class MathOperation
{
    MathOperation(int a, int b)
    {
        sum(a, b);
    }

    MathOperation(double a, double b)
    {
        sum(a, b);
    }

    public void sum(int a, int b)
    {
        print(a, b);
        System.out.println("Sum = " + (a+b));
    }

    public void sum(double a, double b)
    {
        print(a, b);
        System.out.println("Sum = " + (a+b));
    }

    public void print(int a, int b)
    {
        System.out.println("A = " + a + ", B = " + b);
    }

    public void print(double a, double b)
    {
        System.out.println("A = " + a + ", B = " + b);
    }
}

