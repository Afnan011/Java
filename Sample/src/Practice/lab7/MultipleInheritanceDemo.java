package Practice.lab7;

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Calculate cal = new Calculate();

        cal.rectArea(4, 5);
        cal.triArea(6, 8);
    }

}

interface rect
{
    public void rectArea(double l, double b);
}

interface tri
{
    public void triArea(double b, double h);
}

class Calculate implements rect, tri
{
    public void rectArea(double l, double b)
    {
        double res = l * b;
        System.out.printf("Area of Rectangle = %.2f\n",  res);
    }

    public void triArea(double b, double h)
    {
        double res = (b * h)/2;
        System.out.println("Area of Triangle = " + res);
    }
}
