package academy.arimatea.maratonajava.javacore.Ioverride.test;

import academy.arimatea.maratonajava.javacore.Ioverride.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer");
        System.out.println(anime);

        anime.setName("One piece");
        System.out.println(anime);
    }
}
