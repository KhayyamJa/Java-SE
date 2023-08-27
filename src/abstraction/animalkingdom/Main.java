package abstraction.animalkingdom;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Coni", 7);
        dog.makeSound();
        dog.swim();

        Cat cat = new Cat("Like", 3);
        cat.makeSound();
        cat.swim();

        Bird bird = new Bird("Love", 1);
        bird.makeSound();
        bird.fly();


    }
}
