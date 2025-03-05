package academy.arimatea.javaoneforall.javacore.Oexception.exception.test;

import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.Employee;
import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.InvalidLoginException;
import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverrideWithExceptionsTest {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
            person.save();
        } catch (InvalidLoginException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
