package academy.arimatea.maratonajava.javacore.Aintroductionclasses.test;

import academy.arimatea.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Vítor";
        student.age = 20;
        student.sex = 'M';
        System.out.println("Student name: " + student.name + "\n" + "Age: " + student.age + "\n" + "Sex: "
                + student.sex);

        System.out.println("-------------------------------------------");

        Student student2 = new Student();
        student2.name = "Marina";
        student2.age = 19;
        student2.sex = 'F';
        System.out.println("Student name: " + student2.name + "\n" + "Age: " + student2.age + "\n" + "Sex: "
                + student2.sex);

        System.out.println(student + "\n" + student2);
    }
}
