class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal myAnimal;  // Superclass reference

        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Outputs: Cat meows
    }
}
