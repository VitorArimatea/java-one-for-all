package academy.arimatea.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in Database loader class");
    }
}
