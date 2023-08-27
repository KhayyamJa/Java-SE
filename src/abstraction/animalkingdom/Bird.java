package abstraction.animalkingdom;

public class Bird extends Animal implements Fly {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cik cik cik");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}
