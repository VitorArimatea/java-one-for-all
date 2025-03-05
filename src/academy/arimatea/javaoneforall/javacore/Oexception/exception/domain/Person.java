package academy.arimatea.javaoneforall.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving person");
    }
}
