class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

class Rabbit extends Animal {

    Rabbit(String name) {
        super(name);
    }

    void hop() {
        System.out.println(name + " is hopping");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Rabbit rabbit = new Rabbit("Bunny");

        dog.eat();
        dog.bark();
        dog.sleep();

        System.out.println();

        rabbit.eat();
        rabbit.hop();
        rabbit.sleep();
    }
}
