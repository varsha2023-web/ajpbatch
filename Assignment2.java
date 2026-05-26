package lab04;

// Superclass
class Animal {

    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Subclass Cat
class Cat extends Dog {

    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

// Main class
public class Assignment2 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }
}