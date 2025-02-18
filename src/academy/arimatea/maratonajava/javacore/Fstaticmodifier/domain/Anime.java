package academy.arimatea.maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0 - The Initialization Block is executed when the JVM loads the class
    // 1 - Alocado espaço de memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Constructor é executado

    static {
        System.out.println("Inside Inicialization Block");

        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    static {
        System.out.println("Inside Static Inicialization Block 2");
    }
    static {
        System.out.println("Inside Static Inicialization Block 3");
    }

    {
        System.out.println("Inside NO Static Inicialization Block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for(int episode: Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }
}
