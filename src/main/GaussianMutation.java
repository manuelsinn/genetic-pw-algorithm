import java.lang.reflect.Array;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;

public class GaussianMutation implements Mutation {
    double mutationRate;

    public GaussianMutation(double mutationRate) {
        this.mutationRate = mutationRate;
    }

    /**
     * randomly mutates a portion of the population
     */
    @Override
    public void mutate(Population population) {
        for (int populationIndex = 0; populationIndex < population.individuals.size(); populationIndex++) {

            String individual = randomlyMutateIndividual(population.individuals.get(populationIndex));

            population.individuals.set(populationIndex, individual);
        }
    }


    /**
     * randomly changes individual with probabilty mutationRate
     */
    public String randomlyMutateIndividual(String stringIndividual) {
        char[] individual = stringIndividual.toCharArray();

        for (int characterIndex = 0; characterIndex < individual.length; characterIndex++) {
            if (Math.random() < mutationRate)
                individual[characterIndex] = getRandomLetter();
        }

        return new String(individual);
    }


    private char getRandomLetter() {
        return (char) (int) (Math.random() * 26 + 97);
    }
}
