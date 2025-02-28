package academy.arimatea.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading files...");
    }

    @Override
    public void remove() {

    }
}
