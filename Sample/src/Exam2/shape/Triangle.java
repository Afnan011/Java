package Exam2.shape;

public class Triangle {

    float area;
    float b;
    float h;

    public Triangle(float b, float h)
    {
        this.b = b;
        this.h = h;
    }

    public void findArea()
    {
        area = (b*h)/2;
        System.out.printf("Area of Triangle = %.2f\n" , area);
    }
}
