package academy.arimatea.javaoneforall.javacore.Dconstructors.test;

import academy.arimatea.javaoneforall.javacore.Dconstructors.domain.Game;

public class GameTest {
    public static void main(String[] args) {
        Game game = new Game("Silent Hill 2", "Horror", 349, "Bloober Team",
                "Konami");

        game.print();
    }
}
