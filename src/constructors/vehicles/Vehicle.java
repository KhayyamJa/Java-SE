package constructors.vehicles;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }


    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }

}
