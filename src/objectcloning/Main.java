package objectcloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("Khayyam");

        Person clonedPerson = (Person) person.clone();

        System.out.println(person.name);
        System.out.println(clonedPerson.name);

    }
}
