package academy.arimatea.maratonajava.javacore.Npolymorphism.test;

import academy.arimatea.maratonajava.javacore.Npolymorphism.reposity.Repository;
import academy.arimatea.maratonajava.javacore.Npolymorphism.service.DatabaseRepository;
import academy.arimatea.maratonajava.javacore.Npolymorphism.service.FileRepository;
import academy.arimatea.maratonajava.javacore.Npolymorphism.service.MemoryRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        Repository repository2 = new FileRepository();
        Repository repository3 = new MemoryRepository();

        repository.save();
        repository2.save();
        repository3.save();

        List<String> list = new ArrayList<>();

        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        list.add("Luffy");
        list.add("Sanji");
        list.add("Zoro");

        System.out.println(list);
    }
}
