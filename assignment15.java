class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog says: Woof");
    }
}

class Rabbit extends Animal {

    @Override
    void sound() {
        System.out.println("Rabbit says: Squeak");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Rabbit();

        a1.sound();
        a2.sound();
    }
}
