package polymorphism.vehicle;

public class Bicycle extends Vehicle {
    private int bicycleSpeed;

    public Bicycle(int bicycleSpeed) {
        this.bicycleSpeed = bicycleSpeed;
    }

    @Override
    public int speedUp() {
        return bicycleSpeed += 5;
    }
}


