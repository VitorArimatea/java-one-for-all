package academy.arimatea.javaoneforall.javacore.Einicializationblocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // 1 - Alocado espaço de memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Constructor é executado

    {
        System.out.println("Inside Inicialization Block");
        episodes = new int[153];

        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

    }

    public int[] getEpisodes() {
        return episodes;
    }
}
