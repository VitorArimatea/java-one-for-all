package academy.arimatea.maratonajava.javacore.introductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printEmployeeData() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Age: " + this.age);

        if (salaries == null) {
            return;
        }

        for (double salary : salaries) {
            System.out.println("Salary: " + salary);
        }

        averageSalary();
    }

    public void averageSalary() {
        if (salaries == null) {
            return;
        }

        double average = 0;

        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;

        System.out.println("Average Salary's: " + average);
    }
}
