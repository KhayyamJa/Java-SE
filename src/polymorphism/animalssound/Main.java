package polymorphism.animalssound;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.sound();

        Animal animal1 = new Cat();
        animal1.sound();
    }
}

