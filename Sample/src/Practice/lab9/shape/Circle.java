package Practice.lab9.shape;

public class Circle {

    float r;

    public Circle(float r)
    {
        this.r = r;
    }

    public void findArea()
    {
        float area = 3.14f * r * r;
        System.out.println("Area of Square = " + area);
    }

}
