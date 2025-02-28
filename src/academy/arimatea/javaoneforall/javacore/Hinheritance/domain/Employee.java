package academy.arimatea.javaoneforall.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estático Employee 1");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático Employee 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização Employee 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização Employee 2 ");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Construtor employee");
    }

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
