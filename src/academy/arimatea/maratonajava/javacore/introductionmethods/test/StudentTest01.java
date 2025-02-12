package academy.arimatea.maratonajava.javacore.introductionmethods.test;

import academy.arimatea.maratonajava.javacore.introductionmethods.domain.Student;
import academy.arimatea.maratonajava.javacore.introductionmethods.domain.printStudent;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        printStudent printer = new printStudent();

        student.name = "Arthur";
        student.age = 15;
        student.sex = 'M';

        student2.name = "Ana";
        student2.age = 12;
        student2.sex = 'F';

        student3.name = "Vítor";
        student3.age = 20;
        student3.sex = 'M';

        printer.print(student);

        printer.print(student2);

        printer.print(student3);
    }
}
