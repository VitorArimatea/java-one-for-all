package academy.arimatea.maratonajava.javacore.Kenum.test;

import academy.arimatea.maratonajava.javacore.Kenum.domain.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Vítor", "PESSOA_FISICA");
        Client client2 = new Client("Marina", "PESSOA_JURIDICA");
        Client client3 = new Client("Joaquim", "Pessoa Juridica");
        Client client4 = new Client("Paola", "pessoa_juridica");

        System.out.println(client);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}
