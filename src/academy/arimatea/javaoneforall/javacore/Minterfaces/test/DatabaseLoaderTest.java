package academy.arimatea.javaoneforall.javacore.Minterfaces.test;

import academy.arimatea.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import academy.arimatea.javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;
import academy.arimatea.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DatabaseLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
