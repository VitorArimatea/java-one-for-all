package academy.arimatea.javaoneforall.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.2;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        return value * TAX_PERCENTAGE;
    }
}
