package Practice.lab9.shape;

public class Square {

    float s;

    public Square(float s)
    {
        this.s = s;
    }

    public void findArea()
    {
        float area = s*s;
        System.out.println("Area of Square = " + area);
    }

}
