package academy.arimatea.maratonajava.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    @Override
    public void print() {
        super.print();
        System.out.println("---- Employee Data " + this.name + " ----");
        System.out.println("Salary: " + "R$" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
