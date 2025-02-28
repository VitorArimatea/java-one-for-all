package academy.arimatea.javaoneforall.javacore.Npolymorphism.test;

import academy.arimatea.javaoneforall.javacore.Npolymorphism.reposity.Repository;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.service.DatabaseRepository;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.service.FileRepository;
import academy.arimatea.javaoneforall.javacore.Npolymorphism.service.MemoryRepository;

import java.util.ArrayList;
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
