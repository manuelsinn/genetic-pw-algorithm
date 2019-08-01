import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Population {
    String best = "";

    public int gen = 1;

    List<String> individuals = new ArrayList<>();


    public Population(String[] individuals) {
        for(String individual : individuals) this.individuals.add(individual);
    }

    public Population(int size){
        for (int i = 0; i < size; i++) {
            individuals.add(spawnRandomBaby());
        }
    }

    private String spawnRandomBaby() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(getRandomLetter());
        }
        return sb.toString();
    }

    private char getRandomLetter() {
        return (char) (int) (Math.random() * 26 + 97);
    }
}
