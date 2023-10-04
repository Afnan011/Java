package Practice.lab5;

public class AbstractDemo {
    public static void main(String[] args) {

        Animal cat = new PersianCat("simbha", 8);
        cat.eat();
        cat.getName();
        cat.getAge();

    }

}

abstract class Animal
{
    abstract void getName();
    abstract void getAge();
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

abstract class Cat extends Animal
{
    String name;

    Cat(String name)
    {
        this.name = name;
    }

    void getName()
    {
        System.out.println("Name: " + name);
    }
}

class PersianCat extends Cat
{
    String name;
    int age;

    PersianCat(String name, int age)
    {
        super(name);
        this.age = age;
    }

    void getAge()
    {
        System.out.println("Age: " + age);
    }
}