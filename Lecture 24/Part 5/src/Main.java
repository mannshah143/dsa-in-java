// abstraction --> hiding irrelevant information from the user
// two ways --> abstract classes and interfaces

// abstract class must be declared with abstract keyword
abstract class Animal {
    // abstract class can have abstract and non-abstract methods
    abstract void walks();
    public void eats() {
        System.out.println("eating");
    }
    Animal() {
        System.out.println("new animal created");
    }
}

class Dog extends Animal {
    public void walks() {
        System.out.println("dog is walking");
    }
}

class Cat extends Animal {
    public void walks() {
        System.out.println("cat is walking");
    }
    Cat() {
        System.out.println("new cat created");
    }
}

// interface --> pure abstraction
interface Bird {
    // all fields are public, static and final by default
    // all methods are public and abstract by default
    void fly();
}

interface Herbivore {

}

// multiple inheritance in java --> possible through interfaces and not classes
class Peacock implements Bird, Herbivore {
    public void fly() {
        System.out.println("peacock is flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walks();
        dog.eats();
        /* Animal animal = new Animal(); --> error: abstract class cannot be instantiated
        animal.walks(); */
        // constructor chaining --> first base class constructor is called and then derived class constructor
        Cat cat = new Cat();
        Peacock peacock = new Peacock();
        peacock.fly();
    }
}