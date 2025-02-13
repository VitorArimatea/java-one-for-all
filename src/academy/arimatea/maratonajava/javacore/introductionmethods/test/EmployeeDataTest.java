package academy.arimatea.maratonajava.javacore.introductionmethods.test;

import academy.arimatea.maratonajava.javacore.introductionmethods.domain.Employee;

public class EmployeeDataTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Vítor");
        employee.setAge(20);
        employee.setSalaries(new double[]{7500, 10000, 30000});

        employee.printEmployeeData();

        System.out.println("Average: " + employee.getAverage());
    }
}
