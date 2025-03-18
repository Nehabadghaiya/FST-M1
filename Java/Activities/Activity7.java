--------------Single Inheritance-----------

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Output: Animal is eating
        myDog.bark(); // Output: Dog is barking
    }
}

----------------------Multi level Inheritance-----------

/ Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Labrador extends Dog {
    void display() {
        System.out.println("Labrador is a type of Dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();   // Inherited from Animal
        labrador.bark();  // Inherited from Dog
        labrador.display();  // Defined in Labrador class
    }
}
