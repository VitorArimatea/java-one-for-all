package academy.arimatea.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    NATURAL_PERSON(1, "Pessoa Física"),
    LEGAL_ENTITY(2, "Pessoa Jurídica");

    private int value;
    private String nameReport;

    ClientType(int value, String nameReport) {
        this.value = value;
        this.nameReport = nameReport;
    }

    public static ClientType clientTypeForNameReport(String nameReport) {
        for (ClientType clientType : values()) {
            if(clientType.getNameReport().equals(nameReport)) {
                return clientType;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getNameReport() {
        return nameReport;
    }
}
