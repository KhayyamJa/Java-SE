package abstraction.animalkingdom;

public class Cat extends Animal implements Swim {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaw miaw miaw");
    }

    @Override
    public void swim() {
        System.out.println("Cat swims");
    }
}
