package academy.arimatea.maratonajava.javacore.Npolymorphism.test;

import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.VideoGame;
import academy.arimatea.maratonajava.javacore.Npolymorphism.service.ProductTaxCalculate;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("Macbook", 20000);
        Tomato tomato = new Tomato("Cherry tomato", 4);
        Product product = new VideoGame("Xbox Series X", 4499);

        ProductTaxCalculate.calculateTax(computer);
        ProductTaxCalculate.calculateTax(tomato);
        ProductTaxCalculate.calculateTax(product);
    }
}
