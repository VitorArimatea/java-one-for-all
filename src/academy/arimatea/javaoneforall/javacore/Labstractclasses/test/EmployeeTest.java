package academy.arimatea.javaoneforall.javacore.Labstractclasses.test;

import academy.arimatea.javaoneforall.javacore.Labstractclasses.domain.Designer;
import academy.arimatea.javaoneforall.javacore.Labstractclasses.domain.Developer;

public class EmployeeTest {
    public static void main(String[] args) {
        Developer developer = new Developer("Vítor", 20000, "Front-end With Angular");
        System.out.println(developer);

        Designer designer = new Designer("Arthur", 2500, "UX/UI Figma");
        System.out.println(designer);

        developer.print();
    }
}
