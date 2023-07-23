package Assignment1;

public class AnimalEx {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound(); // Output: Woof
        animal2.makeSound(); // Output: Meow
        animal3.makeSound(); // Output: Moo
    }
}
abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

