package academy.arimatea.maratonajava.javacore.Gassociation.test;

import academy.arimatea.maratonajava.javacore.Gassociation.domain.Player;
import academy.arimatea.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Team team = new Team("Brazil");

        player.setTeam(team);

        player.print();
    }
}
