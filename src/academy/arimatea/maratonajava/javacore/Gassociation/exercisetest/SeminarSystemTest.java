package academy.arimatea.maratonajava.javacore.Gassociation.exercisetest;

import academy.arimatea.maratonajava.javacore.Gassociation.exercisedomain.Place;
import academy.arimatea.maratonajava.javacore.Gassociation.exercisedomain.Seminar;
import academy.arimatea.maratonajava.javacore.Gassociation.exercisedomain.Student;
import academy.arimatea.maratonajava.javacore.Gassociation.exercisedomain.Teacher;

import java.util.Scanner;

public class SeminarSystemTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter place address: ");
        String placeAddress = input.nextLine();

        Place place = new Place(placeAddress);

        System.out.println("Enter student name: ");
        String studentName = input.nextLine();

        System.out.println("Enter student age: ");
        short studentAge = input.nextShort();
        input.nextLine();

        Student student = new Student(studentName, studentAge);
        Student[] students = {student};

        System.out.println("Enter teacher name: ");
        String teacherName = input.nextLine();

        System.out.println("Enter teacher specialty: ");
        String teacherSpecialty = input.nextLine();

        System.out.println("Enter seminar name: ");
        String seminarTitle = input.nextLine();

        Seminar seminar = new Seminar(seminarTitle, place, students);

        System.out.println("Enter seminar name: ");
        String seminarTitle2 = input.nextLine();

        Seminar seminar2 = new Seminar(seminarTitle2, place, students);

        Seminar[] seminars = {seminar, seminar2};

        student.setSeminar(seminar);

        Teacher teacher = new Teacher(teacherName, teacherSpecialty,
                seminars);

        student.print();
        teacher.print();

        seminar.print();
        seminar2.print();

        input.close();
    }
}
