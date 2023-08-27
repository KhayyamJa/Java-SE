package abstraction.animalkingdom;

public class Dog extends Animal implements Swim {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Hav hav hav");
    }

    @Override
    public void swim() {
        System.out.println("Dog swims");
    }
}
