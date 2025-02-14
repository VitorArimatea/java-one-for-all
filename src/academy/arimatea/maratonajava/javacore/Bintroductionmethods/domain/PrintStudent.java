package academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain;

public class PrintStudent {
    public void print(Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println("---------------");
    }
}
