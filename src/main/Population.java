import java.util.ArrayList;
import java.util.List;

/**
 * class offers overloaded constructors to deliver a population of individual passwords,
 * either from old population,
 * as defined in the given String array, or
 * with random individuals, all adhering to the specified length.
 */
public class Population {
    String best = "";

    public int gen = 1;

    List<String> individuals = new ArrayList<>();

    public Population(Population p){
        this.individuals = p.individuals;
    }

    public Population(String[] individuals) {
        for(String individual : individuals) this.individuals.add(individual);
    }

    public Population(int populationSize, int pwLength){
        for (int i = 0; i < populationSize; i++) {
            individuals.add(spawnRandomBaby(pwLength));
        }
    }

    private String spawnRandomBaby(int pwLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pwLength; i++) {
            sb.append(getRandomLetter());
        }
        return sb.toString();
    }

    private char getRandomLetter() {
        return (char) (int) (Math.random() * 26 + 97);
    }

    @Override
    public String toString() {
        return individuals.toString();
    }
}
