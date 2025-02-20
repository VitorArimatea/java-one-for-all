package academy.arimatea.maratonajava.javacore.Hinheritance.test;

import academy.arimatea.maratonajava.javacore.Hinheritance.domain.Address;
import academy.arimatea.maratonajava.javacore.Hinheritance.domain.Employee;
import academy.arimatea.maratonajava.javacore.Hinheritance.domain.Person;

import java.util.Scanner;

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---- Enter your address ----");
        System.out.println("Enter street: ");
        String street = input.nextLine();

        System.out.println("Enter city: ");
        String city = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.nextLine();

        System.out.println("Enter country: ");
        String country = input.nextLine();

        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setCountry(country);

        System.out.println("---- Register Person ----");
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your cpf: ");
        String cpf = input.nextLine();

        Person person = new Person(name);
        person.setCpf(cpf);
        person.setAddress(address);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        Employee employee = new Employee(name);
        employee.setCpf(cpf);
        employee.setAddress(address);
        employee.setSalary(salary);

        input.close();

        person.print();
        employee.print();
    }
}
