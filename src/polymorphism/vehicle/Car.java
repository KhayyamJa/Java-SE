package polymorphism.vehicle;

public class Car extends Vehicle {
    private int carSpeed;

    public Car(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public int speedUp() {
        return carSpeed += 20;
    }
}
