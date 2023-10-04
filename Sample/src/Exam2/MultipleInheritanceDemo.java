package Exam2;

interface Rect
{
    public void rectArea(double l, double b);
}

interface Tri
{
    public void triArea(double b, double h);
}

class CalculateArea implements Rect, Tri
{
    public void rectArea(double l, double b)
    {
        double area = (l * b);
        System.out.printf("Area of Rectangle = %.2f\n" , area);
    }
    public void triArea(double b, double h)
    {
        double area = (b*h)/2;
        System.out.printf("Area of Triangle = %.2f\n" , area);
    }


}


public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        CalculateArea ob = new CalculateArea();

        ob.rectArea(4, 5);
        ob.triArea(6, 8);

    }
}
