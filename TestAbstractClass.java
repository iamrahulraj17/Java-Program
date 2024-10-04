abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();
    
    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Providing implementation of the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class TestAbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
        myDog.eat();   // Outputs: This animal eats food.
    }
}
