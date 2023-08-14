package polymorphism.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Manager("Khayyam", "Manager", 1500, 700);
        System.out.println("Manager: ");
        employee.display();

        System.out.println("\nProgrammer: ");
        Employee employee1 = new Programmer("Orkhan", "Programmer", 2400, 1100);
        employee1.display();


    }
}
