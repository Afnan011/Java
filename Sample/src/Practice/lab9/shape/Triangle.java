package Practice.lab9.shape;

public class Triangle {

    float b;
    float h;

    public Triangle(float b, float h)
    {
        this.h = h;
        this.b = b;
    }

    public void findArea()
    {
        float area = (b * h) / 2;
        System.out.println("Area of Square = " + area);
    }

}
