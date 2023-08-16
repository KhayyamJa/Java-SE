package abstraction.vehicleinterfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate(100);
        car.brake();
        car.stop();

        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}

