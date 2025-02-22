package academy.arimatea.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private ClientType clientType;
    private PaymentType PaymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        PaymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getNameReport() +
                ", clientType=" + clientType.getValue() +
                ", PaymentType=" + PaymentType +
                '}';
    }
}
