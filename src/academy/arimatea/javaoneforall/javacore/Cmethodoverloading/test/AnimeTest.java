package academy.arimatea.javaoneforall.javacore.Cmethodoverloading.test;

import academy.arimatea.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "Mangá", 12);
        anime.init("One Piece", "TV", 1122, "Pirates");

        anime.print();
    }
}
