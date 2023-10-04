package Practice.lab4;

public class DynamicBindingDemo {
    public static void main(String[] args) {

        SumTwo ob;

        ob = new SumTwo();
        int res = ob.getSum();
        System.out.println("Sum = " + res);

        ob = new SumThree();
        res = ob.getSum();
        System.out.println("Sum = " + res);
    }
}


class SumTwo
{
    int a = 10;
    int b = 20;

    public int getSum()
    {
        return  a+b;
    }
}


class SumThree extends SumTwo
{
    int c = 30;

    public int getSum()
    {
        return  a+b+c;
    }
}