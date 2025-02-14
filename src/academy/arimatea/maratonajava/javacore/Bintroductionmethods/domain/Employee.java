package academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

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

        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;

        System.out.println("Average Salary's: " + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
