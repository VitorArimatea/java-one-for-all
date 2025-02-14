package academy.arimatea.maratonajava.javacore.Einicializationblocks.test;

import academy.arimatea.maratonajava.javacore.Einicializationblocks.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
