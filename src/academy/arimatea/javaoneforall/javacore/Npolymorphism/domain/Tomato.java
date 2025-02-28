package academy.arimatea.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.05;
    public String expirationDate;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        return value * TAX_PERCENTAGE;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
