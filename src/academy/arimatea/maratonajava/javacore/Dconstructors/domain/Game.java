package academy.arimatea.maratonajava.javacore.Dconstructors.domain;

public class Game {
    private String name;
    private String genre;
    private double value;
    private String studio;
    private String publisher;

    public Game(String name, String genre, double value) {
        this();
        this.name = name;
        this.genre = genre;
        this.value = value;
    }

    public Game(String name, String genre, double value, String studio) {
        this(name, genre, value);
        this.studio = studio;
    }

    public Game(String name, String genre, double value, String studio, String publisher) {
        this(name, genre, value, studio);
        this.publisher = publisher;
    }

    public Game() {
        System.out.println("Dentro do constructor vazio");
    }


    public void print() {
        System.out.println("Game name: " + this.name);
        System.out.println("Game genre: " + this.genre);
        System.out.println("Game value: " + "R$" + this.value);
        System.out.println("Game studio: " + this.studio);
        System.out.println("Game publisher: " + this.publisher);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}








