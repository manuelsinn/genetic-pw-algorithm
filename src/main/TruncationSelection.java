import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TruncationSelection implements Selection {
    String solution;

    public TruncationSelection(String solution){
        this.solution = solution;
    }

    /** only keeps the fittest 50% **/
    public void naturalSelect(Population population) {
        List<String> individuals = new ArrayList<>(population.individuals);

        individuals.sort(Comparator.comparingDouble(this::calculateFitness).reversed());

        population.individuals.clear();
        for (int i = 0; i < individuals.size()/2; i++) {
            population.individuals.add(individuals.get(i));
        }
    }

    /** calculates the fitness of an individual.
     * fitness is implicitly defined here as the proportion of letters that are the same in the solution (=correct), in percent */
    double calculateFitness(String individual){
        double fitness = 0;
        if(individual.length() == solution.length())
            for (int i = 0; i < individual.length(); i++)
                if (individual.toCharArray()[i] == solution.toCharArray()[i])
                    fitness++;
        fitness = fitness / solution.length();
        return fitness;
    }

    /** sets the populations best as the individual with greatest fitness, and prints it to the console. */
    public void setBest(Population p){
        Optional<String> best = p.individuals.stream().max(Comparator.comparingDouble(this::calculateFitness));
        p.best = best.orElse("");
        System.out.println("Best of generation " + p.gen + ": " + p.best + " with fitness of " + calculateFitness(p.best));
    }

}
