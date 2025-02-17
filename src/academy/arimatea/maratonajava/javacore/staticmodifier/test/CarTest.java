package academy.arimatea.maratonajava.javacore.staticmodifier.test;

import academy.arimatea.maratonajava.javacore.staticmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car.setLimitSpeed(160);

        Car car = new Car("Porshe 911 Carrera GTS", 312);
        Car car2 = new Car("BMW M3", 290);
        Car car3 = new Car("Audi Q8", 250);

        System.out.println(Car.getLimitSpeed());

        car.print();
        car2.print();
        car3.print();
    }
}
