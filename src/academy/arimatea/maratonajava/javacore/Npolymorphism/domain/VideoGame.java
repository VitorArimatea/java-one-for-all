package academy.arimatea.maratonajava.javacore.Npolymorphism.domain;

public class VideoGame extends Product {
    public static final double TAX_PERCENTAGE = 0.4;

    public VideoGame(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        return value * TAX_PERCENTAGE;
    }
}
