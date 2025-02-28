package academy.arimatea.javaoneforall.javacore.Npolymorphism.domain;

public abstract class Product implements TaxProduct {
    protected String name;
    protected double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
