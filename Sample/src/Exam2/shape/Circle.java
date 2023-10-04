package Exam2.shape;

public class Circle {

    float area;
    float r;

    public Circle(float r)
    {
        this.r = r;
    }

    public void findArea()
    {
        area = 3.14f * r * r;
        System.out.printf("Area of Triangle = %.2f\n" , area);
    }
}