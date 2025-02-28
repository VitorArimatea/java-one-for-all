package academy.arimatea.javaoneforall.javacore.Gassociation.test;

import academy.arimatea.javaoneforall.javacore.Gassociation.domain.School;
import academy.arimatea.javaoneforall.javacore.Gassociation.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Willian");
        Teacher teacher2 = new Teacher("Salvador");
        Teacher[] teachers = {teacher, teacher2};

        School school = new School("Projeção", teachers);

        school.print();
    }
}
