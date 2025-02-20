package academy.arimatea.maratonajava.javacore.Hinheritance.test;

import academy.arimatea.maratonajava.javacore.Hinheritance.domain.Employee;

public class InheritanceTest02 {
    // 0 - The Static Initialization Block Super class is executed when the JVM loads the father class
    // 1 - The Static Initialization Block Sub Class is executed when the JVM loads the daughter class
    // 2 - Alocado espaço de memória para o objeto da classe pai
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Constructor é executado da superclasse
    // 6 - Alocado espaço de memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Constructor é executado da subclasse

    public static void main(String[] args) {
        Employee employee = new Employee("vitor");
    }
}
