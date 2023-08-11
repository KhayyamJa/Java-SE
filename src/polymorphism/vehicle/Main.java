package polymorphism.vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Car(80);
        int carSpeed = vehicle.speedUp();
        System.out.println("Car current speed: " + carSpeed);

        Vehicle vehicle1 = new Bicycle(5);
        int bicycleSpeed = vehicle1.speedUp();
        System.out.println("Bicycle current speed: " + bicycleSpeed);
    }

}
