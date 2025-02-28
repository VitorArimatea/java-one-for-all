package academy.arimatea.javaoneforall.javacore.Gassociation.exercisedomain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Place place, Student[] student) {
        this.title = title;
        this.place = place;
        this.students = student;
    }

    public void print() {

        System.out.println("\n---- Seminar ----");

        System.out.println("Seminar Title: " + this.title);
        System.out.println("Seminar place: " + place.getAddress());

        if (place.getAddress() == null) {
            System.out.println("The seminar not have place");
        }

        if (students == null) {
            System.out.println("The seminar doesn't registered students.");
        } else {
            for (Student student : students) {
                System.out.println("Student: " + student.getName());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
