package abstraction.vehicleinterfaces;

public class Airplane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Airplane taking off.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying.");
    }

    @Override
    public void land() {
        System.out.println("Airplane landing.");

    }
}
