package academy.arimatea.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 100;

    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in Interface");
    }
}
