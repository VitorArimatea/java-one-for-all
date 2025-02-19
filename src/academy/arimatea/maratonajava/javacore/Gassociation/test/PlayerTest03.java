package academy.arimatea.maratonajava.javacore.Gassociation.test;

import academy.arimatea.maratonajava.javacore.Gassociation.domain.Player;
import academy.arimatea.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Neymar");
        Player player2 = new Player("Pelé");
        Player player3 = new Player("Maradona");
        Player player4 = new Player("Cafu");
        Player player5 = new Player("Hulk");
        Player player6 = new Player("Ganso");

        Player[] players = {player, player2, player3, player4, player5,
                player6};

        Team team = new Team("Brazil");

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("\n--- Player ---");
        player.print();
        player2.print();

        System.out.println("\n--- Team ---");
        team.print();
    }
}
