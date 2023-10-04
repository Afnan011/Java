package Exam2;
import Exam2.shape.*;

public class PackageDemo {

    public static void main(String[] args) {

        Square s = new Square(5);
        s.findArea();

        Triangle t = new Triangle(5, 5);
        t.findArea();

        Circle c = new Circle(5);
        c.findArea();


    }

}
