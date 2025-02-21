package academy.arimatea.maratonajava.javacore.Kenum.test;

import academy.arimatea.maratonajava.javacore.Kenum.domain.Client;
import academy.arimatea.maratonajava.javacore.Kenum.domain.ClientType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Vítor", ClientType.PESSOA_FISICA);
        Client client2 = new Client("Marina", ClientType.PESSOA_JURIDICA);
        Client client3 = new Client("Joaquim", ClientType.PESSOA_JURIDICA);
        Client client4 = new Client("Paola", ClientType.PESSOA_FISICA);
        Client client5 = new Client("Gerald", ClientType.PESSOA_FISICA);

        System.out.println(client);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
        System.out.println(client5);
    }
}
