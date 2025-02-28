package academy.arimatea.javaoneforall.javacore.Npolymorphism.service;

import academy.arimatea.javaoneforall.javacore.Npolymorphism.reposity.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving Database...");
    }
}
