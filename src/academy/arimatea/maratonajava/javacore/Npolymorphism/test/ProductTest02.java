package academy.arimatea.maratonajava.javacore.Npolymorphism.test;

import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Galaxy Book 2025", 3500);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.taxCalculate());

        Product product2 = new Tomato("Hybrid Tomato", 10);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.taxCalculate());
    }
}
