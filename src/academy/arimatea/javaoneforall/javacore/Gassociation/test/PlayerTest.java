package academy.arimatea.javaoneforall.javacore.Gassociation.test;

import academy.arimatea.javaoneforall.javacore.Gassociation.domain.Player;
import academy.arimatea.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Vini JR");
        Player player2 = new Player("Pelé");
        Player player3 = new Player("Maradona");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

        Team team = new Team("Brazil", players);

        team.print();
    }
}
