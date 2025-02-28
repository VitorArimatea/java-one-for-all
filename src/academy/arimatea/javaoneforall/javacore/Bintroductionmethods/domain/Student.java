package academy.arimatea.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public String name = "Student Default";
    public int age;
    public char sex;

    public void printStudent() {
        System.out.println("-----------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}
