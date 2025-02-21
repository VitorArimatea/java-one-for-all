package academy.arimatea.maratonajava.javacore.Jfinalmodifier.test;

import academy.arimatea.maratonajava.javacore.Jfinalmodifier.domain.Car;
import academy.arimatea.maratonajava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Vítor");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.print();
        ferrari.setName("Ferrari SF90");
        ferrari.print();

    }
}
