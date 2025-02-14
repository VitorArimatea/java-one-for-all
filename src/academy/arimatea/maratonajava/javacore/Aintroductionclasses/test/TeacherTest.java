package academy.arimatea.maratonajava.javacore.Aintroductionclasses.test;

import academy.arimatea.maratonajava.javacore.Aintroductionclasses.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Willian Suane";
        teacher.age = 35;
        teacher.sex = 'M';

        System.out.println("Teacher Name: " + teacher.name + " Age: " + teacher.age + " Sex: " + teacher.sex);
    }
}
