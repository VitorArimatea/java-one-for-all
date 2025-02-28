package academy.arimatea.javaoneforall.javacore.Ioverride.test;

import academy.arimatea.javaoneforall.javacore.Ioverride.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer");
        System.out.println(anime);

        anime.setName("One piece");
        System.out.println(anime);
    }
}
