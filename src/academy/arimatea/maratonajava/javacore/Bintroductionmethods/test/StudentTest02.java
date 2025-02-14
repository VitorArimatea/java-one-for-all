package academy.arimatea.maratonajava.javacore.Bintroductionmethods.test;

import academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Vítor";
        student.age = 20;
        student.sex = 'M';

        student2.name = "Marina";
        student2.age = 19;
        student2.sex = 'F';


        student.printStudent();
        student2.printStudent();
    }
}
