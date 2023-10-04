package Exam2.shape;

public class Square {

    float area;
    float s;

    public Square(float s)
    {
        this.s = s;
    }

    public void findArea()
    {
        area = s*s;
        System.out.printf("Area of Square = %.2f\n" , area);
    }
}
