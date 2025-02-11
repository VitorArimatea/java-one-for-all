package academy.arimatea.maratonajava.javacore.introductionclasses.test;

import academy.arimatea.maratonajava.javacore.introductionclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.name = "BMW M3";
        car.model = "sport";
        car.manufactureYear = 2025;

        System.out.println("\n----Car 1----\n" + "Name: " + car.name + "\nModel: " + car.model + "\nYear: "
                + car.manufactureYear);

        Car car2 = new Car();

        car2.name = "Corvette";
        car2.model = "sport";
        car2.manufactureYear = 2024;

        System.out.println("\n----Car 2----\n" + "Name: " + car2.name + "\nModel: " + car2.model + "\nYear: "
                + car2.manufactureYear);
    }
}
