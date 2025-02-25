package academy.arimatea.maratonajava.javacore.Npolymorphism.service;

import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxCalculate {
    public static void taxComputer(Computer computer) {
        double tax = computer.taxCalculate();

        System.out.println("\n----------- Product Tax ----------");
        System.out.println("Computer: " + computer.getName());
        System.out.println("Value: " + computer.getValue());
        System.out.println("Tax: " + tax);
    }

    public static void taxTomato(Tomato tomato) {
        double tax = tomato.taxCalculate();

        System.out.println("\n----------- Product Tax ----------");
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Value: " + tomato.getValue());
        System.out.println("Tax: " + tax);
    }
}
