package polymorphism.employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String role, double baseSalary, double bonus) {
        super(name, role, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + bonus;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName()
                + "\nRole: " + getRole()
                + "\nBaseSalary: " + getBaseSalary()
                + "\nBonus: " + bonus
                + "\nFinal Salary: " + calculateSalary());
    }
}

