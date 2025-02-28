package academy.arimatea.javaoneforall.javacore.Npolymorphism.service;

import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxCalculate {
    public static void calculateTax(Product product) {
        double tax = product.taxCalculate();

        System.out.println("\n----------- Product Tax ----------");
        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax: " + tax);

        if(product instanceof Tomato) {
            Tomato tomato = (Tomato) product;

//            Other declarations options
//            ((Tomato) product).getExpirationDate();
//            String expirationDate = ((Tomato) product).getExpirationDate()
//            System.out.println((Tomato) product).getExpirationDate();

            System.out.println(tomato.getExpirationDate());
        }
    }
}
