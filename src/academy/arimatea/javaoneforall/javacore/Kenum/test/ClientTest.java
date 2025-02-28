package academy.arimatea.javaoneforall.javacore.Kenum.test;

import academy.arimatea.javaoneforall.javacore.Kenum.domain.Client;
import academy.arimatea.javaoneforall.javacore.Kenum.domain.ClientType;
import academy.arimatea.javaoneforall.javacore.Kenum.domain.PaymentType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Vítor", ClientType.NATURAL_PERSON, PaymentType.DEBIT);
        Client client2 = new Client("Marina", ClientType.LEGAL_ENTITY, PaymentType.CREDIT);

        System.out.println(client);
        System.out.println(client2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100) + "%");
        System.out.println(PaymentType.CREDIT.calculateDiscount(100) + "%");
        ClientType clientType = ClientType.valueOf("NATURAL_PERSON");
        System.out.println(clientType);
        ClientType clientType1 = ClientType.clientTypeForNameReport("Pessoa Jurídica");
        System.out.println(clientType1);
    }
}
