package academy.arimatea.javaoneforall.javacore.Hinheritance.domain;

public class Person {
    protected String name = "Default User";
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Dentro do bloco de inicialização estático Person 1");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático Person 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização Person 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização Person 2");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("dentro do construtor Person");
    }

    public void print() {
        System.out.println("---- Person Data ----");

        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
