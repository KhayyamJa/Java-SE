package constructors.vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, int year, int numberOfDoors) {
        super(make, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number Of Doors: " + numberOfDoors);
    }
}

