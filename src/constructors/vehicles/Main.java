package constructors.vehicles;

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Ford Mustang", 1970);
        Car car = new Car("Mercedes", 2020, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2020, true);

        System.out.println("Vehicle Details:");
        vehicle.displayDetails();

        System.out.println("\nCar Details:");
        car.displayDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();

    }
}

