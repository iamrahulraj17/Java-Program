interface Animal {
    void sound(); // Abstract method (public and abstract by default)
    
    // Default method (with implementation)
    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    // Providing implementation of the abstract method
    public void sound() {
        System.out.println("Dog barks");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
        myDog.eat();   // Outputs: This animal eats food.
    }
}
