package academy.arimatea.maratonajava.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 100;
    public final Buyer BUYER = new Buyer();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
