package academy.arimatea.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private String type;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Client(String name, String type) {
        if(!type.equals(PESSOA_FISICA) && !type.equals(PESSOA_JURIDICA)) {
            return;
        }

        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
