package academy.arimatea.maratonajava.javacore.Labstractclasses.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;
    protected String areaActivity;

    public Employee(String name, double salary, String areaActivity) {
        this.name = name;
        this.salary = salary;
        this.areaActivity = areaActivity;
        bonusCalculate();
    }

    @Override
    public String toString() {
        return "Designer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", areaActivity='" + areaActivity + '\'' +
                '}';
    }

    public abstract void bonusCalculate();

    @Override
    public void print() {
        System.out.println("Print");
    }
}
