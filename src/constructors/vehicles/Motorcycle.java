package constructors.vehicles;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, int year, boolean hasSidecar) {
        super(make, year);
        this.hasSidecar = hasSidecar;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sidecar: " + hasSidecar);
    }

}

