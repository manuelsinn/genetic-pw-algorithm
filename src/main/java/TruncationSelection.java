import java.util.Comparator;
import java.util.List;

public class TruncationSelection implements Selection {
    /** only keeps the fittest 50% **/
    @Override
    public void naturalSelect(String solution, Population p) {
        System.out.println("The best 50% of the previous generation will be the next generation's parents.");
        List<String> individuals = p.individuals;

        individuals.sort(Comparator.comparingDouble(i -> calculateFitness(solution, i)));

        p.individuals.clear();
        for (int i = 0; i < individuals.size()/2; i++) {
            p.individuals.add(individuals.get(i));
        }
    }


    double calculateFitness(String sol, String individual){
        double fitness = 0;

        for (int i = 0; i < individual.length(); i++) {
            if(individual.toCharArray()[i] == sol.toCharArray()[i])
                fitness++;
        }

        return fitness;
    }

}
