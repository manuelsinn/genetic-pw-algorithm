public class Main {



    public static void main(String[] args) {
        // SET UP --------------------------------------
        Selection selection = new TruncationSelection();
        Crossover crossover = new KPointCrossover(1);
        Mutation mutation = new GaussianMutation();

        Population population = new Population(new String[]{"aaaaaaaa", "pppppppp", "passxxxx", "xxxxword"});

        String solution = "password";

        // ---------------------------------------------

        while(!population.best.equals(solution)) {
            // select parents for next population (clears individuals and only adds best 50%)
            selection.naturalSelect(solution, population);

            // create babies to add to the new parent population
            crossover.makeBabies(population);

            // mutate some of these babies
            mutation.mutate(population);
        }
    }




}
