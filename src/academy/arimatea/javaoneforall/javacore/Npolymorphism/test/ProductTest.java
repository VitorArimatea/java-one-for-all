package academy.arimatea.javaoneforall.javacore.Npolymorphism.test;

import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.VideoGame;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.service.ProductTaxCalculate;

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
