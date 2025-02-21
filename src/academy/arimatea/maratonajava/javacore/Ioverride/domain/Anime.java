package academy.arimatea.maratonajava.javacore.Ioverride.domain;

public class Anime {
    protected String name;

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
