public abstract class Crossover {
    void makeBabies(Population p){
        // individuals are now half the original population
        int decimatedPopulationSize = p.individuals.size();

        if (decimatedPopulationSize <= 1){
            p.individuals.add(p.individuals.get(0));
        }

        for (int i = 0; i < decimatedPopulationSize; i++) {
            p.individuals.add(makeBaby(p.individuals.get(i), p.individuals.get(i+1)));
        }

        p.gen++;
    }

    public String makeBaby(String dad, String mum){
        return dad;
    }
}
