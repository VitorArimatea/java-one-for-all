package academy.arimatea.maratonajava.javacore.Kenum.test;

import academy.arimatea.maratonajava.javacore.Kenum.domain.Client;
import academy.arimatea.maratonajava.javacore.Kenum.domain.ClientType;
import academy.arimatea.maratonajava.javacore.Kenum.domain.PaymentType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Vítor", ClientType.NATURAL_PERSON, PaymentType.DEBIT);
        Client client2 = new Client("Marina", ClientType.LEGAL_ENTITY, PaymentType.CREDIT);

        System.out.println(client);
        System.out.println(client2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100) + "%");
    }
}
