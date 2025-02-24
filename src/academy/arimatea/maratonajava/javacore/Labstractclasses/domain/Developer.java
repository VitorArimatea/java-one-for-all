package academy.arimatea.maratonajava.javacore.Labstractclasses.domain;

public class Developer extends Employee{

    public Developer(String name, double salary, String areaActivity) {
        super(name, salary, areaActivity);
    }

    @Override
    public void bonusCalculate() {
        this.salary = salary + salary * 0.05;
    }
}
