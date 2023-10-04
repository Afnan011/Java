package Exam2;

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
        System.out.println("Name = " + name);
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
        System.out.println("Age = " + age);
    }

}

public class AbsDemo {
    public static void main(String[] args) {
        Animal c1 = new PersianCat("simbha", 11);

        c1.eat();
        c1.getName();
        c1.getAge();
    }
}
