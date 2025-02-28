package academy.arimatea.javaoneforall.javacore.Npolymorphism.service;

import academy.arimatea.javaoneforall.javacore.Npolymorphism.reposity.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving Memory...");
    }
}
