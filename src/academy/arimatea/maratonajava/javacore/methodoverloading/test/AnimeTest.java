package academy.arimatea.maratonajava.javacore.methodoverloading.test;

import academy.arimatea.maratonajava.javacore.methodoverloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "Mangá", 12);
        anime.init("One Piece", "TV", 1122, "Pirates");

        anime.print();
    }
}
