public class Main {

    // SET UP -------------------------------------------------
    static String solution = "password";
    static BruteForce bruteForce = new BruteForce();

    static Selection selection = new TruncationSelection(solution);
    //static Crossover crossover = new KPointCrossover(4);
    static Crossover crossover = new UniformCrossover();
    static Mutation mutation = new GaussianMutation();

    //Population population = new Population(new String[]{"aaaaaaaa", "pppppppp", "passxxxx", "xxxxword", "abcdefgh", "ijklmnop", "qrstuvwx", "yzabcdef"});
    static Population population = new Population(100);
    // ---------------------------------------------------------

    public static void main(String[] args) {

        while(!population.best.equals(solution)) {
            selection.setBest(population);

            selection.naturalSelect(population);
            crossover.makeBabies(population);

            mutation.mutate(population);
        }

        System.out.println("Needed tries with brute force: " + bruteForce.neededTriesForSolution(solution));
    }
}
