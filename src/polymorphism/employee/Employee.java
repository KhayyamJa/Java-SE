package polymorphism.employee;

public class Employee {
    private String name;
    private String role;
    private double baseSalary;

    public Employee(String name, String role, double baseSalary) {
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void display() {
        System.out.println("Name: " + name
                + "\nRole: " + role
                + "\nBaseSalary: " + baseSalary);
    }
}

