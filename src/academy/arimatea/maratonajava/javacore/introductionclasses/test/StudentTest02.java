package academy.arimatea.maratonajava.javacore.introductionclasses.test;

import academy.arimatea.maratonajava.javacore.introductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        student.name = "Vítor";
        System.out.println(student.name);
    }
}
