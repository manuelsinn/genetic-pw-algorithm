public class App {

    String solution;
    Population population;
    BruteForce bruteForce;

    Selection selection;
    Crossover crossover;
    Mutation mutation;

    /** sets up all variables (as seen above) needed for evolution algorithm. */
    private void setUp(String solution) {
        this.solution = solution;
        population = new Population(100, solution.length());     //OR: Population population = new Population(new String[]{"aaaaaaaa", "pppppppp", "passxxxx", "xxxxword", "abcdefgh", "ijklmnop", "qrstuvwx", "yzabcdef"});
        bruteForce = new BruteForce();

        selection = new TruncationSelection(solution);

        crossover = new UniformCrossover();
        crossover = new KPointCrossover(4, solution.length());

        mutation = new GaussianMutation(0.05);
    }

    /** basic genetic / evolutionary algorithm */
    public void runEvolution(){
        while(!population.best.equals(solution)) {
            selection.setBest(population);
            selection.naturalSelect(population);
            crossover.generateNewPopulation(population);
            mutation.mutate(population);
        }
    }



    public static void main(String[] args) {
        App app = new App();
        String solution = "loldatpasswordtho";
        app.setUp(solution);


        app.runEvolution();
        app.bruteForce.printNeededTriesForSolution(solution);
    }
}
