public abstract class Crossover {
    int decimatedPopulationSize;
    Population population;

    /**
     * generates a new population, by going through the population and always pairing to parents to make a baby
     * @param population
     */
    void generateNewPopulation(Population population){
        this.population = population;
        decimatedPopulationSize = population.individuals.size(); // individuals are now half the original population

        ifPopulationIsOneAddClone();
        makeBabies();
        populationSetNewGeneration();
    }

    /** if population size is only one, a clone is made so we can generate a baby */
    private void ifPopulationIsOneAddClone() {
        if (decimatedPopulationSize == 1){
            population.individuals.add(population.individuals.get(0));
        }
    }

    /** actual reproduction: goes through all individuals and always pairs to to make a baby */
    private void makeBabies() {
        for (int i = 0; i < decimatedPopulationSize; i++) {
            population.individuals.add(makeBaby(population.individuals.get(i), population.individuals.get(i+1)));
        }
    }

    /** increases population generation by one, since we have made babies */
    private void populationSetNewGeneration() {
        population.gen++;
    }

    /** defines how a baby is made from mum and dad */
    public String makeBaby(String dad, String mum){
        return dad;
    }
}
