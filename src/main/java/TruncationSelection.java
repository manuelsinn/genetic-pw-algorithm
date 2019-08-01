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
    @Override
    public void naturalSelect(Population p) {
        List<String> individuals = new ArrayList<>(p.individuals);

        individuals.sort(Comparator.comparingDouble(this::calculateFitness).reversed());

        p.individuals.clear();
        for (int i = 0; i < individuals.size()/2; i++) {
            p.individuals.add(individuals.get(i));
        }
    }


    double calculateFitness(String individual){
        double fitness = 0;
        if(individual.length() == solution.length())
            for (int i = 0; i < individual.length(); i++)
                if (individual.toCharArray()[i] == solution.toCharArray()[i])
                    fitness++;
        fitness = fitness / solution.length();
        return fitness;
    }

    public void setBest(Population p){
        Optional<String> best = p.individuals.stream().max(Comparator.comparingDouble(this::calculateFitness));
        p.best = best.orElse("");
        System.out.println("Best of generation " + p.gen + ": " + p.best + " with fitness of " + calculateFitness(p.best));
    }

}
