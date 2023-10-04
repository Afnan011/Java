package Practice.lab9;
import  Practice.lab9.shape.*;


public class PackageDemo {
    public static void main(String[] args) {

        Square s = new Square(5);
        s.findArea();

        Triangle t = new Triangle(5, 5);
        t.findArea();

        Circle r = new Circle(5);
        r.findArea();

    }
}
