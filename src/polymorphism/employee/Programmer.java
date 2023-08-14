package polymorphism.employee;

public class Programmer extends Employee {
    private double overtimePay;

    public Programmer(String name, String role, double baseSalary, double overtimePay) {
        super(name, role, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + overtimePay;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName()
                + "\nRole: " + getRole()
                + "\nBaseSalary: " + getBaseSalary()
                + "\nOvertime Pay: " + overtimePay
                + "\nFinal Salary: " + calculateSalary());
    }
}

