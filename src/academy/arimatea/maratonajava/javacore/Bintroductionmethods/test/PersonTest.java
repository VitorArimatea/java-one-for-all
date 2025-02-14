package academy.arimatea.maratonajava.javacore.Bintroductionmethods.test;

import academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("João");
        person.setAge(-26);

        person.printPerson();
    }
}
