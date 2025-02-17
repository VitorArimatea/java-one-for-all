package academy.arimatea.maratonajava.javacore.staticmodifier.domain;

public class Car {
    private String name = "Default Car";
    private double maxSpeed;
    public static double limitSpeed = 250;

    public void print () {
        System.out.println("-----------------------");
        System.out.println("Car name: " + this.name);
        System.out.println("Maximum Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + Car.limitSpeed);
    }

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }
}
