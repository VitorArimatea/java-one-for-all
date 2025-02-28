package academy.arimatea.javaoneforall.javacore.Hinheritance.domain;

public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I'm a Software Developer " + this.name);
    }
}
