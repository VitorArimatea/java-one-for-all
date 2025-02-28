package academy.arimatea.maratonajava.javacore.Npolymorphism.service;

import academy.arimatea.maratonajava.javacore.Npolymorphism.reposity.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving Memory...");
    }
}
