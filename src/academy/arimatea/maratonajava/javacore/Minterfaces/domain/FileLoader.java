package academy.arimatea.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading files...");
    }

    @Override
    public void remove() {

    }
}
